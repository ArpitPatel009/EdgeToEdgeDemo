package com.example.edgetoedgedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat.enableEdgeToEdge
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import com.example.edgetoedgedemo.sdk.SecureLoginFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Must be called before super.onCreate() to properly transition from splash theme
        installSplashScreen()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge(window)
        setContentView(R.layout.activity_login)
        setupEdgeToEdge()

        supportFragmentManager.commit {
            replace(R.id.loginFragment, SecureLoginFragment(), CIAM_FRAGMENT_TAG)
        }
    }

    private fun setupEdgeToEdge() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginScrollView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    companion object {
        private val LOG_TAG = LoginActivity::class.java.simpleName
        private const val tncTag = "termsandconditions"
        private const val CIAM_FRAGMENT_TAG = "ciamfragment"
    }
}