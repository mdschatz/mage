package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class AetherbornWhiteToken extends TokenImpl {

    public AetherbornWhiteToken() {
        super("AetherbornWhite", "1/1 white Aetherborn creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.AETHERBORN );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public AetherbornWhiteToken(final AetherbornWhiteToken token) {
        super(token);
    }

    public AetherbornWhiteToken copy() {
        return new AetherbornWhiteToken(this);
    }
}
