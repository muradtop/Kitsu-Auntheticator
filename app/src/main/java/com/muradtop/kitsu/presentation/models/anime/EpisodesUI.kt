package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.EpisodesModel

data class EpisodesUI(
    val links: LinksXXXXXXXXUI
)

fun EpisodesModel.toUI() = EpisodesUI(links.toUI())
