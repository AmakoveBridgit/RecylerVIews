   package com.example.recycleviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleviews.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

   class MainActivity : AppCompatActivity() {
       lateinit var rvNames: RecyclerView //

       override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           binding=ActivityMainbinding
           setContentView(binding.root)

       }

       override fun onResume() {
           super.onResume()
           displayfibNums()
           rvNames = findViewById(R.id.rvNames)



       var names =
           listOf("Rachel", "Bree", "Ann", "Bridgit", "Mohyn", "Babra", "Diana", "Aluel", "Kip")

       val namesAdapter = NamesRvAdapter(names)
       val linearLayoutManager = LinearLayoutManager(this)
       binding.rvNames.layoutManager=linearLayoutManager
       binding. rvNames.adapter=namesAdapter
   }
}
