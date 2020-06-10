package com.cochipcho.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.cochipcho.coderswag.Adapters.CategoryAdapter
import com.cochipcho.coderswag.Adapters.CategoryRecycleAdapter
import com.cochipcho.coderswag.Model.Category
import com.cochipcho.coderswag.R
import com.cochipcho.coderswag.Services.DataServices
import com.cochipcho.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataServices.categories) {
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, it.title)

            startActivity(productIntent)

        }//ArrayAdapter(this, android.R.layout.simple_list_item_1, DataServices.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataServices.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title}", Toast.LENGTH_SHORT).show()
//
//        }

    }
}
