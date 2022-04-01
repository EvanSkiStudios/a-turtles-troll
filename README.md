
# A Turtle's Troll

This is a Minecraft plugin for Spigot which introduces several "troll"
mechanics to the survival multiplayer experience. See `Features.org`
for the full feature list.

This is a companion project to [EvanSkiStudios'
Raccoon-Mischief](https://github.com/EvanSkiStudios/Raccoon-Mischief).
Neither directly depends on the other, but they are designed with each
other in mind.

## Changelog

### Version 1.12

* A Turtle's Troll is now built for Minecraft 1.18.2 against the
  latest Spigot API
* Bamboo spreads like crazy now
* Phantoms can randomly turn into witches now; witches do not take
  fall damage
* Wither skeletons have a 50% chance of spawning with bows rather than
  swords now
* Gravestones appear in ten different unique shapes now at random
  (thanks, HatCrafter)
* Gravestones do not replace any blocks other than air now
* Moss blocks are included in the **netherrack** effect now
* Cats turn into bats when killed, and bats turn into cats when killed
  (only when killed by the player)
* When amethyst blocks are broken, they have a small chance of
  dropping golden apples
* The contagious moss effect now extends down to the new bedrock layer
  of Y=-64
* Pointed dripstone arrow recipe is now upside-down (thanks, EvanSki)

### Version 1.11

* **gravestone** will not replace chests now.
* Players must wear armor in cold biomes and wear nothing in hot
  biomes, or they will take climate damage (does not apply in the
  nether)
* Dirt and sticks can be crafted into each other now
* Chickens are immune to Pufferfish damage
* Pointed dripstone arrows now have tags and a custom name marking
  them as different (thanks, EvanSki)
* Fixed Weeping Angel arm pose again (thanks, EvanSki)
* Fixed several of the death conditions for **bedtime**

### Version 1.10

* Tenth version hype! I'd like to thank my friends for dealing with my
  shenanigans through *ten* versions of this thing. Love you guys <3
* Each day at dawn, the gods will demand to see someone die in a
  specific way; if nobody dies that way on that day, then no one will
  be allowed to sleep that night
* Wandering traders can trade basically any item in the game
* Llamas are now constantly angry, and their spit has increased knockback
* Netherite hoes can one-shot any non-boss mob in the game
* Pointing a shield at the ground can negate fall damage
* Every player gets a free cookie at dawn and at dusk
* When logs/planks are broken, a random log/plank type is dropped
* Ghasts instantly burn in daylight
* Some zombies spawn with custom names
* Zombies move slightly faster
* Weeping Angel arm pose is fixed now
* Armor stands can be crafted into jungle wood slabs now
* Armor stands with custom name "raccoon" are not Weeping Angels now
* Lowered the rate of dripstone stalactites spawning
* Pointed dripstone can be used in place of flint to craft arrows
* A player who reaches Level 100 dies of old age
* Cleaned up the command API quite a bit
* Added `/turtle bedtime` command to see what the gods' current
  request is

### Version 1.9

* Whenever a player dies, a gravestone appears at the site of death
* When an axolotl dies, the nearest player also dies (within 32 blocks)
* Killing a charged creeper always drops a diamond
* Drowned zombies spawn alongside fish
* Angels, mimics, and cakes all have local spawn limits now
* Fixed a bug with the Weeping Angel pursuit code

### Version 1.8

* Pufferfish rain on all players at noon
* Taking fall damage causes the Slowness and Confusion effects
* Pillagers spawn with crossbows named "AK47" which have Quick Charge
  V
* Lava spreads further in the overworld and the End
* **forestfire** effect has been extended to apply to ice as well as
  leaves
* Ice blocks turn to bedrock when broken
* The obsidian crop overgrowth effect has been changed to turn crops
  into logs instead

### Version 1.7

* Chipped and damaged anvils can be smelted, like regular anvils
* Breaking glass gives the victim seven years of the Unluck potion
  effect
* Several crops turn to obsidian if not harvested within ten minutes
  of maturing
* The Ender Dragon drops TNT at regular intervals and is fully immune
  to explosion damage
* Ender Crystals spawn with Blaze spawners beneath them
* Tridents always explode on contact now
* Dirt placed in the End turns into a Shulker now
* Dolphin's Grace now prevents the electric water effect
* Fixed an issue with passive mobs failing to convert to chickens in
  Minecraft 1.17

### Version 1.6

* Pointed dripstone stalactites generate in the wild and will fall if
  you walk below them

### Version 1.5

* A Turtle's Troll is now built for Minecraft 1.17 against the latest
  Spigot API
* Cakes spawn in the wild and, when eaten, grant one of several random
  effects
* Explosive arrows can be crafted with arrows and gunpowder
* Wither skeletons spawn with full diamond armor now
* Moss generates in all overworld chunks and spreads rapidly
* Restored torch/light behavior to drop when looked at
* Added axolotls, goats, and glow squids to the list of egg hatch mob
  possibilities
* Undead mobs now often hatch from eggs with helmets
* Villagers who transform into zombie villagers via trading keep the
  correct profession now
* Copper ore and deepslate ores now count as ores for drop and
  levitation purposes
* 1.17 slab and stair blocks behave like other slab and stair blocks
  for the slowness effect
* Deepslate can produce a silverfish effect now, like other stone
  blocks
* Azalea leaves are leaves, for the purposes of fire and bedrock
  effects

### Version 1.4

* Beds don't drop when mined anymore
* Anvils can be smelted into iron nuggets
* Almost any mob can spawn from an egg
* Diamonds can spawn from an egg
* Skeletons will fire eggs in addition to arrows
* Several mobs drop eggs when killed
* Bats and rabbits never transform into chickens anymore
* Anvils have a minimum height above you they can spawn
* Drastically increased the pet phantom respawn cooldown (to 10
  minutes)
* Torches and other lights now turn into redstone torches rather than
  dropping when you look at them
* The slow slab effect and wither rose effect are both disabled if
  you're wearing boots, similar to grass poison now
* All of the effects that involve mob spawning are corrected to only
  affect natural mob spawning, not eggs or spawners

### Version 1.3

* Mimics will spawn, which look like chests but kill you instantly if
  opened
* Touching lava causes players to launch a short distance into the air
* Torches and lanterns have a cooldown after being placed during which
  they will not break
* The grass poison/slowness effect will not apply if you're wearing
  boots; instead, your boots lose one durability when you touch tall
  grass
* Wearing a pumpkin on your head allows you to go in water without
  getting electrocuted (but provides mining fatigue and slowness)
* Weeping Angels will now spawn rarely in the wild
* Weeping Angels now provide a custom death message
* Fixed several of the glitchier aspects of the Weeping Angels effect
* Pet phantoms have a respawn cooldown now

### Version 1.2

* Buttons and levers have durability now, similar to doors
* Pressure plates have a slight chance of catching fire when you step
  on them
* Decreased the rate of bats turning into chickens as a lag-prevention
  measure
* Slabs and stairs slow the player down
* Torches and lanterns break if you look at them
* Everybody gets a pet phantom now

### Version 1.1

* All features can be toggled on an individual basis using the `/turtle` command now
* Stripped wood will now correctly trigger the bee effect
* Crimson and warped stems can now trigger the bee effect
* Nether brick works like netherrack and other "common nether materials" now
* Rabbits are replaced by chickens now
* All flowers (and berry bushes) give the wither effect now
* A higher percentage of chickens will spawn with baby zombie riders now
* End stones have the same effect as snow (Haste)
* Doors break after some number of uses
* Weeping Angels effect on armor stands
* Several blocks turn into bedrock when mined
* When the player stands on some blocks, sand will fall from above
* Standing on ore gives Levitation

### Version 1.0

* Initial release
