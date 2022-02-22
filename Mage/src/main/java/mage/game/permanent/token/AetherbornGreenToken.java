package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class AetherbornGreenToken extends TokenImpl {

    public AetherbornGreenToken() {
        super("AetherbornGreen", "1/1 green Aetherborn creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.AETHERBORN );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public AetherbornGreenToken(final AetherbornGreenToken token) {
        super(token);
    }

    public AetherbornGreenToken copy() {
        return new AetherbornGreenToken(this);
    }
}
