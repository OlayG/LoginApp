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

        binding.btnLogin.setOnClickListener((View v) -> {
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            //Adding data to the Intent for next component
            intent.putExtra("usernameData", binding.usernameContainer.getEditText().getText().toString());
            startActivity(intent);
        });

    }
}