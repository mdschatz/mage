package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class MyrWhiteToken extends TokenImpl {

    public MyrWhiteToken() {
        super("MyrWhite", "1/1 white Myr creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.MYR );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public MyrWhiteToken(final MyrWhiteToken token) {
        super(token);
    }

    public MyrWhiteToken copy() {
        return new MyrWhiteToken(this);
    }
}
