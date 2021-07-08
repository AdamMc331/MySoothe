package com.adammcneilly.mysoothe

data class Collection(
    val name: String,
    val imageRes: Int,
)

val favoriteCollectionsOne = listOf(
    Collection("Short mantras", R.drawable.short_mantras),
    Collection("Nature meditations", R.drawable.nature_meditations),
    Collection("Stress and anxiety", R.drawable.stress_and_anxiety),
)

val favoriteCollectionsTwo = listOf(
    Collection("Self-massage", R.drawable.self_massage),
    Collection("Overwhelmed", R.drawable.overwhelmed),
    Collection("Nightly wind down", R.drawable.nightly_wind_down),
)