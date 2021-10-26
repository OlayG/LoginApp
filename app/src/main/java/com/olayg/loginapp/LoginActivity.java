package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
//import android.os.Handler;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityLoginBinding binding = ActivityLoginBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String username = binding.usernameContainer.getEditText().getText().toString();
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("extraString", username);
                startActivity(intent);
            }
        });
    }

//    @Override
//    public View onCreateInputView() {
//        KeyboardView inputView = (KeyboardView) getLayoutInflater().inflate(R.layout.activity_login, null);
//
//        inputView.setOnKeyboardActionListener((KeyboardView.OnKeyboardActionListener) this);
//
//        return inputView;
//    }
}