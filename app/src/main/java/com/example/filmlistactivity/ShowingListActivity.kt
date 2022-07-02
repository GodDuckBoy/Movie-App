package com.example.filmlistactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_showing_list.*

class ShowingListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showing_list)

        val showingId = intent.getStringExtra(EXTRA_FILM_ID)
        val showings = Data.showings.filter { z -> z.filmId == showingId }

        showingView.layoutManager = LinearLayoutManager( this )
        showingView.adapter = ShowingListAdapter(showings)

    }
    companion object {
        const val EXTRA_FILM_ID = "EXTRA_FILM_ID"
    }
}