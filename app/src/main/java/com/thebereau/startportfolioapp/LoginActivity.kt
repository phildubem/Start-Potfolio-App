package com.thebereau.startportfolioapp


import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_screen.*
import kotlinx.android.synthetic.main.signup_screen.*

class LoginActivity : AppCompatActivity () {

    private lateinit var  prefProv: PrefProv

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        prefProv = PrefProv(applicationContext)


        val pw = findViewById<TextView>(R.id.etL2)
        pw.setOnClickListener {
            pw.transformationMethod = HideReturnsTransformationMethod.getInstance()
        }

        btnLog.setOnClickListener {
            etL1.setText(prefProv.getString(Constants.EMAIL))
            etL2.setText(prefProv.getString(Constants.PASSWORD))


            val mainIntent = Intent (this, MainActivity::class.java)
            startActivity(mainIntent)
        }


    }

}