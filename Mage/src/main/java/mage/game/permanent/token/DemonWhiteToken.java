package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class DemonWhiteToken extends TokenImpl {

    public DemonWhiteToken() {
        super("DemonWhite", "1/1 white Demon creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.DEMON );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public DemonWhiteToken(final DemonWhiteToken token) {
        super(token);
    }

    public DemonWhiteToken copy() {
        return new DemonWhiteToken(this);
    }
}
