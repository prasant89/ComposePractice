package com.prasant.composepractice.data

import androidx.annotation.DrawableRes
import com.prasant.composepractice.R

object Data {

    class Demo(
        @DrawableRes var imgage:Int,
        var name:String,
        var desc:String,
        var price:String
    )

    var dataList = listOf(
        Demo(
            R.drawable.heroine_1,
            "Sila",
            "Top Dancer In India",
            "$290"),
        Demo(
            R.drawable.heroine_2,
            "Sakira",
            "Top Singer In India",
            "$280"),
        Demo(
            R.drawable.heroine,
            "Sila",
            "Top Bar Girl Dancer In India",
            "$700"),
        Demo(
            R.drawable.heroine_1,
            "Anuska",
            "Top Dancer In India",
            "$500"),
        Demo(
            R.drawable.heroine_2,
            "Sagita",
            "Ever green Dancer",
            "$890"),
        Demo(
            R.drawable.heroine_1,
            "Madhuri",
            "Dreem Girl",
            "$20000"),
        Demo(
            R.drawable.heroine_2,
            "SilSila",
            "Top Dancer In India",
            "$467"),
        Demo(
            R.drawable.images,
            "Juli",
            "Top Dancer Master",
            "$290"),
        Demo(
            R.drawable.heroine_2,
            "Mama",
            "Dance Dancer In India",
            "$3333"),
        Demo(
            R.drawable.heroine_1,
            "Ambika",
            "Top Dancer In India",
            "$29022"),
        Demo(
            R.drawable.heroine,
            "Sila",
            "Top Dancer Ebver Market",
            "$29220"),
        Demo(
            R.drawable.heroine_1,
            "Babina",
            "Top Dancer In India",
            "$29044"),
        Demo(
            R.drawable.heroine_2,
            "Nabika",
            "Top Dancer In India",
            "$290454")
    )
}