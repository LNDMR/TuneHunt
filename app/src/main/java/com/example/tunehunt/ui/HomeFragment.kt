package com.example.tunehunt.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.tunehunt.TuneViewModel
import com.example.tunehunt.adapter.TuneAdapter
import com.example.tunehunt.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {

    private lateinit var binding: FragmentHomeBinding

    // wenn mehrere Fragmente sich ein ViewModel teilen
    private val viewModel: TuneViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tuneAdapter = TuneAdapter()
        binding.homeTuneRecycler.adapter = tuneAdapter
    }

}