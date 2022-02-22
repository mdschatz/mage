
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
import mage.game.permanent.token.SliverWhiteToken;

/**
 *
 * @author mschatz
 */
public final class XathridNecromancerRSW extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("Rhino creature you control");

    static {
        filter.add(TargetController.YOU.getControllerPredicate());
        filter.add(SubType.HUMAN.getPredicate());
    }

    public XathridNecromancerRSW(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{B}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Whenever Xathrid Necromancer or another Rhino creature you control dies, create a tapped 2/2 white Sliver creature token.
        Effect effect = new CreateTokenEffect(new SliverWhiteToken(), 1, true, false);
        Ability ability = new DiesThisOrAnotherCreatureTriggeredAbility(effect, false, filter);
        this.addAbility(ability);

    }

    private XathridNecromancerRSW(final XathridNecromancerRSW card) {
        super(card);
    }

    @Override
    public XathridNecromancerRSW copy() {
        return new XathridNecromancerRSW(this);
    }
}
