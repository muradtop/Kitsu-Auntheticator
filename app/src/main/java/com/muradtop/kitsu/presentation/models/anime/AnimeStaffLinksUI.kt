package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXUI(self, related)
