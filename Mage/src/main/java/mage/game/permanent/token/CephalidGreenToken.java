package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class CephalidGreenToken extends TokenImpl {

    public CephalidGreenToken() {
        super("CephalidGreen", "1/1 green Cephalid creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.CEPHALID );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public CephalidGreenToken(final CephalidGreenToken token) {
        super(token);
    }

    public CephalidGreenToken copy() {
        return new CephalidGreenToken(this);
    }
}
