package com.example.edgetoedgedemo.sdk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import com.example.edgetoedgedemo.R

class SecureLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_secure_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        setupEdgeToEdgeInsets(view)
        setupClickListeners(view)
    }

    private fun setupEdgeToEdgeInsets(view: View) {
        val welcomeTitle = view.findViewById<TextView>(R.id.welcomeTitle)
        val bottomSection = view.findViewById<LinearLayout>(R.id.bottomSection)

        // Apply window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(view) { _, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())

            // Adjust the welcome title to account for status bar
            welcomeTitle.updatePadding(top = insets.top)

            // Adjust the bottom section to account for navigation bar
            bottomSection.updatePadding(bottom = insets.bottom + 16)

            // Return CONSUMED to indicate we've handled the insets
            WindowInsetsCompat.CONSUMED
        }
    }

    private fun setupClickListeners(view: View) {
        view.findViewById<View>(R.id.loginButton)?.setOnClickListener {
            onLoginClicked()
        }

        view.findViewById<View>(R.id.forgotPassword)?.setOnClickListener {
            onForgotPasswordClicked()
        }

        view.findViewById<View>(R.id.googleSignIn)?.setOnClickListener {
            onGoogleSignInClicked()
        }

        view.findViewById<View>(R.id.biometricSignIn)?.setOnClickListener {
            onBiometricSignInClicked()
        }

        view.findViewById<View>(R.id.signUpLink)?.setOnClickListener {
            onSignUpClicked()
        }
    }

    private fun onLoginClicked() {
        // TODO: Implement login logic
    }

    private fun onForgotPasswordClicked() {
        // TODO: Implement forgot password logic
    }

    private fun onGoogleSignInClicked() {
        // TODO: Implement Google sign in
    }

    private fun onBiometricSignInClicked() {
        // TODO: Implement biometric sign in
    }

    private fun onSignUpClicked() {
        // TODO: Navigate to sign up screen
    }

    companion object {
        private val LOG_TAG = SecureLoginFragment::class.java.simpleName

        fun newInstance(): SecureLoginFragment {
            return SecureLoginFragment()
        }
    }
}