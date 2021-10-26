package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.olayg.loginapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityHomeBinding binding = ActivityHomeBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.tvWelcome.setText("Hello, FireNinja");
    }
}