package com.muradtop.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.manga.InstallmentsModel

data class Installments(
    @SerializedName("links")
    val links: LinksXXXX
)

fun Installments.toDomain() =
    InstallmentsModel(links.toDomain())