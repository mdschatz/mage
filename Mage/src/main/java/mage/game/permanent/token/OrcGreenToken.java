package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class OrcGreenToken extends TokenImpl {

    public OrcGreenToken() {
        super("OrcGreen", "1/1 green Orc creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.ORC );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public OrcGreenToken(final OrcGreenToken token) {
        super(token);
    }

    public OrcGreenToken copy() {
        return new OrcGreenToken(this);
    }
}
