package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.DimensionsModel

data class DimensionsUI(

    val tiny: TinyUI,
    val small: SmallUI,
    val medium: MediumUI,
    val large: LargeUI
)

fun DimensionsModel.toUI() = DimensionsUI(
    tiny.toUI(), small.toUI(), medium.toUI(), large.toUI()
)