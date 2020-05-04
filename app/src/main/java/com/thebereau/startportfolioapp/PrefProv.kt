package com.thebereau.startportfolioapp

import android.content.Context

class PrefProv (context: Context) {

    private val sharedPreferences = context.getSharedPreferences("com.thebereau.startportfolioapp", 0)

    fun putString (key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString (key: String) : String? {
        return sharedPreferences.getString(key, null)
    }

    fun putInt (key: String, value: Int) {
        sharedPreferences.edit().putInt(key, value).apply()
    }

    fun getInt (key: String): Int {
        return sharedPreferences.getInt(key, 0)
    }

}