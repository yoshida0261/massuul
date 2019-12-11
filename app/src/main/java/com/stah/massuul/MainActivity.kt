package com.stah.massuul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: TimelineAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wordList = listOf("test", "bbb", "aaa", "ccc")

        recycleViewTimeline.adapter = TimelineAdapter(this, wordList = wordList)
        recycleViewTimeline.layoutManager = LinearLayoutManager(this)
    }
}
