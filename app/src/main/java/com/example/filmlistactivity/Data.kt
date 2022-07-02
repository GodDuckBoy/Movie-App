package com.example.filmlistactivity

import java.util.*

object Data {
    val films = listOf(
        Film(
            "1",
            "Squid Game",
            listOf("Survival", "Horror", "Drama"),
            listOf("EN", "TH", "KR"),
            "18+",
            "Follows the story of the talented neurosurgeon Doctor Stephen Strange who, after a tragic car accident, must learn the secrets of a magic",
            listOf("Lee Jung-jae", "HoYeon Jung", "O Yeong-su", "Anupam Tripathi"),
            380,
            R.drawable.squid
        ),
        Film(
            "2",
            "Pacific Rim",
            listOf("Action", "Monster", "Adventure"),
            listOf("TH", "EN", "JP"),
            "13+",
            "Long ago, legions of monstrous creatures called Kaiju arose from the sea, bringing with them all-consuming war. To fight the Kaiju, mankind developed giant robots called Jaegers to defeat the Kaiju",
            listOf(
                "Rinko Kikuchi",
                "Charlie Day",
                "Idris Elba",
                "Max Martini",
                "Robert Kazinsky"
            ),
            115,
            R.drawable.pacific
        ),
        Film(
            "3",
            "Red Notice",
            listOf("Action", "Adventure", "Sci-fi", "Funny", "Crime"),
            listOf("EN", "TH", "RU"),
            "15+",
            "Two art thieves and an FBI profiler are on a hunt for valuable pieces of art",
            listOf("Jason Momoa", "Amber Heard", "Nicole Kidman"),
            123,
            R.drawable.red
        )
    )

    val showings = listOf(
        Showing(UUID.randomUUID().toString(), "3", "1", "Red Notice",10, 0, "1", "2D", "TH", "TH"),
        Showing(UUID.randomUUID().toString(), "1", "1", "Squid Game", 12, 30, "1", "2D", "TH", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "1", "Red Notice", 15, 0, "1", "2D", "RU", "TH"),
        Showing(UUID.randomUUID().toString(), "1", "1", "Squid Game", 17, 30, "1", "2D", "KR", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "1", "Red Notice", 20, 0, "1", "2D", "KR", "TH"),
        Showing(UUID.randomUUID().toString(), "2", "1", "Pacific Rim", 21, 30, "1", "2D", "TH", "-"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 13, 0, "1", "3D", "EN", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 15, 30, "1", "3D", "RU", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 18, 0, "1", "3D", "EN", "TH"),
        Showing(UUID.randomUUID().toString(), "2", "2", "Pacific Rim", 13, 30, "2", "2D", "EN", "-"),
        Showing(UUID.randomUUID().toString(), "2", "2", "Pacific Rim", 15, 30, "2", "2D", "TH", "-"),
        Showing(UUID.randomUUID().toString(), "2", "2", "Pacific Rim", 17, 30, "2", "2D", "JP", "-"),
        Showing(UUID.randomUUID().toString(), "2", "2", "Pacific Rim", 19, 30, "2", "2D", "TH", "-"),
        Showing(UUID.randomUUID().toString(), "1", "2", "Squid Game", 14, 10, "3", "2D", "EN", "-"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 16, 40, "3", "2D", "RU", "-"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 19, 10, "3", "2D", "TH", "-"),
        Showing(UUID.randomUUID().toString(), "1", "2", "Squid Game", 13, 15, "4", "2D", "TH", "TH"),
        Showing(UUID.randomUUID().toString(), "1", "2", "Squid Game", 15, 45, "4", "2D", "KR", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 15, 0, "5", "IMAX", "RU", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 17, 30, "5", "IMAX", "EN", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "2", "Red Notice", 20, 0, "5", "IMAX", "EN", "TH"),
        Showing(UUID.randomUUID().toString(), "3", "3", "Red Notice", 18, 10, "1", "2D", "RU", "-"),
        Showing(UUID.randomUUID().toString(), "3", "3", "Red Notice", 20, 40, "1", "2D", "TH", "-"),
        Showing(UUID.randomUUID().toString(), "2", "3", "Pacific Rim", 18, 35, "2", "2D", "JP", "-"),
        Showing(UUID.randomUUID().toString(), "2", "3", "Pacific Rim", 20, 35, "2", "2D", "TH", "-"),
        Showing(UUID.randomUUID().toString(), "2", "3", "Pacific Rim", 22, 35, "2", "2D", "EN", "-"),
        Showing(UUID.randomUUID().toString(), "1", "3", "Squid Game", 19, 0, "3", "2D", "KR", "-"),
        Showing(UUID.randomUUID().toString(), "1", "3", "Squid Game", 21, 30, "3", "2D", "TH", "-")
    )
}