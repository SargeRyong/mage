/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.planechase;

import java.util.UUID;

import mage.Constants;
import mage.Constants.CardType;
import mage.Constants.Rarity;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.effects.common.continious.BoostTargetEffect;
import mage.abilities.effects.common.continious.GainAbilityAllEffect;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author Loki, nantuko
 */
public class FiresOfYavimaya extends CardImpl<FiresOfYavimaya> {

    private final static FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent("Creatures you control");

    static {
        filter.setTargetController(Constants.TargetController.YOU);
    }

    public FiresOfYavimaya(UUID ownerId) {
        super(ownerId, 87, "Fires of Yavimaya", Rarity.UNCOMMON, new CardType[]{CardType.ENCHANTMENT}, "{1}{R}{G}");
        this.expansionSetCode = "HOP";
        this.color.setRed(true);
        this.color.setGreen(true);
        this.addAbility(new SimpleStaticAbility(Constants.Zone.BATTLEFIELD, new GainAbilityAllEffect(HasteAbility.getInstance(), Constants.Duration.WhileOnBattlefield, filter, false)));
        Ability ability = new SimpleActivatedAbility(Constants.Zone.BATTLEFIELD, new BoostTargetEffect(2, 2, Constants.Duration.EndOfTurn), new SacrificeSourceCost());
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public FiresOfYavimaya(final FiresOfYavimaya card) {
        super(card);
    }

    @Override
    public FiresOfYavimaya copy() {
        return new FiresOfYavimaya(this);
    }
}
