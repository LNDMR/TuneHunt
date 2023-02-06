package com.example.tunehunt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.tunehunt.R
import com.example.tunehunt.data.model.Tune


class TuneAdapter(): RecyclerView.Adapter<TuneAdapter.ItemViewHolder>() {

    private var dataset = listOf<Tune>()

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val artist: TextView = view.findViewById(R.id.tune_artist_text)
        val title: TextView = view.findViewById(R.id.tune_title_text)
        val card: CardView = view.findViewById(R.id.tune_card)
    }

    fun submitList(list: List<Tune>) {
        dataset = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.tune_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val newTune: Tune = dataset[position]

        holder.title.text = newTune.title
        holder.artist.text = newTune.artist

        // TODO
        holder.card.setOnClickListener {
            // TODO
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}