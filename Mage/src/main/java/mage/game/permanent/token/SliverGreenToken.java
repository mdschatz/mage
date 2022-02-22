package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class SliverGreenToken extends TokenImpl {

    public SliverGreenToken() {
        super("SliverGreen", "1/1 green Sliver creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.SLIVER );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public SliverGreenToken(final SliverGreenToken token) {
        super(token);
    }

    public SliverGreenToken copy() {
        return new SliverGreenToken(this);
    }
}
