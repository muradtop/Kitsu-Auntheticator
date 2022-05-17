package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
