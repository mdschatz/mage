package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class IllusionWhiteToken extends TokenImpl {

    public IllusionWhiteToken() {
        super("IllusionWhite", "1/1 white Illusion creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.ILLUSION );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public IllusionWhiteToken(final IllusionWhiteToken token) {
        super(token);
    }

    public IllusionWhiteToken copy() {
        return new IllusionWhiteToken(this);
    }
}
