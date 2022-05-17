package com.muradtop.kitsu.presentation.models.anime.genres

import com.muradtop.kitsu.domain.models.anime.genres.MetaModel

data class MetaUI(
    val count: Int?
)

fun MetaModel.toUI() = MetaUI(count)
