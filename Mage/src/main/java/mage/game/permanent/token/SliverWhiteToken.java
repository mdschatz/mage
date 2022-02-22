package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class SliverWhiteToken extends TokenImpl {

    public SliverWhiteToken() {
        super("SliverWhite", "1/1 white Sliver creature token");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.SLIVER );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public SliverWhiteToken(final SliverWhiteToken token) {
        super(token);
    }

    public SliverWhiteToken copy() {
        return new SliverWhiteToken(this);
    }
}
