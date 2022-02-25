package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class LhurgoyfGreenToken extends TokenImpl {

    public LhurgoyfGreenToken() {
        super("LhurgoyfGreen", "1/1 green Lhurgoyf creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.LHURGOYF );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public LhurgoyfGreenToken(final LhurgoyfGreenToken token) {
        super(token);
    }

    public LhurgoyfGreenToken copy() {
        return new LhurgoyfGreenToken(this);
    }
}
