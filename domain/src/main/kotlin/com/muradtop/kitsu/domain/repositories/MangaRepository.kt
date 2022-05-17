package com.muradtop.kitsu.domain.repositories

import com.muradtop.kitsu.domain.either.Either
import com.muradtop.kitsu.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchDetailedManga(id: String): Flow<Either<String, SingleMangaModel>>
}