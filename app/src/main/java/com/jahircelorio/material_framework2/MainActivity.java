package com.jahircelorio.material_framework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnElectronica,btnPunk,btnFestivalbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnElectronica = findViewById(R.id.btnElectronica);
        btnPunk = findViewById(R.id.btnPunk);
        btnFestivalbar = findViewById(R.id.btnFestivarbar);

        btnElectronica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Seleccionaste el Género Eléctronica =)", Toast.LENGTH_SHORT).show();
            }
        });

        btnPunk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Seleccionaste el Género Punk =)", Toast.LENGTH_SHORT).show();
            }
        });


        btnFestivalbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Seleccionaste el Método Festival Bar =)",Toast.LENGTH_SHORT).show();
            }
        });


    }
}