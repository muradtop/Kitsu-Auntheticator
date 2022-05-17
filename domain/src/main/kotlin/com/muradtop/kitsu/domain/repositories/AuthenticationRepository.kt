package com.muradtop.kitsu.domain.repositories

import com.muradtop.kitsu.domain.either.Either
import com.muradtop.kitsu.domain.models.auth.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password: String): Flow<Either<String, TokenModel>>
}