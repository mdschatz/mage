
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
import mage.game.permanent.token.AetherbornWhiteToken;

/**
 *
 * @author mschatz
 */
public final class RotlungReanimatorEAW extends CardImpl {
    
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("{this} or another Elf");
    
    static {
        filter.add(SubType.CLERIC.getPredicate());
    }

    public RotlungReanimatorEAW(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{B}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.CLERIC);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Whenever Rotlung Reanimator or another Elf dies, create a 2/2 white Aetherborn creature token.
        this.addAbility(new DiesThisOrAnotherCreatureTriggeredAbility(new CreateTokenEffect(new AetherbornWhiteToken()), false, filter));
    }

    private RotlungReanimatorEAW(final RotlungReanimatorEAW card) {
        super(card);
    }

    @Override
    public RotlungReanimatorEAW copy() {
        return new RotlungReanimatorEAW(this);
    }
}
