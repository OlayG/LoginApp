package com.olayg.loginapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityHomeBinding;


public class HomeActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "username";

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String userName = getIntent().getStringExtra(EXTRA_USERNAME);
        binding.tvWelcome.setText("Hello, " + userName);
    }
}
