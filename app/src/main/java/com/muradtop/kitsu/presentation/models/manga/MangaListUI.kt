package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MangaListModel

data class MangaListUI(
    val data: List<MangaDataUI>,
    val meta: MetaXXUI,
    val links: LinksXXXXXXXXXXXUI
)

fun MangaListModel.toUI() = MangaListUI(data.map { it.toUI() }, meta.toUI(), links.toUI())
