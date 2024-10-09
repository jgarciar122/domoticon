package com.example.domoticon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domoticon.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] valores = {"", "2", "3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, valores);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adaptador);

        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String opcionSeleccionada = (String) adapterView.getAdapter().getItem(position);
                if (!opcionSeleccionada.isEmpty()) {
                    Intent intent;
                    switch (opcionSeleccionada) {
                        case "2":
                            intent = new Intent(MainActivity.this, Activity2.class);
                            startActivity(intent);
                            break;
                        case "3":
                            //intent = new Intent(MainActivity.this, Activity3.class);
                            //startActivity(intent);
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // No se hace nada si no se selecciona nada
            }
        });
    }
}
