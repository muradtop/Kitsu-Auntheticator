package com.muradtop.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.manga.MangaCharactersModel

data class MangaCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXX
)

fun MangaCharacters.toDomain() =
    MangaCharactersModel(links.toDomain())