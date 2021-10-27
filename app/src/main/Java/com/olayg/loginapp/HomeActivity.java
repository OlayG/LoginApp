package com.olayg.loginapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityHomeBinding;
import com.olayg.loginapp.databinding.ActivityLoginBinding;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_home);
        String username = getIntent().getStringExtra("user");
        binding.tvWelcome.setText("hello, " + username);
    }
}
