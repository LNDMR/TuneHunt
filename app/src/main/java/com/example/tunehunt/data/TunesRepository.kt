package com.example.tunehunt.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tunehunt.data.model.Tune

class TunesRepository {

    // Live data is implemented in repository
    private val _tunes = MutableLiveData<List<Tune>>(loadTunes())
    val tunes: LiveData<List<Tune>>
        get() = _tunes

    private fun loadTunes(): List<Tune> {
        return listOf(
            Tune(1, "Labrinth", "Sexy MF"),
            Tune(2, "chuala", "2high"),
            Tune(3, "Eminem", "The Real Slim Shady"),
            Tune(4, "Paula Hartmann", "Kugeln im Lauf"),
            Tune(5, "LP", "Girls Go Wild"),
            Tune(6, "Billie Eilish", "NDA"),
            Tune(7, "BABYJOY", "1, 2, 3 "),
            Tune(8, "The Rolling Stones", "Emotional Rescue"),
            Tune(9, "Jamie T", "Dragon Bones"),
            Tune(10, "Fat Freddy's Drop", "Flashback"),
            Tune(11, "Nightmares On Wax", "Be, I Do"),
            Tune(12, "Mungo Jerry", "In The Summertime"),
            Tune(13, "Joey Purp", "Elastic")
        )
    }
}