package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author mschatz
 */
public final class ElfGreenToken extends TokenImpl {

    public ElfGreenToken() {
        super("ElfGreen", "1/1 green Elf creature token");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.ELF );
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public ElfGreenToken(final ElfGreenToken token) {
        super(token);
    }

    public ElfGreenToken copy() {
        return new ElfGreenToken(this);
    }
}
