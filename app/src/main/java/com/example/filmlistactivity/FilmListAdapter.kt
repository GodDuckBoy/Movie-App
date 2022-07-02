package com.example.filmlistactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilmListAdapter(private val films: List<Film>) : RecyclerView.Adapter<FilmViewHolder>() {
    override fun getItemCount(): Int {
        return films.size
    }
    override fun onCreateViewHolder(group: ViewGroup, vt: Int) : FilmViewHolder {
        val view = LayoutInflater.from(group.context).inflate(R.layout.item_film,group,false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: FilmViewHolder, position: Int) {
        viewHolder.bind(films[position])
    }
}