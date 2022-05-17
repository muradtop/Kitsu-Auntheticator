package com.muradtop.kitsu.data.remote.authenticator

import com.muradtop.kitsu.data.local.preferences.PreferencesHelper
import com.muradtop.kitsu.data.remote.apiservices.AuthenticationApiService
import com.muradtop.kitsu.data.remote.dtos.auth.RefreshToken
import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject

class RefreshTokenAuthenticator @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? {
        return runBlocking {

            val refreshedAccessToken = getRefreshedToken()
            preferencesHelper.accessToken = refreshedAccessToken.accessToken
            response.request.newBuilder()
                .addHeader("Authorization: Bearer", "${preferencesHelper.accessToken}")
                .build()
        }

    }

    private suspend fun getRefreshedToken() =
        authenticationApiService.refreshAccessToken(RefreshToken(refreshToken = preferencesHelper.refreshToken))


}