package com.adammcneilly.mysoothe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.adammcneilly.mysoothe.R

private val KulimParkLight = FontFamily(Font(R.font.kulim_park_light))
private val KulimParkRegular = FontFamily(Font(R.font.kulim_park_regular))
private val LatoBold = FontFamily(Font(R.font.lato_bold))
private val LatoRegular = FontFamily(Font(R.font.lato_regular))

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontSize = 28.sp,
        letterSpacing = 1.15.sp,
        fontFamily = KulimParkLight,
    ),
    h2 = TextStyle(
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        fontFamily = KulimParkRegular,
    ),
    h3 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = LatoBold,
    ),
    body1 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = LatoRegular,
    ),
    button = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,
        fontFamily = LatoBold,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        letterSpacing = 1.15.sp,
        fontFamily = KulimParkRegular,
    ),
)