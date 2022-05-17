package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.SmallModel

data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
