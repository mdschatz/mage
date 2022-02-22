package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class NoggleWhiteToken extends TokenImpl {

    public NoggleWhiteToken() {
        super("NoggleWhite", "1/1 white Noggle creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.NOGGLE );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public NoggleWhiteToken(final NoggleWhiteToken token) {
        super(token);
    }

    public NoggleWhiteToken copy() {
        return new NoggleWhiteToken(this);
    }
}
