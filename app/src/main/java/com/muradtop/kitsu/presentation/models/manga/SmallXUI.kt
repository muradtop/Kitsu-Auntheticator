package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)