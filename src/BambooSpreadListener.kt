
package com.mercerenies.turtletroll

import com.mercerenies.turtletroll.feature.AbstractFeature
import com.mercerenies.turtletroll.location.BlockSelector
import com.mercerenies.turtletroll.ext.*

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockSpreadEvent
import org.bukkit.entity.EntityType
import org.bukkit.inventory.ItemStack
import org.bukkit.Material
import org.bukkit.scheduler.BukkitRunnable
import org.bukkit.plugin.Plugin
import org.bukkit.Location
import org.bukkit.block.Block
import org.bukkit.block.`data`.`type`.Bamboo

import kotlin.random.Random

class BambooSpreadListener(
  val plugin: Plugin,
) : AbstractFeature(), Listener {

  companion object {

    val VALID_TARGET_BLOCKS = setOf(
      Material.DIRT, Material.MOSS_BLOCK, Material.GRASS_BLOCK, Material.COARSE_DIRT,
      Material.ROOTED_DIRT, Material.GRAVEL, Material.MYCELIUM, Material.PODZOL,
      Material.SAND, Material.RED_SAND, Material.BAMBOO
    )

    val ATTEMPTS = 50

    fun findBaseBamboo(block: Block): Block {
      var curr = block
      var i = 16
      while (curr.location.clone().add(0.0, -1.0, 0.0).block.type == Material.BAMBOO) {
        curr = curr.location.clone().add(0.0, -1.0, 0.0).block
        i -= 1
        // Just a safeguard :)
        if (i < 0) {
          break
        }
      }
      return curr
    }

    fun isValidSpreadBlock(block: Block): Boolean =
      (block.type == Material.AIR) &&
        (VALID_TARGET_BLOCKS.contains(block.location.clone().add(0.0, -1.0, 0.0).block.type))

    fun turnToBamboo(block: Block) {
      block.type = Material.BAMBOO
      val dat = block.getBlockData() as Bamboo
      dat.setLeaves(listOf(Bamboo.Leaves.NONE, Bamboo.Leaves.SMALL, Bamboo.Leaves.LARGE).sample()!!)
      block.setBlockData(dat)
    }

  }

  override val name = "bamboo"

  override val description = "Bamboo spreads like wildfire"

  @EventHandler
  fun onBlockSpread(event: BlockSpreadEvent) {
    if (!isEnabled()) {
      return
    }
    if (event.source.type == Material.BAMBOO) {
      val base = findBaseBamboo(event.source)
      for (_i in 1..ATTEMPTS) {
        val attempt = BlockSelector.getRandomBlockNearDims(base)
        if (isValidSpreadBlock(attempt)) {
          turnToBamboo(attempt)
          break
        }
      }
    }
  }

}
