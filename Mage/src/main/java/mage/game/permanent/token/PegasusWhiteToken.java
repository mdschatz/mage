package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class PegasusWhiteToken extends TokenImpl {

    public PegasusWhiteToken() {
        super("PegasusWhite", "1/1 white Pegasus creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.PEGASUS );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public PegasusWhiteToken(final PegasusWhiteToken token) {
        super(token);
    }

    public PegasusWhiteToken copy() {
        return new PegasusWhiteToken(this);
    }
}
