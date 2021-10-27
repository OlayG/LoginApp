package com.olayg.loginapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
//declare binding
    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button loginButton = (Button) findViewById(R.id.btn_login);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Do something in response to button click
//            }
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = binding.usernameContainer.getEditText().getText().toString();
                String pass = binding.passwordContainer.getEditText().getText().toString();
                Intent urMom = new Intent(LoginActivity.this, HomeActivity.class);
                urMom.putExtra("user", name);
                urMom.putExtra("pass", pass);
                startActivity(urMom);
            }
        });
//        initialize binding
//        link xml view using binding
    }
}