package com.mishrole.platzimusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_profile)

        // Resources reference
        //R.color.purple_200

        /*
        * View is an inline element
        * ViewGroup is a group of inline elements, and those elements inherit properties from the parent
        * */

        val tvProfileTitle = R.id.tvProfileTitle.toString()
    }
}