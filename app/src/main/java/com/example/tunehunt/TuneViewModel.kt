package com.example.tunehunt

import androidx.lifecycle.ViewModel
import com.example.tunehunt.data.TunesRepository

class TuneViewModel: ViewModel() {

    private val repository = TunesRepository()

    val tunes = repository.tunes


}