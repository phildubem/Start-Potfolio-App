package com.thebereau.startportfolioapp

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);


        Log.d("OnCreate", "The activity is in onCreate state")


        //setting listeners
        ImgV1.setOnClickListener {

            val message = "Hey Phil"

            val mailIntent = Intent().apply {
                action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                type = "text/plain"
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(mailIntent, "Open With"))

            }
        }


        ImgV2.setOnClickListener {
            val fbIntent: Intent= try {
                // Check if FB app is even installed
                this.packageManager.getPackageInfo("com.facebook.katana", 0)
                val facebookScheme = "fb://page/"
                Intent(Intent.ACTION_VIEW, Uri.parse(facebookScheme))
            } catch (e: Exception) {

                // Cache and Open a url in browser
                val facebookProfileUri = "https://www.facebook.com/phildubem"
                Intent(Intent.ACTION_VIEW, Uri.parse(facebookProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(fbIntent, "Open With"))

            }
        }


        ImgV3.setOnClickListener {

            val contact = "+234 7065748014" // use country code with your phone number

            val url = "https://api.whatsapp.com/send?phone=$contact"
            try {
                this.packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)

                startActivity(i)


            } catch (e: PackageManager.NameNotFoundException) {
                Log.e("WS", "ERROR_OPEN_MESSANGER"+e.toString());
            }
        }


        ImgV4.setOnClickListener {

            val webIntent: Intent = Uri.parse("http://www.google.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(webIntent, "Open With"))

            }
        }


        ImgV5.setOnClickListener {

            val webIntent: Intent = Uri.parse("http://www.github.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(webIntent, "Open With"))

            }
        }


        ImgV6.setOnClickListener {

            val isIntent: Intent= try {
                // Check if Insta app is even installed
                this.packageManager.getPackageInfo("com.instagram.android", 0)
                val facebookScheme = "https://www.instagram.com"
                Intent(Intent.ACTION_VIEW, Uri.parse(facebookScheme))
            } catch (e: Exception) {

                // Cache and Open a url in browser
                val instaProfileUri = "https://www.instagram.com/phildubem"
                Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(isIntent, "Open With"))

            }
        }


        ImgV7.setOnClickListener {

            val isIntent: Intent= try {
                // Check if line app is even installed
                this.packageManager.getPackageInfo("com.line.android", 0)
                val Scheme = "https://www.line.com"
                Intent(Intent.ACTION_VIEW, Uri.parse(Scheme))
            } catch (e: Exception) {

                // Cache and Open a url in browser
                val inProfileUri = "https://www.line.com/"
                Intent(Intent.ACTION_VIEW, Uri.parse(inProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(isIntent, "Open With"))

            }
        }


        ImgV8.setOnClickListener {

            val isIntent: Intent= try {
                // Check if YT app is even installed
                this.packageManager.getPackageInfo("com.google.android.youtube", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"))
            } catch (e: Exception) {

                // Cache and Open a url in browser
                val ytProfileUri = "https://www.youtube.com/"
                Intent(Intent.ACTION_VIEW, Uri.parse(ytProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(isIntent, "Open With"))

            }
        }


        ImgV9.setOnClickListener {

            val slIntent: Intent= try {
                // Check if Slack app is even installed
                this.packageManager.getPackageInfo("com.slack", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.slack.com"))

            } catch (e: Exception) {
                val slProfileUri = "https://www.slack.com/"
                Intent(Intent.ACTION_VIEW, Uri.parse(slProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(slIntent, "Open With"))

            }

        }


        ImgV10.setOnClickListener {

            val twIntent: Intent= try {
                // Check if Twitter app is even installed
                this.packageManager.getPackageInfo("com.twitter.android", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=phildubem"))
            } catch (e: Exception) {

                val tProfileUri = "https://www.twitter.com/phildubem"
                Intent(Intent.ACTION_VIEW, Uri.parse(tProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(twIntent, "Open With"))

            }

        }


        ImgV11.setOnClickListener {

            val contactUserName = "phildubem"

            val skIntent: Intent= try {
                // Check if Skype app is even installed
                this.packageManager.getPackageInfo("com.skype.raider", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("skype:" + contactUserName+ "?call&video=true"))
            } catch (e: Exception) {

                val skProfileUri = "https://www.skype.com/en/"
                Intent(Intent.ACTION_VIEW, Uri.parse(skProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(skIntent, "Open With"))

            }

        }


        ImgV12.setOnClickListener {


            val psIntent: Intent= try {
                // Check if Playstore app is even installed
                this.packageManager.getPackageInfo("com.android.vending", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/"))
            } catch (e: Exception) {

                val skProfileUri = "https://play.google.com/store/apps/"
                Intent(Intent.ACTION_VIEW, Uri.parse(skProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(psIntent, "Open With"))

            }
        }


        ImgV13.setOnClickListener {

            val callIntent: Intent = Uri.parse("tel:+234 7065748014").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(callIntent, "Open With"))

            }
        }


        ImgV14.setOnClickListener {

            val lnIntent: Intent= try {
                // Check if linkedin app is even installed
                this.packageManager.getPackageInfo("com.linkedin.android", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://"))
            } catch (e: Exception) {
                val lnProfileUri = "https://www.linkedin.com/in/phildubem"
                Intent(Intent.ACTION_VIEW, Uri.parse(lnProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(lnIntent, "Open With"))

            }
        }


        ImgV15.setOnClickListener {

            val pnIntent: Intent= try {
                // Check if pinterest app is even installed
                this.packageManager.getPackageInfo("com.pinterest", 0)
                Intent(Intent.ACTION_VIEW, Uri.parse("pinterest://"))
            } catch (e: Exception) {
                val lnProfileUri = "https://www.pinterest.com/"
                Intent(Intent.ACTION_VIEW, Uri.parse(lnProfileUri))
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(pnIntent, "Open With"))

            }
        }


        ImgV16.setOnClickListener {

            val webIntent: Intent = Uri.parse("http://www.thebereau.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }

            //verifies intent would resolve to at least one activity
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(webIntent, "Open With"))

            }
        }

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
