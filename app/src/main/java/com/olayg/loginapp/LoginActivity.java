package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    String username, password;

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = binding.usernameContainer.getEditText().toString();
                password = binding.passwordContainer.getEditText().toString();

                Intent usernameInput = new Intent(LoginActivity.this, HomeActivity.class);
                usernameInput.putExtra("data", username);
                Intent passwordInput = new Intent(LoginActivity.this, HomeActivity.class);
                passwordInput.putExtra("data", password);
                startActivity(usernameInput);
                startActivity(passwordInput);
            }
        });
    }
}