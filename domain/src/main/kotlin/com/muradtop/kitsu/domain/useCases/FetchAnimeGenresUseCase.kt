package com.muradtop.kitsu.domain.useCases

import com.muradtop.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeGenresUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeGenres(id)
}