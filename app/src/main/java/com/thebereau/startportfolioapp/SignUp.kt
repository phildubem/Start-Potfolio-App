package com.thebereau.startportfolioapp

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.signup_screen.*


class SignUp : AppCompatActivity() {

    private lateinit var  prefProv: PrefProv

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_screen)

        prefProv = PrefProv(applicationContext)

        btnSin.setOnClickListener {
            prefProv.putString(Constants.NAME, etS1.text.toString())
            prefProv.putString(Constants.EMAIL, etS2.text.toString())
            prefProv.putInt(Constants.PHONE, etS3.text.toString().toInt())
            prefProv.putString(Constants.PASSWORD, etS4.text.toString())


            val loginIntent = Intent (this, LoginActivity::class.java)
            startActivity(loginIntent)

        }

        val pw = findViewById<TextView>(R.id.etS4)
        pw.setOnClickListener {
            pw.transformationMethod = HideReturnsTransformationMethod.getInstance()
        }

    }


}