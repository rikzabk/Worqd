package com.example.worqd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class HomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var recyclerView3: RecyclerView
    private lateinit var adapter: RecyclerAdapter

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val hometoolbar: Toolbar = findViewById(R.id.homeToolbar)
        setSupportActionBar(hometoolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        postToList()

        recyclerView = findViewById(R.id.rv_recycler_card)
        recyclerView2 = findViewById(R.id.rv_recycler_card2)
        recyclerView3 = findViewById(R.id.rv_recycler_card3)
        adapter = RecyclerAdapter(titlesList, descList, imagesList)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = RecyclerAdapter(titlesList, descList, imagesList)
        recyclerView2.adapter = RecyclerAdapter(titlesList, descList, imagesList)
        recyclerView3.adapter = RecyclerAdapter(titlesList, descList, imagesList)
    }

    private fun addToList(title: String, description: String, image: Int) {
        titlesList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        for (i in 1..5) {
            addToList("Title $i", "Description $i", R.drawable.bg_welcome_page)
        }
    }
}