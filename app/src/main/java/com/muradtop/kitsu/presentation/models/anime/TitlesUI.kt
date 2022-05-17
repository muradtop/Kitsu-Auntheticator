package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.TitlesModel

data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
