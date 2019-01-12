
package mage.filter.predicate.permanent;

import mage.filter.predicate.Predicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.PermanentToken;

/**
 * @author North
 */
public enum TokenPredicate implements Predicate<Permanent> {
    instance;

    @Override
    public boolean apply(Permanent input, Game game) {
        return input instanceof PermanentToken;
    }

    @Override
    public String toString() {
        return "Token";
    }
}