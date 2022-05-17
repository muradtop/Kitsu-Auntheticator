package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
