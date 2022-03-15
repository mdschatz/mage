
package mage.cards.a;

import java.util.UUID;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.DamageControllerEffect;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;

/**
 * @author mschatz
 */
public final class AncientTombRainbow extends CardImpl {

    public AncientTombRainbow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.LAND},"");

        // Apply Prismatic Omen
        this.subtype.add(SubType.PLAINS);
        this.subtype.add(SubType.ISLAND);
        this.subtype.add(SubType.SWAMP);
        this.subtype.add(SubType.MOUNTAIN);
        this.subtype.add(SubType.FOREST);

        // {tap}: Add . Ancient Tomb Rainbow deals 2 damage to you.
        Ability ability = new SimpleManaAbility(Zone.BATTLEFIELD, Mana.ColorlessMana(2), new TapSourceCost());
        ability.addEffect(new DamageControllerEffect(2));
        this.addAbility(ability);
    }

    private AncientTombRainbow(final AncientTombRainbow card) {
        super(card);
    }

    @Override
    public AncientTombRainbow copy() {
        return new AncientTombRainbow(this);
    }
}
