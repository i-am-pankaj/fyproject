package com.example.mathsmodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MinusList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minus_list)

        val nOne1 = findViewById<ImageView>(R.id.number_one) as ImageView
        val nTwo2 = findViewById<ImageView>(R.id.number_two) as ImageView
        val nThree3 = findViewById<ImageView>(R.id.number_three) as ImageView
        val nFour4 = findViewById<ImageView>(R.id.number_four) as ImageView
        val nFive5 = findViewById<ImageView>(R.id.number_five) as ImageView
        val nSix6 = findViewById<ImageView>(R.id.number_six) as ImageView
        val nSeven7 = findViewById<ImageView>(R.id.number_seven) as ImageView
        val nEight8 = findViewById<ImageView>(R.id.number_eight) as ImageView
        val nNine9 = findViewById<ImageView>(R.id.number_nine) as ImageView
        val nTen10 = findViewById<ImageView>(R.id.number_ten) as ImageView


        val mOne1 = findViewById<ImageView>(R.id.number_one1) as ImageView
        val mTwo2 = findViewById<ImageView>(R.id.number_two2) as ImageView
        val mThree3 = findViewById<ImageView>(R.id.number_three3) as ImageView
        val mFour4 = findViewById<ImageView>(R.id.number_four4) as ImageView
        val mFive5 = findViewById<ImageView>(R.id.number_five5) as ImageView
        val mSix6 = findViewById<ImageView>(R.id.number_six6) as ImageView
        val mSeven7 = findViewById<ImageView>(R.id.number_seven7) as ImageView
        val mEight8 = findViewById<ImageView>(R.id.number_eight8) as ImageView
        val mNine9 = findViewById<ImageView>(R.id.number_nine9) as ImageView
        val mTen10 = findViewById<ImageView>(R.id.number_ten10) as ImageView

        val nText1 = findViewById<TextView>(R.id.num_one) as TextView
        val nText2 = findViewById<TextView>(R.id.num_two) as TextView

        val resImg1 = findViewById<ImageView>(R.id.res1) as ImageView
        val resImg2 = findViewById<ImageView>(R.id.res2) as ImageView

        val minus = findViewById<ImageView>(R.id.getMinus) as ImageView



        nOne1.setOnClickListener {
            nText1.text = "1"
        }

        nTwo2.setOnClickListener {
            nText1.text = "2"
        }

        nThree3.setOnClickListener {
            nText1.text = "3"
        }

        nFour4.setOnClickListener {
            nText1.text = "4"
        }

        nFive5.setOnClickListener {
            nText1.text = "5"
        }

        nSix6.setOnClickListener {
            nText1.text = "6"
        }

        nSeven7.setOnClickListener {
            nText1.text = "7"
        }

        nEight8.setOnClickListener {
            nText1.text = "8"
        }

        nNine9.setOnClickListener {
            nText1.text = "9"
        }

        nTen10.setOnClickListener {
            nText1.text = "10"
        }

        mOne1.setOnClickListener {
            nText2.text = "1"
        }

        mTwo2.setOnClickListener {
            nText2.text = "2"
        }

        mThree3.setOnClickListener {
            nText2.text = "3"
        }

        mFour4.setOnClickListener {
            nText2.text = "4"
        }

        mFive5.setOnClickListener {
            nText2.text = "5"
        }

        mSix6.setOnClickListener {
            nText2.text = "6"
        }

        mSeven7.setOnClickListener {
            nText2.text = "7"
        }

        mEight8.setOnClickListener {
            nText2.text = "8"
        }

        mNine9.setOnClickListener {
            nText2.text = "9"
        }

        mTen10.setOnClickListener {
            nText2.text = "10"
        }


        minus.setOnClickListener {

            if(nText1.text == "10")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_nine)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_eight)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_seven)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.number_six)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.number_five)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.number_four)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
            }

            if(nText1.text == "9")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_eight)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_seven)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_six)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.number_five)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.number_four)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
            }

            if(nText1.text == "8")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_seven)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_six)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_five)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.number_four)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
            }

            if(nText1.text == "7")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_six)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_five)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_four)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.one)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.two)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.three)

                }
            }

            if(nText1.text == "6")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_five)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_four)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_three)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_four)

                }
            }

            if(nText1.text == "5")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_four)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_three)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_four)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_five)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_six)

                }
            }

            if(nText1.text == "4")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_three)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_three)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_four)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_five)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_six)

                }
            }

            if(nText1.text == "3")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_two)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_three)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_four)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_five)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_six)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_seven)

                }
            }

            if(nText1.text == "2")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.number_one)
                    resImg2.setImageResource(0)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_three)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_four)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_five)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_six)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_seven)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_eight)

                }
            }

            if(nText1.text == "1")
            {
                if(nText2.text == "1")
                {
                    resImg1.setImageResource(R.drawable.zero)
                    resImg2.setImageResource(R.drawable.zero)

                }
                if(nText2.text == "2")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_one)

                }
                if(nText2.text == "3")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_two)

                }
                if(nText2.text == "4")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_three)

                }
                if(nText2.text == "5")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_four)

                }
                if(nText2.text == "6")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_five)

                }
                if(nText2.text == "7")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_six)

                }
                if(nText2.text == "8")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_seven)

                }
                if(nText2.text == "9")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_eight)

                }
                if(nText2.text == "10")
                {
                    resImg1.setImageResource(R.drawable.minus)
                    resImg2.setImageResource(R.drawable.number_nine)

                }
            }

        }
    }
}