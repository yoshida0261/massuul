package com.stah.massuul

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TimelineAdapter(context: Context, wordList: List<String>) :
    RecyclerView.Adapter<TimelineAdapter.TimelineViewHolder>() {

    val wordList = wordList
    val inflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimelineViewHolder {
        val view = inflater.inflate(R.layout.wordlist_item, parent, false)
        return TimelineViewHolder(view, this)
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    override fun onBindViewHolder(holder: TimelineViewHolder, position: Int) {
        val current = wordList[position]
        holder.wordItemView.text = current

    }


    class TimelineViewHolder(itemView: View, adapter: TimelineAdapter) :
        RecyclerView.ViewHolder(itemView) {

        val wordItemView = itemView.findViewById<TextView>(R.id.textView)
        val adapter = adapter

    }
}