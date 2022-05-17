package com.muradtop.kitsu.domain.models.anime.genres

data class AnimeGenresModel(
    val data: List<GenresDataModel>?,
    val meta: MetaModel?,
    val links: LinksXModel?
)
