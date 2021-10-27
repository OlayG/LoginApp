package com.olayg.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.olayg.loginapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    // how to create a constant in Java, never going to change and is written in memory when compiling
    private static final String TAG = "LoginActivity";
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        MaterialButton button = binding.btnLogin;

        // Lambda way (JAVA 8+) removes excess boilerplate, all you need is parameter and scope
        button.setOnClickListener(v -> {

        });

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
                // variables should be in this function at the time it is needed
                String name = binding.usernameContainer.getEditText().getText().toString();
                String password = binding.passwordContainer.getEditText().getText().toString();
                // Intent is a way to let the OS know you want to navigate between two components
                // Can be used to pass data, we are using it explicitly
                                            // Start point , End point
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra(HomeActivity.EXTRA_USERNAME, name);
                intent.putExtra("password", password);
                startActivity(intent);

            }
        });
        // JAVA 7
//        button.setOnClickListener((View v) -> {
//            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
//            //Adding data to the Intent for next component
//            intent.putExtra("usernameData", binding.usernameContainer.getEditText().getText().toString());
//            startActivity(intent);
//        });

    }
}