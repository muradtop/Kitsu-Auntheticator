package com.muradtop.kitsu.presentation.models.anime.genres

import com.muradtop.kitsu.domain.models.anime.genres.LinksXModel

data class LinksXUI(
    val first: String?,
    val last: String?
)

fun LinksXModel.toUI() = LinksXUI(first, last)