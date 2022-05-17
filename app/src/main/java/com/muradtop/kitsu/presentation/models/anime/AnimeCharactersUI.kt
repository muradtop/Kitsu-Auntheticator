package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.AnimeCharactersModel

data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI
)

fun AnimeCharactersModel.toUI() = AnimeCharactersUI(links.toUI())
