package com.cochipcho.coderswag.Services

import com.cochipcho.coderswag.Model.Category
import com.cochipcho.coderswag.Model.Product

object DataServices {

    val category = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Deveslopes Graphic Beanie", "$18","hat01"),
        Product("Deveslopes Hat Black", "$20","hat02"),
        Product("Deveslopes Hat White", "$18","hat03"),
        Product("Deveslopes Hat Snapback", "$22","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$32","hoodie02"),
        Product("Devslopes Gray Hoodie","$28","hoodie03"),
        Product("Devslopes Black Hoodie","$32","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Badge Light Gray","$20","shirt02"),
        Product("Devslopes Logo Shirt Red","$22","shirt03"),
        Product("Devslopes Hustle","$22","shirt04"),
        Product("Kickflip Studio","$18","shirt05")
    )

}