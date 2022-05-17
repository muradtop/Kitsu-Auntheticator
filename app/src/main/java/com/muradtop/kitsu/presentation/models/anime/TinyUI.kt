package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(
    width, height
)