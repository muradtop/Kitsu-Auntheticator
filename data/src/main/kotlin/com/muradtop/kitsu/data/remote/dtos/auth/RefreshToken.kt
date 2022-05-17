package com.muradtop.kitsu.data.remote.dtos.auth


import com.google.gson.annotations.SerializedName

data class RefreshToken(
    @SerializedName("grant_type")
    val grantType: String = "refresh_token",
    @SerializedName("refresh_token")
    val refreshToken: String
)