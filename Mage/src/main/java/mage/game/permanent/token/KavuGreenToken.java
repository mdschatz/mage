package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class KavuGreenToken extends TokenImpl {

    public KavuGreenToken() {
        super("KavuGreen", "1/1 green Kavu creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.KAVU );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public KavuGreenToken(final KavuGreenToken token) {
        super(token);
    }

    public KavuGreenToken copy() {
        return new KavuGreenToken(this);
    }
}
