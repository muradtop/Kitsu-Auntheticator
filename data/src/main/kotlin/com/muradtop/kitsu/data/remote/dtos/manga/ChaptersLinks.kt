package com.muradtop.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXXModel

data class LinksXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String

)

fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXXModel(
    self, related
)