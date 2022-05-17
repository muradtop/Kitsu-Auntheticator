package com.muradtop.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.genres.LinksModel

data class LinksDto(
    @SerializedName("self")
    val self: String?
)

fun LinksDto.toDomain() = LinksModel(self)