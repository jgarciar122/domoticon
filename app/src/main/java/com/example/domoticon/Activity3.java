package com.example.domoticon;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    private ImageView bombilla1, bombilla2, bombilla3;
    private ToggleButton toggleButton1, toggleButton2, toggleButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bombilla2);

        bombilla1 = findViewById(R.id.imageView1);
        bombilla2 = findViewById(R.id.imageView2);
        bombilla3 = findViewById(R.id.imageView3);

        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton2 = findViewById(R.id.toggleButton2);
        toggleButton3 = findViewById(R.id.toggleButton3);

        toggleButton1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bombilla1.setImageResource(R.drawable.encendido);
            } else {
                bombilla1.setImageResource(R.drawable.apagado);
            }
        });

        toggleButton2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bombilla2.setImageResource(R.drawable.encendido);
            } else {
                bombilla2.setImageResource(R.drawable.apagado);
            }
        });

        toggleButton3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bombilla3.setImageResource(R.drawable.encendido);
            } else {
                bombilla3.setImageResource(R.drawable.apagado);
            }
        });

    }
}
