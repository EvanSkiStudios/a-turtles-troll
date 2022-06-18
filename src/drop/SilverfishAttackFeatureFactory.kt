
package com.mercerenies.turtletroll.drop

import com.mercerenies.turtletroll.Weight
import com.mercerenies.turtletroll.feature.container.DropFeatureContainer
import com.mercerenies.turtletroll.feature.container.AbstractDropFeatureContainer
import com.mercerenies.turtletroll.feature.builder.BuilderState
import com.mercerenies.turtletroll.feature.builder.FeatureContainerFactory
import com.mercerenies.turtletroll.drop.nearby.SilverfishAttackAction

object SilverfishAttackFeatureFactory : FeatureContainerFactory<DropFeatureContainer> {

  override fun create(state: BuilderState): DropFeatureContainer = object : AbstractDropFeatureContainer() {

    private val silverfishAttackAction = SilverfishAttackAction().asFeature(
      "silverfish",
      "Breaking stone blocks will sometimes result in a silverfish attack",
    )

    override val features = listOf(silverfishAttackAction)

    override val actions = listOf(Weight(silverfishAttackAction, 0.2))

  }

}
