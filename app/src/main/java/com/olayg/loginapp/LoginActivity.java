package com.olayg.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.olayg.loginapp.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View viewWithALowercaseV = binding.getRoot();
        setContentView(viewWithALowercaseV);

        MaterialButton button = binding.btnLogin;
        // JAVA 8+
        /*button.setOnClickListener(v -> {

        });*/

        // JAVA 7
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
                String name = binding.etUsername.getText().toString();
                String password = binding.passwordContainer.getEditText().getText().toString();
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra(HomeActivity.EXTRA_USERNAME, name);
                intent.putExtra(Constants.EXTRA_PASSWORD, password);
                startActivity(intent);
            }
        });
    }
}
