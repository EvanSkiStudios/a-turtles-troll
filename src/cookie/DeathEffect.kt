
package com.mercerenies.turtletroll.cookie

import com.mercerenies.turtletroll.Constants
import com.mercerenies.turtletroll.Worlds

import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.plugin.Plugin
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.bukkit.event.player.PlayerTeleportEvent
import org.bukkit.scheduler.BukkitRunnable

class DeathEffect(private val plugin: Plugin) : CookieEffect {

  companion object {

    private val DELAY = Constants.TICKS_PER_SECOND * 3L

  }

  private inner class KillPlayer(val player: Player) : BukkitRunnable() {
    override fun run() {
      // TODO Death reason
      player.damage(99999.0)
    }
  }

  private val message: String = "That cookie tastes like death!"

  override fun cancelsDefault(): Boolean = false

  override fun onEat(stack: ItemStack, player: Player) {
    player.sendMessage(message)
    KillPlayer(player).runTaskLater(plugin, DELAY)
  }

}