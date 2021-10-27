package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = ActivityLoginBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(v -> {
            String username = Objects.requireNonNull(binding.usernameContainer.getEditText())
                    .getText()
                    .toString();
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.putExtra("extraString", username);
            startActivity(intent);
        });
    }

}