package com.thebereau.startportfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        Log.d("OnCreate", "The activity is in onCreate state")
    }

    override fun onStart() {
        super.onStart()

        Log.d("onStart", "The activity is in onStart state")
    }

    override fun onResume() {
        super.onResume()

        Log.d("OnResume", "The activity is in onResume state")
    }

    override fun onPause() {
        super.onPause()

        Log.d("OnPause", "The activity is in onPause state")
    }

    override fun onStop() {
        super.onStop()

        Log.d("onStop", "The activity is in onStop state")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("onDestroy", "The activity is in onDestroy state")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("onRestart", "The activity is in onRestart state")
    }

}
