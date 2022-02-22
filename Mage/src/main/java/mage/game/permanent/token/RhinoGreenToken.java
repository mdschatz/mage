package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class RhinoGreenToken extends TokenImpl {

    public RhinoGreenToken() {
        super("RhinoGreen", "1/1 green Rhino creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.RHINO );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public RhinoGreenToken(final RhinoGreenToken token) {
        super(token);
    }

    public RhinoGreenToken copy() {
        return new RhinoGreenToken(this);
    }
}
