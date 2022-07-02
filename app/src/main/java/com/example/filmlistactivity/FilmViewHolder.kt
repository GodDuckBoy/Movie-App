package com.example.filmlistactivity

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_film.view.*

class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val filmName = itemView.filmName
    private val filmGenre = itemView.filmGenre
    private val filmDescription = itemView.filmDescription
    private val filmAudience = itemView.filmAudience
    private val filmLanguages = itemView.filmLanguages
    private val filmLength = itemView.filmLength
    private val filmThumb = itemView.filmThumb

    fun bind(film: Film) {
        filmName.text = film.name
        filmGenre.text = film.genres.joinToString(" / ")
        filmDescription.text = film.description
        filmAudience.text = film.audience
        filmLanguages.text = film.languages.joinToString(" / ")
        filmLength.text = "${film.runningTime} min"
        filmThumb.setImageDrawable(ContextCompat.getDrawable(itemView.context,film.imageDrawableRes))

        itemView.setOnClickListener{
            val intent = Intent(itemView.context, ShowingListActivity::class.java) /* Intent (Start File, End File) */
            intent.putExtra(ShowingListActivity.EXTRA_FILM_ID, film.id)
            itemView.context.startActivity(intent)
        }
    }
}
