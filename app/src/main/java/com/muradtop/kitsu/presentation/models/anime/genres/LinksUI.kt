package com.muradtop.kitsu.presentation.models.anime.genres

import com.muradtop.kitsu.domain.models.anime.genres.LinksModel

data class LinksUI(
    val self: String?
)

fun LinksModel.toUI() = LinksUI(self)