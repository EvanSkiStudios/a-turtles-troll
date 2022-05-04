
package com.mercerenies.turtletroll.cookie

import com.mercerenies.turtletroll.Constants
import com.mercerenies.turtletroll.Worlds

import org.bukkit.Location
import org.bukkit.plugin.Plugin
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.bukkit.event.player.PlayerTeleportEvent
import org.bukkit.scheduler.BukkitRunnable

abstract class TeleportToEffect(private val plugin: Plugin) : CookieEffect {

  companion object {

    private val DELAY = Constants.TICKS_PER_SECOND * 3L

  }

  class ToWorldSpawn(_plugin: Plugin) : TeleportToEffect(_plugin) {

    override val message: String =
      "That cookie tastes like the world spawn!"

    override fun getTarget(player: Player): Location {
      // Not ideal, but if for some reason we can't find the
      // overworld, fall back to the player's current world.
      val overworld = Worlds.getOverworld() ?: player.world
      return overworld.getSpawnLocation()
    }

  }

  class ToPlayerSpawn(_plugin: Plugin) : TeleportToEffect(_plugin) {

    private val fallback = ToWorldSpawn(_plugin)

    override val message: String =
      "That cookie tastes like your spawn point!"

    override fun getTarget(player: Player): Location =
      // If the player doesn't have a bed spawn, use world spawn
      player.getBedSpawnLocation() ?: fallback.getTarget(player)

  }

  private inner class TeleportPlayer(val player: Player, val loc: Location) : BukkitRunnable() {
    override fun run() {
      player.teleport(loc, cause)
    }
  }

  abstract val message: String

  open val cause: PlayerTeleportEvent.TeleportCause
    get() = PlayerTeleportEvent.TeleportCause.PLUGIN

  abstract fun getTarget(player: Player): Location

  open override fun cancelsDefault(): Boolean = false

  override fun onEat(stack: ItemStack, player: Player) {
    val target = getTarget(player)
    player.sendMessage(message)
    TeleportPlayer(player, target).runTaskLater(plugin, DELAY)
  }

}
