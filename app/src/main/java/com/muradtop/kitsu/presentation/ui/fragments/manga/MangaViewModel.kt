package com.muradtop.kitsu.presentation.ui.fragments.manga

import com.muradtop.kitsu.data.repositories.MangaRepositoryImpl
import com.muradtop.kitsu.presentation.base.BaseViewModel
import com.muradtop.kitsu.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPagedManga().gatherPagingRequest { it.toUI() }
}