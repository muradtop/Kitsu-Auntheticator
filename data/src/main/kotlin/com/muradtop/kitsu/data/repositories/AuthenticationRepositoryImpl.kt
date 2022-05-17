package com.muradtop.kitsu.data.repositories

import com.muradtop.kitsu.data.local.preferences.PreferencesHelper
import com.muradtop.kitsu.data.remote.apiservices.AuthenticationApiService
import com.muradtop.kitsu.data.remote.dtos.auth.AuthDto
import com.muradtop.kitsu.data.remote.dtos.auth.toDomain
import com.muradtop.kitsu.data.repositories.base.BaseRepository
import com.muradtop.kitsu.domain.models.auth.TokenModel
import com.muradtop.kitsu.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {

    override fun authenticate(
        username: String,
        password: String
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}