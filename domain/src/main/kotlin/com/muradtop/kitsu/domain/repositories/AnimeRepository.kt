package com.muradtop.kitsu.domain.repositories

import com.muradtop.kitsu.domain.either.Either
import com.muradtop.kitsu.domain.models.anime.SingleAnimeModel
import com.muradtop.kitsu.domain.models.anime.genres.AnimeGenresModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnimeModel>>
    fun fetchAnimeGenres(id: String): Flow<Either<String, AnimeGenresModel>>
}