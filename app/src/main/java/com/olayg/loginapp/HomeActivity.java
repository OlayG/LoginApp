package com.olayg.loginapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    // ActivityHomeBinding is always referenced to the xml file it's related to (most likely in your resource -> layout package
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // .inflate goes converts xml to the java class we'll be using
        // getLayoutInflater comes from parent/base/super class of ActivityHomeBinding
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        String usernameValue = getIntent().getStringExtra("usernameData");
        binding.tvWelcome.setText("Hello, " + usernameValue);
    }
}
