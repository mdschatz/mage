
package mage.cards.x;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DiesThisOrAnotherCreatureTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.permanent.token.KavuGreenToken;

/**
 *
 * @author mschatz
 */
public final class XathridNecromancerFKG extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("Faerie creature you control");

    static {
        filter.add(TargetController.YOU.getControllerPredicate());
        filter.add(SubType.HUMAN.getPredicate());
    }

    public XathridNecromancerFKG(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{B}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Whenever Xathrid Necromancer or another Faerie creature you control dies, create a tapped 2/2 green Kavu creature token.
        Effect effect = new CreateTokenEffect(new KavuGreenToken(), 1, true, false);
        Ability ability = new DiesThisOrAnotherCreatureTriggeredAbility(effect, false, filter);
        this.addAbility(ability);

    }

    private XathridNecromancerFKG(final XathridNecromancerFKG card) {
        super(card);
    }

    @Override
    public XathridNecromancerFKG copy() {
        return new XathridNecromancerFKG(this);
    }
}
