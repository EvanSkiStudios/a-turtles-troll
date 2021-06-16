
package com.mercerenies.turtletroll

import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.plugin.Plugin

class BreakLightOnSightListener(_plugin: Plugin) : BreakOnSightListener(_plugin) {

  companion object {
    val BLOCKS = setOf(
      Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.SOUL_TORCH,
      Material.SOUL_WALL_TORCH, Material.TORCH, Material.WALL_TORCH, Material.LANTERN,
      Material.SOUL_LANTERN,
    )
  }

  override val name: String = "torches"

  override val description: String = "Torches and similar light sources break when you look at them"

  override fun shouldTrigger(block: Block): Boolean =
    BLOCKS.contains(block.type)

}
