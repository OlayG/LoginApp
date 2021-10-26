package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityLoginBinding binding = ActivityLoginBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String username = Objects.requireNonNull(binding.usernameContainer.getEditText()).getText().toString();
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("extraString", username);
                startActivity(intent);
            }
        });
    }

}