package com.example.edgetoedgedemo.sdk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        setupClickListeners(view)
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