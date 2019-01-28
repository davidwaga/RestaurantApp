package com.example.restuarantapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //private var movies: List<Movie>? = null
    private var recyclerView: RecyclerView? = null
    private var gridLayout: GridLayoutManager? = null
    //private var adapter:MoviesAdpater? = null
    internal var category: String? = null

    // flag for Internet connection status
    internal var isInternetPresent: Boolean? = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
