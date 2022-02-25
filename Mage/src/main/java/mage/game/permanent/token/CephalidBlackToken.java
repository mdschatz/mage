package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class CephalidBlackToken extends TokenImpl {

    public CephalidBlackToken() {
        super("CephalidBlack", "1/1 black Cephalid creature token");
        cardType.add(CardType.CREATURE);
        color.setBlack(true);
        subtype.add(SubType.CEPHALID );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public CephalidBlackToken(final CephalidBlackToken token) {
        super(token);
    }

    public CephalidBlackToken copy() {
        return new CephalidBlackToken(this);
    }
}
