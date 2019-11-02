package com.blogspot.devcleannotes.tutorial_app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    public void login(View loginBtn) {
        // get the username view
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        Log.d("debug", "Button Pressed!");
        Log.d("username", username.getText().toString());
        Log.d("password", password.getText().toString());
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
