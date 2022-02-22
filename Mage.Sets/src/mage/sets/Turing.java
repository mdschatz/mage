package mage.sets;

import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public final class Turing extends ExpansionSet {

    private static final Turing instance = new Turing();

    public static Turing getInstance() {
        return instance;
    }

    private Turing() {
        super("Turing", "TNG", ExpansionSet.buildDate(2022, 2, 19), SetType.EXPANSION);
        this.blockName = "Turing";
        this.hasBoosters = false;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 0;
        this.numBoosterUncommon = 0;
        this.numBoosterRare = 0;
        this.ratioBoosterMythic = 0;
	cards.add(new SetCardInfo("RotlungReanimator Aetherborn-Sliver-White", 1, Rarity.COMMON, mage.cards.r.RotlungReanimatorASW.class));
	cards.add(new SetCardInfo("RotlungReanimator Basilisk-Elf-Green", 2, Rarity.COMMON, mage.cards.r.RotlungReanimatorBEG.class));
	cards.add(new SetCardInfo("RotlungReanimator Cephalid-Sliver-White", 3, Rarity.COMMON, mage.cards.r.RotlungReanimatorCSW.class));
	cards.add(new SetCardInfo("RotlungReanimator Demon-Aetherborn-Green", 4, Rarity.COMMON, mage.cards.r.RotlungReanimatorDAG.class));
	cards.add(new SetCardInfo("RotlungReanimator Elf-Demon-White", 5, Rarity.COMMON, mage.cards.r.RotlungReanimatorEDW.class));
	cards.add(new SetCardInfo("RotlungReanimator Faerie-Green-Harpy", 6, Rarity.COMMON, mage.cards.r.RotlungReanimatorFHG.class));
	cards.add(new SetCardInfo("RotlungReanimator Giant-Green-Juggernaut", 7, Rarity.COMMON, mage.cards.r.RotlungReanimatorGJG.class));
	cards.add(new SetCardInfo("RotlungReanimator Harpy-White-Faerie", 8, Rarity.COMMON, mage.cards.r.RotlungReanimatorHFW.class));
	cards.add(new SetCardInfo("RotlungReanimator Illusion-Green-Faerie", 9, Rarity.COMMON, mage.cards.r.RotlungReanimatorIFG.class));
	cards.add(new SetCardInfo("RotlungReanimator Juggernaut-White-Illusion", 10, Rarity.COMMON, mage.cards.r.RotlungReanimatorJIW.class));
	cards.add(new SetCardInfo("RotlungReanimator Noggle-Green-Orc", 11, Rarity.COMMON, mage.cards.r.RotlungReanimatorNOG.class));
	cards.add(new SetCardInfo("RotlungReanimator Orc-White-Pegasus", 12, Rarity.COMMON, mage.cards.r.RotlungReanimatorOPW.class));
	cards.add(new SetCardInfo("RotlungReanimator Rhino-Blue-Assassin", 13, Rarity.COMMON, mage.cards.r.RotlungReanimatorRAB.class));
	cards.add(new SetCardInfo("RotlungReanimator Sliver-Green-Cephalid", 14, Rarity.COMMON, mage.cards.r.RotlungReanimatorSCG.class));
	cards.add(new SetCardInfo("RotlungReanimator Aetherborn-Green-Cephalid", 15, Rarity.COMMON, mage.cards.r.RotlungReanimatorACG.class));
	cards.add(new SetCardInfo("RotlungReanimator Basilisk-Green-Cephalid", 16, Rarity.COMMON, mage.cards.r.RotlungReanimatorBCG.class));
	cards.add(new SetCardInfo("RotlungReanimator Cephalid-White-Basilisk", 17, Rarity.COMMON, mage.cards.r.RotlungReanimatorCBW.class));
	cards.add(new SetCardInfo("RotlungReanimator Demon-Green-Elf", 18, Rarity.COMMON, mage.cards.r.RotlungReanimatorDEG.class));
	cards.add(new SetCardInfo("RotlungReanimator Elf-White-Aetherborn", 19, Rarity.COMMON, mage.cards.r.RotlungReanimatorEAW.class));
	cards.add(new SetCardInfo("RotlungReanimator Giant-Green-Harpy", 20, Rarity.COMMON, mage.cards.r.RotlungReanimatorGHG.class));
	cards.add(new SetCardInfo("RotlungReanimator Harpy-White-Giant", 21, Rarity.COMMON, mage.cards.r.RotlungReanimatorHGW.class));
	cards.add(new SetCardInfo("RotlungReanimator Illusion-Green-Juggernaut", 22, Rarity.COMMON, mage.cards.r.RotlungReanimatorIJG.class));
	cards.add(new SetCardInfo("RotlungReanimator Juggernaut-White-Giant", 23, Rarity.COMMON, mage.cards.r.RotlungReanimatorJGW.class));
	cards.add(new SetCardInfo("RotlungReanimator Leviathan-Green-Juggernaut", 24, Rarity.COMMON, mage.cards.r.RotlungReanimatorLJG.class));
	cards.add(new SetCardInfo("RotlungReanimator Myr-Green-Orc", 25, Rarity.COMMON, mage.cards.r.RotlungReanimatorMOG.class));
	cards.add(new SetCardInfo("RotlungReanimator Noggle-Green-Orc", 26, Rarity.COMMON, mage.cards.r.RotlungReanimatorNOG.class));
	cards.add(new SetCardInfo("RotlungReanimator Orc-White-Noggle", 27, Rarity.COMMON, mage.cards.r.RotlungReanimatorONW.class));
	cards.add(new SetCardInfo("RotlungReanimator Pegasus-Green-Sliver", 28, Rarity.COMMON, mage.cards.r.RotlungReanimatorPSG.class));
	cards.add(new SetCardInfo("RotlungReanimator Sliver-White-Myr", 29, Rarity.COMMON, mage.cards.r.RotlungReanimatorSMW.class));

	cards.add(new SetCardInfo("XathridNecromancer Kavu-White-Leviathan", 30, Rarity.COMMON, mage.cards.x.XathridNecromancerKLW.class));
	cards.add(new SetCardInfo("XathridNecromancer Leviathan-White-Illusion", 31, Rarity.COMMON, mage.cards.x.XathridNecromancerLIW.class));
	cards.add(new SetCardInfo("XathridNecromancer Myr-White-Basilisk", 32, Rarity.COMMON, mage.cards.x.XathridNecromancerMBW.class));
	cards.add(new SetCardInfo("XathridNecromancer Pegasus-Green-Rhino", 33, Rarity.COMMON, mage.cards.x.XathridNecromancerPRG.class));
	cards.add(new SetCardInfo("XathridNecromancer Faerie-Green-Kavu", 34, Rarity.COMMON, mage.cards.x.XathridNecromancerFKG.class));
	cards.add(new SetCardInfo("XathridNecromancer Kavu-Green-Faerie", 35, Rarity.COMMON, mage.cards.x.XathridNecromancerKFG.class));
	cards.add(new SetCardInfo("XathridNecromancer Rhino-White-Sliver", 36, Rarity.COMMON, mage.cards.x.XathridNecromancerRSW.class));
    }
}
