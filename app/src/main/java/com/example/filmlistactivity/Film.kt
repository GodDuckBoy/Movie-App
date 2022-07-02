package com.example.filmlistactivity

import androidx.annotation.DrawableRes

data class Film (
    var id: String = "",
    var name: String = "",
    var genres: List<String> = listOf(),
    var languages: List<String> = listOf(),
    var audience: String = "",
    var description: String = "",
    var cast: List<String> = listOf(),
    var runningTime: Int = 0,
    @DrawableRes var imageDrawableRes: Int = R.drawable. example_film_thumb
)