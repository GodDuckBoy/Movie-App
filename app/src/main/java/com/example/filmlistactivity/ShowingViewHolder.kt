package com.example.filmlistactivity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_film.view.filmName
import kotlinx.android.synthetic.main.item_showing.view.*

class ShowingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //fileName from the left is come from RecycleView (item_showing)
    private val filmName = itemView.filmName
    private val timeHour = itemView.timeHour
    private val timeMin = itemView.timeMin
    private val languageAud = itemView.languageAud
    private val screen = itemView.screen

    // name1 is come from Showing.kt and call it
    fun hello(showings: Showing) {
        filmName.text = showings.name1
        timeHour.text = "${showings.timeHour}:"
        timeMin.text = showings.timeMin.toString()
        screen.text = "Screen ${showings.screen}"
        languageAud.text = "${showings.languageAud}/-"
    }
}