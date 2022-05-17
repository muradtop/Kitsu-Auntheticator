package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
