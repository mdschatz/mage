package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class FaerieWhiteToken extends TokenImpl {

    public FaerieWhiteToken() {
        super("FaerieWhite", "1/1 white Faerie creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.FAERIE );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public FaerieWhiteToken(final FaerieWhiteToken token) {
        super(token);
    }

    public FaerieWhiteToken copy() {
        return new FaerieWhiteToken(this);
    }
}
