package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class FaerieGreenToken extends TokenImpl {

    public FaerieGreenToken() {
        super("FaerieGreen", "1/1 green Faerie creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.FAERIE );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public FaerieGreenToken(final FaerieGreenToken token) {
        super(token);
    }

    public FaerieGreenToken copy() {
        return new FaerieGreenToken(this);
    }
}
