package com.muradtop.kitsu.presentation.ui.fragments.auth

import com.muradtop.kitsu.domain.useCases.SignInUseCase
import com.muradtop.kitsu.presentation.base.BaseViewModel
import com.muradtop.kitsu.presentation.models.auth.TokenUI
import com.muradtop.kitsu.presentation.models.auth.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {
    private val _signInState = mutableUiStateFlow<TokenUI>()
    val signInState = _signInState.asStateFlow()

    fun signIn(username: String, password: String) =
        signInUseCase(username, password).gatherRequest(_signInState) { it.toUI() }
}