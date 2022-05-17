package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.AnimeProductionsModel

data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI
)

fun AnimeProductionsModel.toUI() = AnimeProductionsUI(links.toUI())
