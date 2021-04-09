package com.example.mathsmodule

import android.app.Activity
import androidx.core.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class WordAdapter(context: Activity, words: ArrayList<Word>, private val mColorResourceId: Int) : ArrayAdapter<Word>(context, 0, words) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.custom_list, parent, false)
        }

        val currentText = getItem(position)

        val numberTextView = listItemView!!.findViewById<View>(R.id.customText) as TextView

        numberTextView.text = currentText!!.getmMiwokTranslation()

        val iconView = listItemView.findViewById<View>(R.id.customImg) as ImageView

        iconView.setImageResource(currentText.imageResourceId)

        val textContainer = listItemView.findViewById<View>(R.id.numList)
        val color = ContextCompat.getColor(context, mColorResourceId)
        textContainer.setBackgroundColor(color)

        return listItemView
    }

    companion object {

        private val LOG_TAG = WordAdapter::class.java.simpleName
    }
}