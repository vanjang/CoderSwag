package com.cochipcho.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cochipcho.coderswag.R
import com.cochipcho.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
