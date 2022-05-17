package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())