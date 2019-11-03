package com.blogspot.devcleannotes.tutorial_app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class CurrencyConverter extends AppCompatActivity {

    public void convertToRupees(View view) {
        Log.d("event", "Btn Pressed!");
        String dollars = ((EditText) findViewById(R.id.dollars)).getText().toString();
        EditText rupees = findViewById(R.id.rupees);
        // clear any previous conversion
        rupees.getText().clear();
        if (isValidDollars(dollars)) {
            rupees.getText().append(getRupees(dollars));
        }
    }

    private boolean isValidDollars(String inputDollars) {
        if (inputDollars == null || inputDollars.trim().length() == 0) {
            Toast.makeText(this, "Provide valid input!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (inputDollars.startsWith("-")) {
            Toast.makeText(this, "Currency cannot be negative!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private String getRupees(String dollarsS) {
        float dollarsF = Float.parseFloat(dollarsS);
        Log.d("dollarS", dollarsS);
        return String.format(Locale.ENGLISH, "%.2f", 70.52f * dollarsF);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency_converter);
    }
}
