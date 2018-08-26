package com.example.ritwik.experiment;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.BeforeAfterSlider;

public class MainActivity extends AppCompatActivity {

    BeforeAfterSlider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = findViewById(R.id.mySlider);
        Drawable before = getResources().getDrawable(R.drawable.before);
        Drawable after = getResources().getDrawable(R.drawable.after);
        slider.setBeforeImage(before).setAfterImage(after);
    }
}
