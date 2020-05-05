package com.thebereau.startportfolioapp

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.signup_screen.*




class SignUp : AppCompatActivity() {

    private lateinit var  prefProv: PrefProv

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_screen)

        prefProv = PrefProv(applicationContext)


        val pw = findViewById<TextView>(R.id.etS4)
        pw.setOnClickListener {
            pw.transformationMethod = HideReturnsTransformationMethod.getInstance()
        }

        btnSin.setOnClickListener {
            prefProv.putString(Constants.NAME, etS1.text.toString())
            prefProv.putString(Constants.EMAIL, etS2.text.toString())
            prefProv.putString(Constants.PHONE, etS3.text.toString())
            prefProv.putString(Constants.PASSWORD, etS4.text.toString())


            val loginIntent = Intent (this, LoginActivity::class.java)
            if (etS1.text.isEmpty() || etS2.text.isEmpty()) {
                Toast.makeText(applicationContext, "All Fields Required", Toast.LENGTH_LONG).show()
            } else if(etS3.text.isEmpty() || etS4.text.isEmpty()) {
                Toast.makeText(applicationContext, "All Fields Required", Toast.LENGTH_LONG).show()
            }else {
                startActivity(loginIntent)
            }

        }


    }




}