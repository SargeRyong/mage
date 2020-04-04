package mage.abilities.condition.common;

import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.constants.CommanderCardType;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.Collection;
import java.util.Objects;

/**
 * @author TheElk801
 */
public enum ControlACommanderCondition implements Condition {
    instance;

    @Override
    public boolean apply(Game game, Ability source) {
        return game.getPlayerList()
                .stream()
                .map(game::getPlayer)
                .filter(Objects::nonNull)
                .map(player -> game.getCommandersIds(player, CommanderCardType.COMMANDER_OR_OATHBREAKER))
                .flatMap(Collection::stream)
                .map(game::getPermanent)
                .map(Permanent::getControllerId)
                .anyMatch(source.getControllerId()::equals);
    }

    @Override
    public String toString() {
        return "If you control a commander";
    }
}
