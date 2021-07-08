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

val alignYourBodyCollections = listOf(
    Collection("Inversions", R.drawable.inversions),
    Collection("Quick Yoga", R.drawable.quick_yoga),
    Collection("Stretching", R.drawable.stretching),
    Collection("Tabata", R.drawable.tabata),
    Collection("HIIT", R.drawable.hiit),
    Collection("Pre-natal yoga", R.drawable.pre_natal_yoga),
)

val alignYourMindCollections = listOf(
    Collection("Meditate", R.drawable.meditate),
    Collection("With kids", R.drawable.with_kids),
    Collection("Aromatherapy", R.drawable.aromatherapy),
    Collection("On the go", R.drawable.on_the_go),
    Collection("With pets", R.drawable.with_pets),
    Collection("High stress", R.drawable.high_stress),
)