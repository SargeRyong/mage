package mage.cards.l;

import mage.MageInt;
import mage.MageObjectReference;
import mage.abilities.Ability;
import mage.abilities.effects.RestrictionEffect;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.keyword.BattalionAbility;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.PermanentToken;

import java.util.UUID;

/**
 * @author Plopman
 */
public final class LegionLoyalist extends CardImpl {

    public LegionLoyalist(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}");
        this.subtype.add(SubType.GOBLIN);
        this.subtype.add(SubType.SOLDIER);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        //Haste
        this.addAbility(HasteAbility.getInstance());
        //Battalion - Whenever Legion Loyalist and at least two other creatures attack,
        //creatures you control gain first strike and trample until end of turn and can't be blocked by tokens this turn.
        Ability ability = new BattalionAbility(new GainAbilityAllEffect(FirstStrikeAbility.getInstance(), Duration.EndOfTurn, StaticFilters.FILTER_CONTROLLED_CREATURES)
                .setText("creatures you control gain first strike"));
        ability.addEffect(new GainAbilityAllEffect(TrampleAbility.getInstance(), Duration.EndOfTurn, StaticFilters.FILTER_CONTROLLED_CREATURES)
                .setText("and trample until end of turn"));
        ability.addEffect(new LegionLoyalistCantBeBlockedByTokensEffect());
        this.addAbility(ability);
    }

    private LegionLoyalist(final LegionLoyalist card) {
        super(card);
    }

    @Override
    public LegionLoyalist copy() {
        return new LegionLoyalist(this);
    }
}

class LegionLoyalistCantBeBlockedByTokensEffect extends RestrictionEffect {

    LegionLoyalistCantBeBlockedByTokensEffect() {
        super(Duration.EndOfTurn);
        staticText = "and can't be blocked by creature tokens this turn";
    }

    private LegionLoyalistCantBeBlockedByTokensEffect(final LegionLoyalistCantBeBlockedByTokensEffect effect) {
        super(effect);
    }

    @Override
    public void init(Ability source, Game game) {
        super.init(source, game);
        affectedObjectsSet = true;
        for (Permanent perm : game.getBattlefield().getActivePermanents(StaticFilters.FILTER_CONTROLLED_CREATURES, source.getControllerId(), source, game)) {
            affectedObjectList.add(new MageObjectReference(perm, game));
        }
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        return affectedObjectList.contains(new MageObjectReference(permanent, game));
    }

    @Override
    public boolean canBeBlocked(Permanent attacker, Permanent blocker, Ability source, Game game, boolean canUseChooseDialogs) {
        return !(blocker instanceof PermanentToken);
    }

    @Override
    public LegionLoyalistCantBeBlockedByTokensEffect copy() {
        return new LegionLoyalistCantBeBlockedByTokensEffect(this);
    }
}
