package com.example.edgarsc.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.edgarsc.Adapters.CategoryAdapter
import com.example.edgarsc.Adapters.CategoryRecycleAdapter
import com.example.edgarsc.Model.Category
import com.example.edgarsc.R
import com.example.edgarsc.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //middle man pa vidu list view un datiem
    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        //stricly for optimization
        categoryListView.setHasFixedSize(true)

    }
}
