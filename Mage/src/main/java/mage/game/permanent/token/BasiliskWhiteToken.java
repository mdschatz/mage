package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class BasiliskWhiteToken extends TokenImpl {

    public BasiliskWhiteToken(int power_val, int toughness_val) {
        super("BasiliskWhite", "1/1 white Basilisk creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.BASILISK );
        power = new MageInt(power_val);
        toughness = new MageInt(toughness_val);
    }

    public BasiliskWhiteToken() {
        this(1, 1);
    }

    public BasiliskWhiteToken(final BasiliskWhiteToken token) {
        super(token);
    }

    public BasiliskWhiteToken copy() {
        return new BasiliskWhiteToken(this);
    }
}
