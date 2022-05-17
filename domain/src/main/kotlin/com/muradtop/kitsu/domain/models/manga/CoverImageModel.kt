package com.muradtop.kitsu.domain.models.manga

data class CoverImageModel(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXModel
)
