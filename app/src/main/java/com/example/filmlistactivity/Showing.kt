package com.example.filmlistactivity

data class Showing(
    var id: String = "",
    var filmId: String = "",
    var cinemaId: String= "",
    var name1: String= "",
    var timeHour: Int = 0,
    var timeMin: Int = 0,
    var screen: String = "",
    var format: String = "",
    var languageAud: String = "",
    var languageSub: String = ""
)