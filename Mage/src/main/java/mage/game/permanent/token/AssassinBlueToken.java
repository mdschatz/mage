package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class AssassinBlueToken extends TokenImpl {

    public AssassinBlueToken() {
        super("AssassinBlue", "1/1 blue Assassin creature token");
        cardType.add(CardType.CREATURE);
        color.setBlue(true);
        subtype.add(SubType.ASSASSIN );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public AssassinBlueToken(final AssassinBlueToken token) {
        super(token);
    }

    public AssassinBlueToken copy() {
        return new AssassinBlueToken(this);
    }
}
