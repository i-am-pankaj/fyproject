package com.example.mathsmodule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class NumberList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_list)

        val ListView = this.findViewById<ListView>(R.id.numList) as ListView

        val custom_grid_data = WordAdapter(this,word_data, R.color.number)

        ListView.adapter = custom_grid_data

    }

    val word_data : ArrayList<Word>
        get()
        {
            val grid_custom_data: ArrayList<Word> = ArrayList<Word>().apply {

                add(Word("One",R.drawable.one))
                add(Word("Two",R.drawable.two))
                add(Word("Three",R.drawable.three))
                add(Word("Four",R.drawable.four))
                add(Word("Five",R.drawable.five))
                add(Word("Six",R.drawable.six))
                add(Word("Seven",R.drawable.seven))
                add(Word("Eight",R.drawable.eight))
                add(Word("Nine",R.drawable.nine))
                add(Word("Ten",R.drawable.ten))

            }


            return grid_custom_data
    }
}