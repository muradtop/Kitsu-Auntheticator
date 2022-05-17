package com.muradtop.kitsu.presentation.models.anime.genres

import com.muradtop.kitsu.domain.models.anime.genres.AnimeGenresModel

data class AnimeGenresUI(
    val data: List<GenresDataUI>?,
    val meta: MetaUI?,
    val links: LinksXUI?
)

fun AnimeGenresModel.toUI() =
    AnimeGenresUI(data?.map { it.toUI() }, meta?.toUI(), links?.toUI())