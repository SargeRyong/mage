package mage.deck;

import mage.cards.ExpansionSet;
import mage.cards.Sets;
import mage.cards.decks.DeckValidatorErrorType;

import java.util.Map;

public class CasualCommander extends AbstractCommander {

    public CasualCommander() {
        this("CasualEDH");
        banned.add("Ancestral Recall");
        banned.add("Balance");
        banned.add("Biorhythm");
        banned.add("Black Lotus");
        banned.add("Braids, Cabal Minion");
        banned.add("Channel");
        banned.add("Coalition Victory");
        banned.add("Emrakul, the Aeons Torn");
        banned.add("Erayo, Soratami Ascendant");
        banned.add("Fastbond");
        banned.add("Flash");
        banned.add("Gifts Ungiven");
        banned.add("Golos, Tireless Pilgrim");
        banned.add("Griselbrand");
        banned.add("Hullbreacher");
        banned.add("Iona, Shield of Emeria");
        banned.add("Jihad");
        banned.add("Karakas");
        banned.add("Leovold, Emissary of Trest");
        banned.add("Library of Alexandria");
        banned.add("Limited Resources");
        banned.add("Lutri, the Spellchaser");
        banned.add("Mox Emerald");
        banned.add("Mox Jet");
        banned.add("Mox Pearl");
        banned.add("Mox Ruby");
        banned.add("Mox Sapphire");
        banned.add("Panoptic Mirror");
        banned.add("Paradox Engine");
        banned.add("Primeval Titan");
        banned.add("Prophet of Kruphix");
        banned.add("Recurring Nightmare");
        banned.add("Rofellos, Llanowar Emissary");
        banned.add("Sundering Titan");
        banned.add("Sway of the Stars");
        banned.add("Sylvan Primordial");
        banned.add("Time Vault");
        banned.add("Time Walk");
        banned.add("Tinker");
        banned.add("Tolarian Academy");
        banned.add("Trade Secrets");
        banned.add("Upheaval");
        banned.add("Yawgmoth's Bargain");

        // Custom Banlist starts here
        // Previously Banned / Power Level / Play Patterns
        banned.add("Agent of Treachery");
        banned.add("Bazaar of Baghdad");
        banned.add("Counterspell");
        banned.add("Field of the Dead");
        banned.add("Hermit Druid");
        banned.add("Kethis, the Hidden Hand");
        banned.add("Lightning Bolt");
        banned.add("Mana Drain");
        banned.add("Memory Jar");
        banned.add("Memory Lapse");
        banned.add("Mind Twist");
        banned.add("Nexus of Fate");
        banned.add("Oath of Druids");
        banned.add("Oko, Thief of Crowns");
        banned.add("Show and Tell");
        banned.add("Sneak Attack");
        banned.add("Swords to Plowshares");
        banned.add("Teferi, Time Raveler");
        banned.add("Tibalt's Trickery");
        banned.add("Time Warp");
        banned.add("Timetwister");
        banned.add("Ugin, the Spirit Dragon");
        banned.add("Underworld Breach");
        banned.add("Uro, Titan of Nature's Wrath");
        banned.add("Veil of Summer");
        banned.add("Wheel of Fortune");
        banned.add("Windfall");
        banned.add("Winota, Joiner of Forces");
        banned.add("Wrenn and Six");
        banned.add("Yawgmoth's Will");

        // Resource Denial
        banned.add("Chains of Mephistopheles");
        banned.add("Mindslicer");
        banned.add("Narset, Parter of Veils");
        banned.add("Notion Thief");
        banned.add("Oppression");
        banned.add("Possessed Portal");
        banned.add("Sadistic Hypnotist");
        banned.add("Sire of Insanity");
        banned.add("Smokestack");
        banned.add("Spirit of the Labyrinth");
        banned.add("Spreading Seas");
        banned.add("Zur's Weirding");

        // Cheap Tutors
        banned.add("Demonic Consultation");
        banned.add("Demonic Tutor");
        banned.add("Diabolic Intent");
        banned.add("Enlightened Tutor");
        banned.add("Gamble");
        banned.add("Goblin Recruiter");
        banned.add("Imperial Seal");
        banned.add("Merchant Scroll");
        banned.add("Mystical Tutor");
        banned.add("Personal Tutor");
        banned.add("Survival of the Fittest");
        banned.add("Sylvan Tutor");
        banned.add("Vampiric Tutor");
        banned.add("Worldly Tutor");

        // Rule Effects
        banned.add("Arcane Laboratory");
        banned.add("Archon of Emeria");
        banned.add("Chalice of the Void");
        banned.add("Deafening Silence");
        banned.add("Eidolon of Rhetoric");
        banned.add("Ethersworn Canonist");
        banned.add("Rule of Law");

        // Powerful Tutors
        banned.add("Karn, the Great Creator");
        banned.add("Natural Order");

        // Land Destruction
        banned.add("Apocalypse");
        banned.add("Armageddon");
        banned.add("Boom / Bust");
        banned.add("Cataclysm");
        banned.add("Catastrophe");
        banned.add("Death Cloud");
        banned.add("Decree of Annihilation");
        banned.add("Desolation");
        banned.add("Destructive Force");
        banned.add("Devastation");
        banned.add("Epicenter");
        banned.add("Global Ruin");
        banned.add("Impending Disaster");
        banned.add("Jokulhaups");
        banned.add("Mana Vortex");
        banned.add("Obliterate");
        banned.add("Ravages of War");
        banned.add("Strip Mine");
        banned.add("Sunder");
        banned.add("Tectonic Break");
        banned.add("Thoughts of Ruin");
        banned.add("Wake of Destruction");
        banned.add("Wildfire");

        // Mana Denial
        banned.add("Back to Basics");
        banned.add("Blood Moon");
        banned.add("Collector Ouphe");
        banned.add("Contamination");
        banned.add("Drannith Magistrate");
        banned.add("Embargo");
        banned.add("Energy Flux");
        banned.add("Hokori, Dust Drinker");
        banned.add("Land Equilibrium");
        banned.add("Magus of the Moon");
        banned.add("Mana Breach");
        banned.add("Null Rod");
        banned.add("Rising Waters");
        banned.add("Root Maze");
        banned.add("Stasis");
        banned.add("Static Orb");
        banned.add("Stony Silence");
        banned.add("Tangle Wire");
        banned.add("Winter Orb");

        // Overwhelming Value / Card Advantage
        banned.add("Ad Nauseam");
        banned.add("Brainstorm");
        banned.add("Dig Through Time");
        banned.add("Doomsday");
        banned.add("Gush");
        banned.add("Mind's Desire");
        banned.add("Mystic Forge");
        banned.add("Necropotence");
        banned.add("Skullclamp");
        banned.add("Sylvan Library");
        banned.add("Treasure Cruise");

        // Multiplayer/Singleton/Commander Unfriendly
        banned.add("Gideon's Intervention");
        banned.add("Land Tax");
        banned.add("Meddling Mage");
        banned.add("Phyrexian Revoker");
        banned.add("Pithing Needle");
        banned.add("Runed Halo");
        banned.add("Sorcerous Spyglass");
        banned.add("Tainted Pact");
        banned.add("Yorion, Sky Nomad");

        // Tax Effects
        banned.add("Esper Sentinel");
        banned.add("Lodestone Golem");
        banned.add("Mystic Remora");
        banned.add("Rhystic Study");
        banned.add("Nether Void");
        banned.add("Smothering Tithe");
        banned.add("Sphere of Resistance");
        banned.add("Thorn of Amethyst");
        banned.add("Trinishere");

        // Creature Hate
        banned.add("Humility");
        banned.add("Overburden");
        banned.add("Tainted AEther");
        banned.add("The Tabernacle at Pendrell Vale");

        // Chaos
        banned.add("Confusion in the Ranks");
        banned.add("Conjured Currency");
        banned.add("Cultural Exchange");
        banned.add("Dovescape");
        banned.add("Eye of the Storm");
        banned.add("Goblin Game");
        banned.add("Grip of Chaos");
        banned.add("Naked Singularity");
        banned.add("Omen Machine");
        banned.add("Planar Chaos");
        banned.add("Possibility Storm");
        banned.add("Psychic Battle");
        banned.add("Puca's Mischief");
        banned.add("Risky Move");
        banned.add("Scrambleverse");
        banned.add("Shared Fate");
        banned.add("The Great Aurora");
        banned.add("Thieves' Auction");
        banned.add("Warp World");

        // Fast Mana
        banned.add("Chrome Mox");
        banned.add("City of Traitors");
        banned.add("Dark Ritual");
        banned.add("Gemstone Caverns");
        banned.add("Grim Monolith");
        banned.add("Lotus Petal");
        banned.add("Mana Crypt");
        banned.add("Mana Vault");
        banned.add("Mox Diamond");
        banned.add("Mox Opal");
        banned.add("Sol Ring");

        // Instant Win Combos
        banned.add("Balustrade Spy");
        banned.add("Dramatic Reversal");
        banned.add("Food Chain");
        banned.add("Intruder Alarm");
        banned.add("Inverter of Truth");
        banned.add("Jace, Wielder of Mysteries");
        banned.add("Kiki-Jiki, Mirror Breaker");
        banned.add("Nine Lives");
        banned.add("Protean Hulk");
        banned.add("Solemnity");
        banned.add("Thassa's Oracle");
        banned.add("Undercity Informer");
        banned.add("Worldgorger Dragon");

        // Overwhelming Mana Generation
        banned.add("Ancient Tomb");
        banned.add("Dockside Extortionist");
        banned.add("Earthcraft");
        banned.add("Gaea's Cradle");
        banned.add("Jeweled Lotus");
        banned.add("Lion's Eye Diamond");
        banned.add("Mishra's Workshop");
        banned.add("Serra's Sanctum");
        banned.add("Wilderness Reclamation");

        // Leylines / Free Commander Spells
        banned.add("Deadly Rollick");
        banned.add("Deflecting Swat");
        banned.add("Fierce Guardianship");
        banned.add("Flawless Maneuver");
        banned.add("Obscuring Haze");
        banned.add("Leyline of Abundance");
        banned.add("Leyline of Combustion");
        banned.add("Leyline of Lifeforce");
        banned.add("Leyline of Singularity");
        banned.add("Leyline of the Void");

        // Free Counterspells
        banned.add("Force of Negation");
        banned.add("Force of Will");
        banned.add("Pact of Negation");
    }

    protected CasualCommander(String name) {
        super(name);
        for (ExpansionSet set : Sets.getInstance().values()) {
            if (set.getSetType().isEternalLegal()) {
                setCodes.add(set.getCode());
            }
        }
    }

    @Override
    protected boolean checkBanned(Map<String, Integer> counts) {
        boolean valid = true;
        for (String bannedCard : banned) {
            if (counts.containsKey(bannedCard)) {
                addError(DeckValidatorErrorType.BANNED, bannedCard, "Banned", true);
                valid = false;
            }
        }
        return valid;
    }

}
