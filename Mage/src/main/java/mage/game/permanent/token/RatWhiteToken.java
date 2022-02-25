package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class RatWhiteToken extends TokenImpl {

    public RatWhiteToken() {
        super("RatWhite", "1/1 white Rat creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.RAT );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public RatWhiteToken(final RatWhiteToken token) {
        super(token);
    }

    public RatWhiteToken copy() {
        return new RatWhiteToken(this);
    }
}
