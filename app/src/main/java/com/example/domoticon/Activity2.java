package com.example.domoticon;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private ImageView bombillaImageView1;
    private ImageView bombillaImageView2;
    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bombilla);

        bombillaImageView1 = findViewById(R.id.imageView1);
        bombillaImageView2 = findViewById(R.id.imageView2);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton2 = findViewById(R.id.toggleButton2);

        toggleButton1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bombillaImageView1.setImageResource(R.drawable.encendido);
            } else {
                bombillaImageView1.setImageResource(R.drawable.apagado);
            }
        });

        toggleButton2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bombillaImageView2.setImageResource(R.drawable.encendido);
            } else {
                bombillaImageView2.setImageResource(R.drawable.apagado);
            }
        });
    }
}
