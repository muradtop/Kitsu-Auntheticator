package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXX.toDomain() = com.muradtop.kitsu.domain.models.anime.LinksXXModel(
    self, related
)