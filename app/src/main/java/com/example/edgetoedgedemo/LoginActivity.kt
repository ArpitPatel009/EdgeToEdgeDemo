package com.example.edgetoedgedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat.enableEdgeToEdge

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(window)
        setContentView(R.layout.activity_login)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        supportFragmentManager.commit {
            replace(R.id.loginFragment, SecureLoginFragment(), CIAM_FRAGMENT_TAG)
        }
    }


    companion object {
        private val LOG_TAG = LoginActivity::class.java.simpleName
        private const val tncTag = "termsandconditions"
        private const val CIAM_FRAGMENT_TAG = "ciamfragment"
    }
}