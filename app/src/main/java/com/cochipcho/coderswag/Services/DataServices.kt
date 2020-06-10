package com.cochipcho.coderswag.Services

import com.cochipcho.coderswag.Model.Category
import com.cochipcho.coderswag.Model.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Deveslopes Graphic Beanie", "$18","hat1"),
        Product("Deveslopes Hat Black", "$20","hat2"),
        Product("Deveslopes Hat White", "$18","hat3"),
        Product("Deveslopes Hat Snapback", "$22","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Gray Hoodie","$28","hoodie3"),
        Product("Devslopes Black Hoodie","$32","hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Badge Light Gray","$20","shirt2"),
        Product("Devslopes Logo Shirt Red","$22","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Kickflip Studio","$18","shirt5")
    )

    var digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}