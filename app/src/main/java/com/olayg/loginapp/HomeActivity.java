package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.olayg.loginapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding binding = ActivityHomeBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        String username = getIntent().getStringExtra(Constants.USERNAME_TAG);
        binding.tvWelcome.setText("Hello, " + username + "!");
    }
}