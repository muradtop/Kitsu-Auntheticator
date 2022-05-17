package com.muradtop.kitsu.presentation.models.anime.genres

import com.muradtop.kitsu.domain.models.anime.genres.GenresDataModel

data class GenresDataUI(
    val id: String?,
    val type: String?,
    val links: LinksUI?,
    val genres: GenreUI?
)

fun GenresDataModel.toUI() = GenresDataUI(id, type, links?.toUI(), genres?.toUI())