package com.olayg.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.olayg.loginapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private String userName;
    private String userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.usernameContainer.getEditText().addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                userName = s.toString();
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

            }
        });
        userPassword = binding.passwordContainer.getEditText().getText().toString().trim();

        binding.btnLogin.setOnClickListener(v -> {
            System.out.println(userName);
            System.out.println(userPassword);
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.putExtra("key",userName);
            startActivity(intent);
        });
    }
}
