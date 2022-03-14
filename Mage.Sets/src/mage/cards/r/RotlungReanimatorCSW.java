
package mage.cards.r;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.DiesThisOrAnotherCreatureTriggeredAbility;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.permanent.token.SliverWhiteToken;

/**
 *
 * @author mschatz
 */
public final class RotlungReanimatorCSW extends CardImpl {
    
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("{this} or another Cephalid");
    
    static {
        filter.add(SubType.CLERIC.getPredicate());
    }

    public RotlungReanimatorCSW(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{B}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.CLERIC);

        // Absorb initial Dread of Night Black
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // Apply Prismatic Lace
        this.color.setBlack(true);
        this.color.setGreen(true);
        this.color.setRed(true);
        this.color.setWhite(true);

        // Whenever Rotlung Reanimator or another Cephalid dies, create a 2/2 white Sliver creature token.
        this.addAbility(new DiesThisOrAnotherCreatureTriggeredAbility(new CreateTokenEffect(new SliverWhiteToken()), false, filter));
    }

    private RotlungReanimatorCSW(final RotlungReanimatorCSW card) {
        super(card);
    }

    @Override
    public RotlungReanimatorCSW copy() {
        return new RotlungReanimatorCSW(this);
    }
}
