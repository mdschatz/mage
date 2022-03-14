
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
import mage.game.permanent.token.OrcGreenToken;

/**
 *
 * @author mschatz
 */
public final class RotlungReanimatorNOG extends CardImpl {
    
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("{this} or another Noggle");
    
    static {
        filter.add(SubType.CLERIC.getPredicate());
    }

    public RotlungReanimatorNOG(UUID ownerId, CardSetInfo setInfo) {
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

        // Whenever Rotlung Reanimator or another Noggle dies, create a 2/2 green Orc creature token.
        this.addAbility(new DiesThisOrAnotherCreatureTriggeredAbility(new CreateTokenEffect(new OrcGreenToken()), false, filter));
    }

    private RotlungReanimatorNOG(final RotlungReanimatorNOG card) {
        super(card);
    }

    @Override
    public RotlungReanimatorNOG copy() {
        return new RotlungReanimatorNOG(this);
    }
}
