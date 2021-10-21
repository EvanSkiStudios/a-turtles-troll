
package com.mercerenies.turtletroll

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.Location
import org.bukkit.plugin.Plugin
import org.bukkit.scheduler.BukkitRunnable

abstract class BreakOnSightListener(_plugin: Plugin) : OnSightListener(_plugin) {

  override fun performEffect(player: Player, block: Block) {
    block.breakNaturally()
  }

}
