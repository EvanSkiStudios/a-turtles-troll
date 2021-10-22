
package com.mercerenies.turtletroll

import com.mercerenies.turtletroll.feature.AbstractFeature

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class GlassLuckListener(): AbstractFeature(), Listener {

  companion object {
    val SECONDS_PER_SEVEN_YEARS = 3679200
  }

  override val name = "glass"

  override val description = "Breaking any kind of glass gives seven years' bad luck"

  @EventHandler
  fun onBlockBreak(event: BlockBreakEvent) {
    if (!isEnabled()) {
      return
    }
    val block = event.getBlock()
    if (BlockTypes.GLASS.contains(block.type)) {
        event.player.addPotionEffect(PotionEffect(PotionEffectType.UNLUCK, Constants.TICKS_PER_SECOND * SECONDS_PER_SEVEN_YEARS, 10))
        event.player.sendMessage("The glass gods are furious! Seven years bad luck be upon ye!")
    }
  }

}
