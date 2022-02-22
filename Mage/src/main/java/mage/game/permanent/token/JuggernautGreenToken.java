package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class JuggernautGreenToken extends TokenImpl {

    public JuggernautGreenToken() {
        super("JuggernautGreen", "1/1 green Juggernaut creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.JUGGERNAUT);
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public JuggernautGreenToken(final JuggernautGreenToken token) {
        super(token);
    }

    public JuggernautGreenToken copy() {
        return new JuggernautGreenToken(this);
    }
}
