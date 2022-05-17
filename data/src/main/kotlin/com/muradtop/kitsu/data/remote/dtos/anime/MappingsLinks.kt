package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class LinksXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXX.toDomain() = com.muradtop.kitsu.domain.models.anime.LinksXXXXXModel(
    self, related
)