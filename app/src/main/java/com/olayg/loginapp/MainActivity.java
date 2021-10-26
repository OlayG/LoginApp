package com.olayg.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityHomeBinding;
import com.olayg.loginapp.databinding.ActivityLoginBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void onLogin(View view) {
        EditText username = binding.usernameContainer.getEditText();
        EditText password = binding.passwordContainer.getEditText();

        if (username != null || password != null) {
            assert username != null;
            String usernameText = username.getText().toString();

            assert password != null;
            String passwordText = password.getText().toString();

            if (passwordText.equals("workisfun")) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("username", usernameText);
                intent.putExtra("password", passwordText);

                final Runnable r = () -> startActivity(intent);
                new Handler().post(r);
            }
        }
    }
}
