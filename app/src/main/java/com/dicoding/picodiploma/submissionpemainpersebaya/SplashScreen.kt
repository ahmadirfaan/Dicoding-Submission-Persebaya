package com.dicoding.picodiploma.submissionpemainpersebaya

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Handler

class SplashScreen : Activity() {
    lateinit var handler: android.os.Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        handler = android.os.Handler()
        handler.postDelayed({
            val intent = Intent (this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        },5000)
    }
}