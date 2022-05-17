package com.muradtop.kitsu.presentation.ui.fragments.anime.detailed

import com.muradtop.kitsu.domain.useCases.FetchDetailedAnimeUseCase
import com.muradtop.kitsu.presentation.base.BaseViewModel
import com.muradtop.kitsu.presentation.models.anime.SingleAnimeUI
import com.muradtop.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedAnimeViewModel @Inject constructor(
    private val fetchSingleAnimeUseCase: FetchDetailedAnimeUseCase,
) : BaseViewModel() {
    private val _singleAnimeState = mutableUiStateFlow<SingleAnimeUI>()
    var singleAnimeState = _singleAnimeState.asStateFlow()


    fun fetchSingleAnime(id: String) =
        fetchSingleAnimeUseCase(id).gatherRequest(_singleAnimeState) { it.toUI() }


}