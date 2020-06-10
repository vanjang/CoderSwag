package com.cochipcho.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.cochipcho.coderswag.Adapters.CategoryAdapter
import com.cochipcho.coderswag.Model.Category
import com.cochipcho.coderswag.R
import com.cochipcho.coderswag.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataServices.categories)//ArrayAdapter(this, android.R.layout.simple_list_item_1, DataServices.categories)
        categoryListView.adapter = adapter
    }
}
