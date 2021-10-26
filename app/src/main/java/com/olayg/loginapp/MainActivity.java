package com.olayg.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void onLogin(View view) {
        EditText username = binding.usernameContainer.getEditText();
        EditText password = binding.passwordContainer.getEditText();

        String usernameText = username != null ? username.getText().toString() : null;
        String passwordText = password != null ? password.getText().toString() : null;

        if (!Objects.equals(usernameText, "") && Objects.equals(passwordText, "workisfun")) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("username", usernameText);
            intent.putExtra("password", passwordText);

            startActivity(intent);
        }
    }
}
