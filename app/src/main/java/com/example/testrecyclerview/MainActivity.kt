package com.example.testrecyclerview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    //Declare the variable
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(  this)
        recycler_view.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recycler_view.adapter = adapter
    }


}