package com.blogspot.devcleannotes.tutorial_app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ImageActivity extends AppCompatActivity {

    public void changeImgBtn(View view) {

        Log.d("event", "Btn Pressed");
        ImageView image = findViewById(R.id.imageView);
        image.setImageResource(getRandomDrawable());

    }

    private int getRandomDrawable() {
        int r = getRandom(0, 1);
        switch (r) {
            case 0: {
                Log.d("image", "earth");
                return R.drawable.earth;
            }
            case 1: {
                Log.d("image", "scientist");
                return R.drawable.scientist;
            }
        }
        Log.d("default image:", "scientist");
        return 1;
    }

    private int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);
    }
}
