package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class HarpyGreenToken extends TokenImpl {

    public HarpyGreenToken() {
        super("HarpyGreen", "1/1 green Harpy creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.HARPY );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public HarpyGreenToken(final HarpyGreenToken token) {
        super(token);
    }

    public HarpyGreenToken copy() {
        return new HarpyGreenToken(this);
    }
}
