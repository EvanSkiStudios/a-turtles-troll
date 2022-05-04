
package com.mercerenies.turtletroll.cookie

import com.mercerenies.turtletroll.feature.RunnableFeature
import com.mercerenies.turtletroll.feature.container.FeatureContainer
import com.mercerenies.turtletroll.feature.container.ListenerContainer
import com.mercerenies.turtletroll.feature.builder.BuilderState
import com.mercerenies.turtletroll.feature.builder.FeatureContainerFactory
import com.mercerenies.turtletroll.feature.CompositeFeature
import com.mercerenies.turtletroll.recipe.AngelRecipeFeature
import com.mercerenies.turtletroll.SpawnReason
import com.mercerenies.turtletroll.Weight

import org.bukkit.plugin.Plugin

import kotlin.collections.HashMap
import kotlin.random.Random

abstract class CookieListenerFactory() : FeatureContainerFactory<FeatureContainer> {

  // CookieListenerFactory is an abstract class that can be
  // parameterized by the desired cookie effects. The companion object
  // is a concrete subclass with a suitable default list of cake
  // effects.
  companion object : CookieListenerFactory() {

    override fun getEffects(plugin: Plugin) =
      CookieEat.defaultEffects(plugin)

  }

  abstract fun getEffects(plugin: Plugin): List<Weight<CookieEffect>>

  override fun create(state: BuilderState): FeatureContainer =
    ListenerContainer(CookieListener(state.plugin, getEffects(state.plugin)))

}