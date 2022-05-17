package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI
)

fun GenresModel.toUI() = GenresUI(links.toUI())