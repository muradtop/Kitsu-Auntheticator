package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.SingleMangaModel

data class SingleMangaUI(
    val data: MangaDataUI
)

fun SingleMangaModel.toUI() = SingleMangaUI(data.toUI())
