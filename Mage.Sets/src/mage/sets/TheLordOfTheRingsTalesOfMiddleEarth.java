package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public final class TheLordOfTheRingsTalesOfMiddleEarth extends ExpansionSet {

    private static final TheLordOfTheRingsTalesOfMiddleEarth instance = new TheLordOfTheRingsTalesOfMiddleEarth();

    public static TheLordOfTheRingsTalesOfMiddleEarth getInstance() {
        return instance;
    }

    private TheLordOfTheRingsTalesOfMiddleEarth() {
        super("The Lord of the Rings: Tales of Middle-earth", "LTR", ExpansionSet.buildDate(2023, 6, 23), SetType.SUPPLEMENTAL_MODERN_LEGAL);
        this.blockName = "The Lord of the Rings: Tales of Middle-earth";
        this.hasBasicLands = true;
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Anduril, Flame of the West", 236, Rarity.MYTHIC, mage.cards.a.AndurilFlameOfTheWest.class));
        cards.add(new SetCardInfo("Aragorn and Arwen, Wed", 287, Rarity.MYTHIC, mage.cards.a.AragornAndArwenWed.class));
        cards.add(new SetCardInfo("Aragorn, Company Leader", 191, Rarity.RARE, mage.cards.a.AragornCompanyLeader.class));
        cards.add(new SetCardInfo("Aragorn, the Uniter", 192, Rarity.MYTHIC, mage.cards.a.AragornTheUniter.class));
        cards.add(new SetCardInfo("Arwen Undomiel", 194, Rarity.UNCOMMON, mage.cards.a.ArwenUndomiel.class));
        cards.add(new SetCardInfo("Arwen's Gift", 39, Rarity.COMMON, mage.cards.a.ArwensGift.class));
        cards.add(new SetCardInfo("Arwen, Mortal Queen", 193, Rarity.MYTHIC, mage.cards.a.ArwenMortalQueen.class));
        cards.add(new SetCardInfo("Assault on Osgiliath", 285, Rarity.RARE, mage.cards.a.AssaultOnOsgiliath.class));
        cards.add(new SetCardInfo("Bag End Porter", 153, Rarity.COMMON, mage.cards.b.BagEndPorter.class));
        cards.add(new SetCardInfo("Banish from Edoras", 1, Rarity.COMMON, mage.cards.b.BanishFromEdoras.class));
        cards.add(new SetCardInfo("Barad-dur", 253, Rarity.RARE, mage.cards.b.BaradDur.class));
        cards.add(new SetCardInfo("Barrow-Blade", 237, Rarity.UNCOMMON, mage.cards.b.BarrowBlade.class));
        cards.add(new SetCardInfo("Battle-Scarred Goblin", 115, Rarity.COMMON, mage.cards.b.BattleScarredGoblin.class));
        cards.add(new SetCardInfo("Bilbo's Ring", 298, Rarity.RARE, mage.cards.b.BilbosRing.class));
        cards.add(new SetCardInfo("Bilbo, Retired Burglar", 196, Rarity.UNCOMMON, mage.cards.b.BilboRetiredBurglar.class));
        cards.add(new SetCardInfo("Bill the Pony", 3, Rarity.UNCOMMON, mage.cards.b.BillThePony.class));
        cards.add(new SetCardInfo("Birthday Escape", 43, Rarity.COMMON, mage.cards.b.BirthdayEscape.class));
        cards.add(new SetCardInfo("Bitter Downfall", 77, Rarity.UNCOMMON, mage.cards.b.BitterDownfall.class));
        cards.add(new SetCardInfo("Bombadil's Song", 154, Rarity.COMMON, mage.cards.b.BombadilsSong.class));
        cards.add(new SetCardInfo("Book of Mazarbul", 116, Rarity.UNCOMMON, mage.cards.b.BookOfMazarbul.class));
        cards.add(new SetCardInfo("Borne Upon a Wind", 44, Rarity.RARE, mage.cards.b.BorneUponAWind.class));
        cards.add(new SetCardInfo("Boromir, Warden of the Tower", 4, Rarity.RARE, mage.cards.b.BoromirWardenOfTheTower.class));
        cards.add(new SetCardInfo("Brandywine Farmer", 155, Rarity.COMMON, mage.cards.b.BrandywineFarmer.class));
        cards.add(new SetCardInfo("Breaking of the Fellowship", 117, Rarity.COMMON, mage.cards.b.BreakingOfTheFellowship.class));
        cards.add(new SetCardInfo("Butterbur, Bree Innkeeper", 197, Rarity.UNCOMMON, mage.cards.b.ButterburBreeInnkeeper.class));
        cards.add(new SetCardInfo("Call of the Ring", 79, Rarity.RARE, mage.cards.c.CallOfTheRing.class));
        cards.add(new SetCardInfo("Captain of Umbar", 45, Rarity.COMMON, mage.cards.c.CaptainOfUmbar.class));
        cards.add(new SetCardInfo("Cast into the Fire", 118, Rarity.COMMON, mage.cards.c.CastIntoTheFire.class));
        cards.add(new SetCardInfo("Celeborn the Wise", 156, Rarity.UNCOMMON, mage.cards.c.CelebornTheWise.class));
        cards.add(new SetCardInfo("Chance-Met Elves", 157, Rarity.COMMON, mage.cards.c.ChanceMetElves.class));
        cards.add(new SetCardInfo("Cirith Ungol Patrol", 80, Rarity.COMMON, mage.cards.c.CirithUngolPatrol.class));
        cards.add(new SetCardInfo("Claim the Precious", 81, Rarity.COMMON, mage.cards.c.ClaimThePrecious.class));
        cards.add(new SetCardInfo("Council's Deliberation", 46, Rarity.UNCOMMON, mage.cards.c.CouncilsDeliberation.class));
        cards.add(new SetCardInfo("Dawn of a New Age", 5, Rarity.MYTHIC, mage.cards.d.DawnOfANewAge.class));
        cards.add(new SetCardInfo("Deceive the Messenger", 47, Rarity.COMMON, mage.cards.d.DeceiveTheMessenger.class));
        cards.add(new SetCardInfo("Delighted Halfling", 158, Rarity.RARE, mage.cards.d.DelightedHalfling.class));
        cards.add(new SetCardInfo("Denethor, Ruling Steward", 198, Rarity.UNCOMMON, mage.cards.d.DenethorRulingSteward.class));
        cards.add(new SetCardInfo("Display of Power", 119, Rarity.RARE, mage.cards.d.DisplayOfPower.class));
        cards.add(new SetCardInfo("Doors of Durin", 199, Rarity.RARE, mage.cards.d.DoorsOfDurin.class));
        cards.add(new SetCardInfo("Dreadful as the Storm", 48, Rarity.COMMON, mage.cards.d.DreadfulAsTheStorm.class));
        cards.add(new SetCardInfo("Dunedain Blade", 6, Rarity.COMMON, mage.cards.d.DunedainBlade.class));
        cards.add(new SetCardInfo("Dunedain Rangers", 159, Rarity.UNCOMMON, mage.cards.d.DunedainRangers.class));
        cards.add(new SetCardInfo("Dunland Crebain", 82, Rarity.COMMON, mage.cards.d.DunlandCrebain.class));
        cards.add(new SetCardInfo("Eagles of the North", 7, Rarity.COMMON, mage.cards.e.EaglesOfTheNorth.class));
        cards.add(new SetCardInfo("East-Mark Cavalier", 9, Rarity.COMMON, mage.cards.e.EastMarkCavalier.class));
        cards.add(new SetCardInfo("Easterling Vanguard", 83, Rarity.COMMON, mage.cards.e.EasterlingVanguard.class));
        cards.add(new SetCardInfo("Eastfarthing Farmer", 8, Rarity.COMMON, mage.cards.e.EastfarthingFarmer.class));
        cards.add(new SetCardInfo("Elanor Gardner", 286, Rarity.RARE, mage.cards.e.ElanorGardner.class));
        cards.add(new SetCardInfo("Elrond, Lord of Rivendell", 49, Rarity.UNCOMMON, mage.cards.e.ElrondLordOfRivendell.class));
        cards.add(new SetCardInfo("Elrond, Master of Healing", 200, Rarity.RARE, mage.cards.e.ElrondMasterOfHealing.class));
        cards.add(new SetCardInfo("Elven Chorus", 160, Rarity.RARE, mage.cards.e.ElvenChorus.class));
        cards.add(new SetCardInfo("Elven Farsight", 161, Rarity.COMMON, mage.cards.e.ElvenFarsight.class));
        cards.add(new SetCardInfo("Elvish Mariner", 283, Rarity.RARE, mage.cards.e.ElvishMariner.class));
        cards.add(new SetCardInfo("Enraged Huorn", 162, Rarity.COMMON, mage.cards.e.EnragedHuorn.class));
        cards.add(new SetCardInfo("Ent's Fury", 164, Rarity.COMMON, mage.cards.e.EntsFury.class));
        cards.add(new SetCardInfo("Ent-Draught Basin", 238, Rarity.UNCOMMON, mage.cards.e.EntDraughtBasin.class));
        cards.add(new SetCardInfo("Entish Restoration", 163, Rarity.UNCOMMON, mage.cards.e.EntishRestoration.class));
        cards.add(new SetCardInfo("Eomer of the Riddermark", 121, Rarity.UNCOMMON, mage.cards.e.EomerOfTheRiddermark.class));
        cards.add(new SetCardInfo("Eowyn, Fearless Knight", 201, Rarity.RARE, mage.cards.e.EowynFearlessKnight.class));
        cards.add(new SetCardInfo("Eowyn, Lady of Rohan", 10, Rarity.UNCOMMON, mage.cards.e.EowynLadyOfRohan.class));
        cards.add(new SetCardInfo("Erebor Flamesmith", 122, Rarity.COMMON, mage.cards.e.EreborFlamesmith.class));
        cards.add(new SetCardInfo("Erkenbrand, Lord of Westfold", 123, Rarity.UNCOMMON, mage.cards.e.ErkenbrandLordOfWestfold.class));
        cards.add(new SetCardInfo("Errand-Rider of Gondor", 11, Rarity.COMMON, mage.cards.e.ErrandRiderOfGondor.class));
        cards.add(new SetCardInfo("Escape from Orthanc", 12, Rarity.COMMON, mage.cards.e.EscapeFromOrthanc.class));
        cards.add(new SetCardInfo("Esquire of the King", 13, Rarity.COMMON, mage.cards.e.EsquireOfTheKing.class));
        cards.add(new SetCardInfo("Fall of Cair Andros", 124, Rarity.RARE, mage.cards.f.FallOfCairAndros.class));
        cards.add(new SetCardInfo("Fall of Gil-galad", 165, Rarity.RARE, mage.cards.f.FallOfGilGalad.class));
        cards.add(new SetCardInfo("Fangorn, Tree Shepherd", 166, Rarity.RARE, mage.cards.f.FangornTreeShepherd.class));
        cards.add(new SetCardInfo("Faramir, Field Commander", 14, Rarity.UNCOMMON, mage.cards.f.FaramirFieldCommander.class));
        cards.add(new SetCardInfo("Faramir, Prince of Ithilien", 202, Rarity.RARE, mage.cards.f.FaramirPrinceOfIthilien.class));
        cards.add(new SetCardInfo("Fear, Fire, Foes!", 125, Rarity.UNCOMMON, mage.cards.f.FearFireFoes.class));
        cards.add(new SetCardInfo("Fiery Inscription", 126, Rarity.UNCOMMON, mage.cards.f.FieryInscription.class));
        cards.add(new SetCardInfo("Fire of Orthanc", 127, Rarity.COMMON, mage.cards.f.FireOfOrthanc.class));
        cards.add(new SetCardInfo("Flame of Anor", 203, Rarity.RARE, mage.cards.f.FlameOfAnor.class));
        cards.add(new SetCardInfo("Flowering of the White Tree", 15, Rarity.RARE, mage.cards.f.FloweringOfTheWhiteTree.class));
        cards.add(new SetCardInfo("Fog on the Barrow-Downs", 16, Rarity.COMMON, mage.cards.f.FogOnTheBarrowDowns.class));
        cards.add(new SetCardInfo("Foray of Orcs", 128, Rarity.UNCOMMON, mage.cards.f.ForayOfOrcs.class));
        cards.add(new SetCardInfo("Forest", 270, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Friendly Rivalry", 204, Rarity.UNCOMMON, mage.cards.f.FriendlyRivalry.class));
        cards.add(new SetCardInfo("Frodo Baggins", 205, Rarity.UNCOMMON, mage.cards.f.FrodoBaggins.class));
        cards.add(new SetCardInfo("Frodo, Determined Hero", 289, Rarity.RARE, mage.cards.f.FrodoDeterminedHero.class));
        cards.add(new SetCardInfo("Frodo, Sauron's Bane", 18, Rarity.RARE, mage.cards.f.FrodoSauronsBane.class));
        cards.add(new SetCardInfo("Galadhrim Bow", 167, Rarity.COMMON, mage.cards.g.GaladhrimBow.class));
        cards.add(new SetCardInfo("Galadhrim Guide", 168, Rarity.COMMON, mage.cards.g.GaladhrimGuide.class));
        cards.add(new SetCardInfo("Galadriel of Lothlorien", 206, Rarity.RARE, mage.cards.g.GaladrielOfLothlorien.class));
        cards.add(new SetCardInfo("Galadriel, Gift-Giver", 296, Rarity.RARE, mage.cards.g.GaladrielGiftGiver.class));
        cards.add(new SetCardInfo("Gandalf the Grey", 207, Rarity.RARE, mage.cards.g.GandalfTheGrey.class));
        cards.add(new SetCardInfo("Gandalf the White", 19, Rarity.MYTHIC, mage.cards.g.GandalfTheWhite.class));
        cards.add(new SetCardInfo("Gandalf's Sanction", 208, Rarity.UNCOMMON, mage.cards.g.GandalfsSanction.class));
        cards.add(new SetCardInfo("Gandalf, Friend of the Shire", 50, Rarity.UNCOMMON, mage.cards.g.GandalfFriendOfTheShire.class));
        cards.add(new SetCardInfo("Gandalf, White Rider", 290, Rarity.RARE, mage.cards.g.GandalfWhiteRider.class));
        cards.add(new SetCardInfo("Generous Ent", 169, Rarity.COMMON, mage.cards.g.GenerousEnt.class));
        cards.add(new SetCardInfo("Gift of Strands", 170, Rarity.UNCOMMON, mage.cards.g.GiftOfStrands.class));
        cards.add(new SetCardInfo("Gimli's Axe", 130, Rarity.COMMON, mage.cards.g.GimlisAxe.class));
        cards.add(new SetCardInfo("Gimli's Fury", 131, Rarity.COMMON, mage.cards.g.GimlisFury.class));
        cards.add(new SetCardInfo("Gimli, Counter of Kills", 129, Rarity.UNCOMMON, mage.cards.g.GimliCounterOfKills.class));
        cards.add(new SetCardInfo("Gimli, Mournful Avenger", 209, Rarity.RARE, mage.cards.g.GimliMournfulAvenger.class));
        cards.add(new SetCardInfo("Gloin, Dwarf Emissary", 132, Rarity.RARE, mage.cards.g.GloinDwarfEmissary.class));
        cards.add(new SetCardInfo("Glorious Gale", 51, Rarity.COMMON, mage.cards.g.GloriousGale.class));
        cards.add(new SetCardInfo("Goblin Assailant", 295, Rarity.COMMON, mage.cards.g.GoblinAssailant.class));
        cards.add(new SetCardInfo("Goblin Fireleaper", 133, Rarity.UNCOMMON, mage.cards.g.GoblinFireleaper.class));
        cards.add(new SetCardInfo("Gollum's Bite", 85, Rarity.UNCOMMON, mage.cards.g.GollumsBite.class));
        cards.add(new SetCardInfo("Gollum, Patient Plotter", 84, Rarity.UNCOMMON, mage.cards.g.GollumPatientPlotter.class));
        cards.add(new SetCardInfo("Gorbag of Minas Morgul", 86, Rarity.UNCOMMON, mage.cards.g.GorbagOfMinasMorgul.class));
        cards.add(new SetCardInfo("Gothmog, Morgul Lieutenant", 87, Rarity.UNCOMMON, mage.cards.g.GothmogMorgulLieutenant.class));
        cards.add(new SetCardInfo("Great Hall of the Citadel", 254, Rarity.COMMON, mage.cards.g.GreatHallOfTheCitadel.class));
        cards.add(new SetCardInfo("Grey Havens Navigator", 53, Rarity.COMMON, mage.cards.g.GreyHavensNavigator.class));
        cards.add(new SetCardInfo("Grima Wormtongue", 88, Rarity.UNCOMMON, mage.cards.g.GrimaWormtongue.class));
        cards.add(new SetCardInfo("Grishnakh, Brash Instigator", 134, Rarity.UNCOMMON, mage.cards.g.GrishnakhBrashInstigator.class));
        cards.add(new SetCardInfo("Grond, the Gatebreaker", 89, Rarity.UNCOMMON, mage.cards.g.GrondTheGatebreaker.class));
        cards.add(new SetCardInfo("Gwaihir the Windlord", 210, Rarity.UNCOMMON, mage.cards.g.GwaihirTheWindlord.class));
        cards.add(new SetCardInfo("Haradrim Spearmaster", 135, Rarity.COMMON, mage.cards.h.HaradrimSpearmaster.class));
        cards.add(new SetCardInfo("Haunt of the Dead Marshes", 90, Rarity.COMMON, mage.cards.h.HauntOfTheDeadMarshes.class));
        cards.add(new SetCardInfo("Hew the Entwood", 136, Rarity.MYTHIC, mage.cards.h.HewTheEntwood.class));
        cards.add(new SetCardInfo("Hithlain Knots", 54, Rarity.COMMON, mage.cards.h.HithlainKnots.class));
        cards.add(new SetCardInfo("Hobbit's Sting", 20, Rarity.COMMON, mage.cards.h.HobbitsSting.class));
        cards.add(new SetCardInfo("Horn of Gondor", 240, Rarity.RARE, mage.cards.h.HornOfGondor.class));
        cards.add(new SetCardInfo("Horn of the Mark", 241, Rarity.RARE, mage.cards.h.HornOfTheMark.class));
        cards.add(new SetCardInfo("Horses of the Bruinen", 55, Rarity.UNCOMMON, mage.cards.h.HorsesOfTheBruinen.class));
        cards.add(new SetCardInfo("Improvised Club", 137, Rarity.COMMON, mage.cards.i.ImprovisedClub.class));
        cards.add(new SetCardInfo("Inherited Envelope", 242, Rarity.COMMON, mage.cards.i.InheritedEnvelope.class));
        cards.add(new SetCardInfo("Ioreth of the Healing House", 56, Rarity.UNCOMMON, mage.cards.i.IorethOfTheHealingHouse.class));
        cards.add(new SetCardInfo("Isildur's Fateful Strike", 91, Rarity.RARE, mage.cards.i.IsildursFatefulStrike.class));
        cards.add(new SetCardInfo("Island", 264, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Isolation at Orthanc", 57, Rarity.COMMON, mage.cards.i.IsolationAtOrthanc.class));
        cards.add(new SetCardInfo("Ithilien Kingfisher", 58, Rarity.COMMON, mage.cards.i.IthilienKingfisher.class));
        cards.add(new SetCardInfo("Knight of the Keep", 291, Rarity.COMMON, mage.cards.k.KnightOfTheKeep.class));
        cards.add(new SetCardInfo("Knights of Dol Amroth", 59, Rarity.COMMON, mage.cards.k.KnightsOfDolAmroth.class));
        cards.add(new SetCardInfo("Landroval, Horizon Witness", 21, Rarity.UNCOMMON, mage.cards.l.LandrovalHorizonWitness.class));
        cards.add(new SetCardInfo("Lash of the Balrog", 92, Rarity.COMMON, mage.cards.l.LashOfTheBalrog.class));
        cards.add(new SetCardInfo("Last March of the Ents", 172, Rarity.MYTHIC, mage.cards.l.LastMarchOfTheEnts.class));
        cards.add(new SetCardInfo("Legolas, Counter of Kills", 212, Rarity.UNCOMMON, mage.cards.l.LegolasCounterOfKills.class));
        cards.add(new SetCardInfo("Legolas, Master Archer", 173, Rarity.RARE, mage.cards.l.LegolasMasterArcher.class));
        cards.add(new SetCardInfo("Lembas", 243, Rarity.COMMON, mage.cards.l.Lembas.class));
        cards.add(new SetCardInfo("Lobelia Sackville-Baggins", 93, Rarity.RARE, mage.cards.l.LobeliaSackvilleBaggins.class));
        cards.add(new SetCardInfo("Long List of the Ents", 174, Rarity.UNCOMMON, mage.cards.l.LongListOfTheEnts.class));
        cards.add(new SetCardInfo("Lorien Revealed", 60, Rarity.COMMON, mage.cards.l.LorienRevealed.class));
        cards.add(new SetCardInfo("Lost Isle Calling", 61, Rarity.RARE, mage.cards.l.LostIsleCalling.class));
        cards.add(new SetCardInfo("Lost to Legend", 22, Rarity.UNCOMMON, mage.cards.l.LostToLegend.class));
        cards.add(new SetCardInfo("Lothlorien Lookout", 175, Rarity.COMMON, mage.cards.l.LothlorienLookout.class));
        cards.add(new SetCardInfo("Lotho, Corrupt Shirriff", 213, Rarity.RARE, mage.cards.l.LothoCorruptShirriff.class));
        cards.add(new SetCardInfo("Many Partings", 176, Rarity.COMMON, mage.cards.m.ManyPartings.class));
        cards.add(new SetCardInfo("March from the Black Gate", 94, Rarity.UNCOMMON, mage.cards.m.MarchFromTheBlackGate.class));
        cards.add(new SetCardInfo("Mauhur, Uruk-hai Captain", 214, Rarity.UNCOMMON, mage.cards.m.MauhurUrukHaiCaptain.class));
        cards.add(new SetCardInfo("Meneldor, Swift Savior", 62, Rarity.UNCOMMON, mage.cards.m.MeneldorSwiftSavior.class));
        cards.add(new SetCardInfo("Meriadoc Brandybuck", 177, Rarity.UNCOMMON, mage.cards.m.MeriadocBrandybuck.class));
        cards.add(new SetCardInfo("Merry, Esquire of Rohan", 215, Rarity.RARE, mage.cards.m.MerryEsquireOfRohan.class));
        cards.add(new SetCardInfo("Minas Tirith", 256, Rarity.RARE, mage.cards.m.MinasTirith.class));
        cards.add(new SetCardInfo("Mines of Moria", 257, Rarity.RARE, mage.cards.m.MinesOfMoria.class));
        cards.add(new SetCardInfo("Mirkwood Bats", 95, Rarity.COMMON, mage.cards.m.MirkwoodBats.class));
        cards.add(new SetCardInfo("Mirkwood Spider", 178, Rarity.COMMON, mage.cards.m.MirkwoodSpider.class));
        cards.add(new SetCardInfo("Mirror of Galadriel", 244, Rarity.UNCOMMON, mage.cards.m.MirrorOfGaladriel.class));
        cards.add(new SetCardInfo("Mirrormere Guardian", 179, Rarity.COMMON, mage.cards.m.MirrormereGuardian.class));
        cards.add(new SetCardInfo("Mithril Coat", 245, Rarity.RARE, mage.cards.m.MithrilCoat.class));
        cards.add(new SetCardInfo("Mordor Muster", 96, Rarity.COMMON, mage.cards.m.MordorMuster.class));
        cards.add(new SetCardInfo("Mordor Trebuchet", 97, Rarity.COMMON, mage.cards.m.MordorTrebuchet.class));
        cards.add(new SetCardInfo("Morgul-Knife Wound", 98, Rarity.COMMON, mage.cards.m.MorgulKnifeWound.class));
        cards.add(new SetCardInfo("Moria Marauder", 138, Rarity.RARE, mage.cards.m.MoriaMarauder.class));
        cards.add(new SetCardInfo("Mount Doom", 258, Rarity.MYTHIC, mage.cards.m.MountDoom.class));
        cards.add(new SetCardInfo("Mountain", 268, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mushroom Watchdogs", 180, Rarity.COMMON, mage.cards.m.MushroomWatchdogs.class));
        cards.add(new SetCardInfo("Nasty End", 99, Rarity.COMMON, mage.cards.n.NastyEnd.class));
        cards.add(new SetCardInfo("Nazgul", 100, Rarity.UNCOMMON, mage.cards.n.Nazgul.class));
        cards.add(new SetCardInfo("Nimble Hobbit", 23, Rarity.COMMON, mage.cards.n.NimbleHobbit.class));
        cards.add(new SetCardInfo("Nimrodel Watcher", 63, Rarity.COMMON, mage.cards.n.NimrodelWatcher.class));
        cards.add(new SetCardInfo("Now for Wrath, Now for Ruin!", 24, Rarity.COMMON, mage.cards.n.NowForWrathNowForRuin.class));
        cards.add(new SetCardInfo("Oath of the Grey Host", 101, Rarity.UNCOMMON, mage.cards.o.OathOfTheGreyHost.class));
        cards.add(new SetCardInfo("Old Man Willow", 217, Rarity.UNCOMMON, mage.cards.o.OldManWillow.class));
        cards.add(new SetCardInfo("Oliphaunt", 139, Rarity.COMMON, mage.cards.o.Oliphaunt.class));
        cards.add(new SetCardInfo("Olog-hai Crusher", 140, Rarity.COMMON, mage.cards.o.OlogHaiCrusher.class));
        cards.add(new SetCardInfo("One Ring to Rule Them All", 102, Rarity.RARE, mage.cards.o.OneRingToRuleThemAll.class));
        cards.add(new SetCardInfo("Orcish Bowmasters", 103, Rarity.RARE, mage.cards.o.OrcishBowmasters.class));
        cards.add(new SetCardInfo("Orcish Medicine", 104, Rarity.COMMON, mage.cards.o.OrcishMedicine.class));
        cards.add(new SetCardInfo("Palantir of Orthanc", 247, Rarity.MYTHIC, mage.cards.p.PalantirOfOrthanc.class));
        cards.add(new SetCardInfo("Pelargir Survivor", 64, Rarity.COMMON, mage.cards.p.PelargirSurvivor.class));
        cards.add(new SetCardInfo("Peregrin Took", 181, Rarity.UNCOMMON, mage.cards.p.PeregrinTook.class));
        cards.add(new SetCardInfo("Phial of Galadriel", 248, Rarity.RARE, mage.cards.p.PhialOfGaladriel.class));
        cards.add(new SetCardInfo("Pippin's Bravery", 182, Rarity.COMMON, mage.cards.p.PippinsBravery.class));
        cards.add(new SetCardInfo("Pippin, Guard of the Citadel", 218, Rarity.RARE, mage.cards.p.PippinGuardOfTheCitadel.class));
        cards.add(new SetCardInfo("Plains", 262, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Press the Enemy", 65, Rarity.RARE, mage.cards.p.PressTheEnemy.class));
        cards.add(new SetCardInfo("Prince Imrahil the Fair", 219, Rarity.UNCOMMON, mage.cards.p.PrinceImrahilTheFair.class));
        cards.add(new SetCardInfo("Protector of Gondor", 25, Rarity.COMMON, mage.cards.p.ProtectorOfGondor.class));
        cards.add(new SetCardInfo("Quarrel's End", 141, Rarity.COMMON, mage.cards.q.QuarrelsEnd.class));
        cards.add(new SetCardInfo("Quickbeam, Upstart Ent", 183, Rarity.UNCOMMON, mage.cards.q.QuickbeamUpstartEnt.class));
        cards.add(new SetCardInfo("Rally at the Hornburg", 142, Rarity.COMMON, mage.cards.r.RallyAtTheHornburg.class));
        cards.add(new SetCardInfo("Ranger's Firebrand", 143, Rarity.UNCOMMON, mage.cards.r.RangersFirebrand.class));
        cards.add(new SetCardInfo("Rangers of Ithilien", 66, Rarity.RARE, mage.cards.r.RangersOfIthilien.class));
        cards.add(new SetCardInfo("Relentless Rohirrim", 144, Rarity.COMMON, mage.cards.r.RelentlessRohirrim.class));
        cards.add(new SetCardInfo("Reprieve", 26, Rarity.UNCOMMON, mage.cards.r.Reprieve.class));
        cards.add(new SetCardInfo("Revive the Shire", 185, Rarity.COMMON, mage.cards.r.ReviveTheShire.class));
        cards.add(new SetCardInfo("Ringsight", 220, Rarity.UNCOMMON, mage.cards.r.Ringsight.class));
        cards.add(new SetCardInfo("Ringwraiths", 284, Rarity.RARE, mage.cards.r.Ringwraiths.class));
        cards.add(new SetCardInfo("Rise of the Witch-king", 221, Rarity.UNCOMMON, mage.cards.r.RiseOfTheWitchKing.class));
        cards.add(new SetCardInfo("Rising of the Day", 145, Rarity.UNCOMMON, mage.cards.r.RisingOfTheDay.class));
        cards.add(new SetCardInfo("Rivendell", 259, Rarity.RARE, mage.cards.r.Rivendell.class));
        cards.add(new SetCardInfo("Rohirrim Lancer", 146, Rarity.COMMON, mage.cards.r.RohirrimLancer.class));
        cards.add(new SetCardInfo("Rosie Cotton of South Lane", 27, Rarity.UNCOMMON, mage.cards.r.RosieCottonOfSouthLane.class));
        cards.add(new SetCardInfo("Rush the Room", 147, Rarity.COMMON, mage.cards.r.RushTheRoom.class));
        cards.add(new SetCardInfo("Sam's Desperate Rescue", 105, Rarity.COMMON, mage.cards.s.SamsDesperateRescue.class));
        cards.add(new SetCardInfo("Samwise Gamgee", 222, Rarity.RARE, mage.cards.s.SamwiseGamgee.class));
        cards.add(new SetCardInfo("Samwise the Stouthearted", 28, Rarity.UNCOMMON, mage.cards.s.SamwiseTheStouthearted.class));
        cards.add(new SetCardInfo("Saradoc, Master of Buckland", 282, Rarity.RARE, mage.cards.s.SaradocMasterOfBuckland.class));
        cards.add(new SetCardInfo("Saruman of Many Colors", 223, Rarity.MYTHIC, mage.cards.s.SarumanOfManyColors.class));
        cards.add(new SetCardInfo("Saruman the White", 67, Rarity.UNCOMMON, mage.cards.s.SarumanTheWhite.class));
        cards.add(new SetCardInfo("Saruman's Trickery", 68, Rarity.UNCOMMON, mage.cards.s.SarumansTrickery.class));
        cards.add(new SetCardInfo("Sauron's Ransom", 225, Rarity.RARE, mage.cards.s.SauronsRansom.class));
        cards.add(new SetCardInfo("Sauron, the Dark Lord", 224, Rarity.MYTHIC, mage.cards.s.SauronTheDarkLord.class));
        cards.add(new SetCardInfo("Sauron, the Lidless Eye", 288, Rarity.MYTHIC, mage.cards.s.SauronTheLidlessEye.class));
        cards.add(new SetCardInfo("Sauron, the Necromancer", 106, Rarity.RARE, mage.cards.s.SauronTheNecromancer.class));
        cards.add(new SetCardInfo("Scroll of Isildur", 69, Rarity.RARE, mage.cards.s.ScrollOfIsildur.class));
        cards.add(new SetCardInfo("Second Breakfast", 29, Rarity.COMMON, mage.cards.s.SecondBreakfast.class));
        cards.add(new SetCardInfo("Shadow Summoning", 226, Rarity.UNCOMMON, mage.cards.s.ShadowSummoning.class));
        cards.add(new SetCardInfo("Shadow of the Enemy", 107, Rarity.MYTHIC, mage.cards.s.ShadowOfTheEnemy.class));
        cards.add(new SetCardInfo("Shadowfax, Lord of Horses", 227, Rarity.UNCOMMON, mage.cards.s.ShadowfaxLordOfHorses.class));
        cards.add(new SetCardInfo("Shagrat, Loot Bearer", 228, Rarity.RARE, mage.cards.s.ShagratLootBearer.class));
        cards.add(new SetCardInfo("Shelob's Ambush", 108, Rarity.COMMON, mage.cards.s.ShelobsAmbush.class));
        cards.add(new SetCardInfo("Shelob, Child of Ungoliant", 230, Rarity.RARE, mage.cards.s.ShelobChildOfUngoliant.class));
        cards.add(new SetCardInfo("Shire Scarecrow", 249, Rarity.COMMON, mage.cards.s.ShireScarecrow.class));
        cards.add(new SetCardInfo("Shire Shirriff", 30, Rarity.UNCOMMON, mage.cards.s.ShireShirriff.class));
        cards.add(new SetCardInfo("Shire Terrace", 261, Rarity.COMMON, mage.cards.s.ShireTerrace.class));
        cards.add(new SetCardInfo("Shortcut to Mushrooms", 187, Rarity.UNCOMMON, mage.cards.s.ShortcutToMushrooms.class));
        cards.add(new SetCardInfo("Shower of Arrows", 188, Rarity.COMMON, mage.cards.s.ShowerOfArrows.class));
        cards.add(new SetCardInfo("Slip On the Ring", 31, Rarity.COMMON, mage.cards.s.SlipOnTheRing.class));
        cards.add(new SetCardInfo("Smeagol, Helpful Guide", 231, Rarity.RARE, mage.cards.s.SmeagolHelpfulGuide.class));
        cards.add(new SetCardInfo("Smite the Deathless", 148, Rarity.COMMON, mage.cards.s.SmiteTheDeathless.class));
        cards.add(new SetCardInfo("Snarling Warg", 109, Rarity.COMMON, mage.cards.s.SnarlingWarg.class));
        cards.add(new SetCardInfo("Soldier of the Grey Host", 32, Rarity.COMMON, mage.cards.s.SoldierOfTheGreyHost.class));
        cards.add(new SetCardInfo("Soothing of Smeagol", 70, Rarity.COMMON, mage.cards.s.SoothingOfSmeagol.class));
        cards.add(new SetCardInfo("Spiteful Banditry", 149, Rarity.MYTHIC, mage.cards.s.SpitefulBanditry.class));
        cards.add(new SetCardInfo("Stalwarts of Osgiliath", 33, Rarity.COMMON, mage.cards.s.StalwartsOfOsgiliath.class));
        cards.add(new SetCardInfo("Stern Scolding", 71, Rarity.UNCOMMON, mage.cards.s.SternScolding.class));
        cards.add(new SetCardInfo("Stew the Coneys", 189, Rarity.UNCOMMON, mage.cards.s.StewTheConeys.class));
        cards.add(new SetCardInfo("Stone of Erech", 251, Rarity.UNCOMMON, mage.cards.s.StoneOfErech.class));
        cards.add(new SetCardInfo("Storm of Saruman", 72, Rarity.MYTHIC, mage.cards.s.StormOfSaruman.class));
        cards.add(new SetCardInfo("Strider, Ranger of the North", 232, Rarity.UNCOMMON, mage.cards.s.StriderRangerOfTheNorth.class));
        cards.add(new SetCardInfo("Surrounded by Orcs", 73, Rarity.COMMON, mage.cards.s.SurroundedByOrcs.class));
        cards.add(new SetCardInfo("Swamp", 266, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swarming of Moria", 150, Rarity.COMMON, mage.cards.s.SwarmingOfMoria.class));
        cards.add(new SetCardInfo("Tale of Tinuviel", 34, Rarity.UNCOMMON, mage.cards.t.TaleOfTinuviel.class));
        cards.add(new SetCardInfo("The Balrog, Durin's Bane", 195, Rarity.RARE, mage.cards.t.TheBalrogDurinsBane.class));
        cards.add(new SetCardInfo("The Balrog, Flame of Udun", 297, Rarity.RARE, mage.cards.t.TheBalrogFlameOfUdun.class));
        cards.add(new SetCardInfo("The Bath Song", 40, Rarity.UNCOMMON, mage.cards.t.TheBathSong.class));
        cards.add(new SetCardInfo("The Battle of Bywater", 2, Rarity.RARE, mage.cards.t.TheBattleOfBywater.class));
        cards.add(new SetCardInfo("The Black Breath", 78, Rarity.COMMON, mage.cards.t.TheBlackBreath.class));
        cards.add(new SetCardInfo("The Grey Havens", 255, Rarity.UNCOMMON, mage.cards.t.TheGreyHavens.class));
        cards.add(new SetCardInfo("The Mouth of Sauron", 216, Rarity.UNCOMMON, mage.cards.t.TheMouthOfSauron.class));
        cards.add(new SetCardInfo("The One Ring", 246, Rarity.MYTHIC, mage.cards.t.TheOneRing.class));
        cards.add(new SetCardInfo("The Ring Goes South", 186, Rarity.RARE, mage.cards.t.TheRingGoesSouth.class));
        cards.add(new SetCardInfo("The Shire", 260, Rarity.RARE, mage.cards.t.TheShire.class));
        cards.add(new SetCardInfo("The Torment of Gollum", 110, Rarity.COMMON, mage.cards.t.TheTormentOfGollum.class));
        cards.add(new SetCardInfo("The Watcher in the Water", 75, Rarity.MYTHIC, mage.cards.t.TheWatcherInTheWater.class));
        cards.add(new SetCardInfo("Theoden, King of Rohan", 233, Rarity.UNCOMMON, mage.cards.t.TheodenKingOfRohan.class));
        cards.add(new SetCardInfo("There and Back Again", 151, Rarity.RARE, mage.cards.t.ThereAndBackAgain.class));
        cards.add(new SetCardInfo("Tom Bombadil", 234, Rarity.MYTHIC, mage.cards.t.TomBombadil.class));
        cards.add(new SetCardInfo("Took Reaper", 35, Rarity.COMMON, mage.cards.t.TookReaper.class));
        cards.add(new SetCardInfo("Trailblazer's Boots", 398, Rarity.RARE, mage.cards.t.TrailblazersBoots.class));
        cards.add(new SetCardInfo("Treason of Isengard", 74, Rarity.COMMON, mage.cards.t.TreasonOfIsengard.class));
        cards.add(new SetCardInfo("Troll of Khazad-dum", 111, Rarity.COMMON, mage.cards.t.TrollOfKhazadDum.class));
        cards.add(new SetCardInfo("Ugluk of the White Hand", 235, Rarity.UNCOMMON, mage.cards.u.UglukOfTheWhiteHand.class));
        cards.add(new SetCardInfo("Uruk-hai Berserker", 112, Rarity.COMMON, mage.cards.u.UrukHaiBerserker.class));
        cards.add(new SetCardInfo("Voracious Fell Beast", 113, Rarity.UNCOMMON, mage.cards.v.VoraciousFellBeast.class));
        cards.add(new SetCardInfo("War of the Last Alliance", 36, Rarity.RARE, mage.cards.w.WarOfTheLastAlliance.class));
        cards.add(new SetCardInfo("Warbeast of Gorgoroth", 152, Rarity.COMMON, mage.cards.w.WarbeastOfGorgoroth.class));
        cards.add(new SetCardInfo("Westfold Rider", 37, Rarity.COMMON, mage.cards.w.WestfoldRider.class));
        cards.add(new SetCardInfo("Willow-Wind", 76, Rarity.COMMON, mage.cards.w.WillowWind.class));
        cards.add(new SetCardInfo("Witch-king of Angmar", 114, Rarity.MYTHIC, mage.cards.w.WitchKingOfAngmar.class));
        cards.add(new SetCardInfo("Witch-king, Bringer of Ruin", 293, Rarity.RARE, mage.cards.w.WitchKingBringerOfRuin.class));
        cards.add(new SetCardInfo("Wizard's Rockets", 252, Rarity.COMMON, mage.cards.w.WizardsRockets.class));
        cards.add(new SetCardInfo("Wose Pathfinder", 190, Rarity.COMMON, mage.cards.w.WosePathfinder.class));
        cards.add(new SetCardInfo("You Cannot Pass!", 38, Rarity.UNCOMMON, mage.cards.y.YouCannotPass.class));
    }
}
