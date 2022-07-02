package com.example.filmlistactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ShowingListAdapter(private val shows: List<Showing>) : RecyclerView.Adapter<ShowingViewHolder>() {
    override fun getItemCount(): Int {
        return shows.size
    }
    override fun onCreateViewHolder(group: ViewGroup, vt: Int) : ShowingViewHolder {
        val view = LayoutInflater.from(group.context).inflate(R.layout.item_showing,group,false)
        return ShowingViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ShowingViewHolder, position: Int) {
        viewHolder.hello(shows[position])
    }
}