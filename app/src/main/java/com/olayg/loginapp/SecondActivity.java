package com.olayg.loginapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityHomeBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityHomeBinding binding = ActivityHomeBinding.inflate(getLayoutInflater());

        String username = getIntent().getStringExtra("username");

        binding.tvWelcome.setText(String.format("Hello, %s", username));

        setContentView(binding.getRoot());
    }
}
