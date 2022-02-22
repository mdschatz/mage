package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class LeviathanWhiteToken extends TokenImpl {

    public LeviathanWhiteToken() {
        super("LeviathanWhite", "1/1 white Leviathan creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.LEVIATHAN );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public LeviathanWhiteToken(final LeviathanWhiteToken token) {
        super(token);
    }

    public LeviathanWhiteToken copy() {
        return new LeviathanWhiteToken(this);
    }
}
