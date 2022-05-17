package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.ChaptersModel

data class ChaptersUI(
    val links: LinksXXXXXXXXUI
)

fun ChaptersModel.toUI() = ChaptersUI(links.toUI())