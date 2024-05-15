package com.example.projectclicnt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.example.projectclicnt.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setupListeners()

    }

    private fun setupListeners() {
        binding.submitButton.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            } else {
                // Handle login logic here
                Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show()
            }
        }

        binding.forgotPasswordTextView.setOnClickListener {
            // Handle forgot password logic here
            Toast.makeText(this, "Forgot password clicked", Toast.LENGTH_SHORT).show()
        }

        binding.signUpTextView.setOnClickListener {
            // Handle sign-up logic here
            Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show()
        }

        binding.editTextEmail.doOnTextChanged { text, _, _, _ ->
            // Handle text change if needed
        }

        binding.passwordEditText.doOnTextChanged { text, _, _, _ ->
            // Handle text change if needed
        }
    }

}



