package com.jahircelorio.material_framework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnElectronica,btnPunk,btnFestivalbar, btnHiphop, btnRock;

    Float valor1 = 3.50f, vaLor2 = 4.50f,valor3 = 3.0f,valor4= 5.0f;

    RatingBar ratingBar1,ratingBar2,ratingBar3,ratingBar4,ratingBar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnElectronica = findViewById(R.id.btnElectronica);
        btnPunk = findViewById(R.id.btnPunk);
        btnFestivalbar = findViewById(R.id.btnFestivarbar);
        btnHiphop = findViewById(R.id.btnHiphop);
        btnRock = findViewById(R.id.btnRock);
        ratingBar1 = findViewById(R.id.ratingBar1);
        ratingBar1.setRating(valor1);


        ratingBar2 = findViewById(R.id.ratingBar2);
        ratingBar2.setRating(vaLor2);

        ratingBar3 = findViewById(R.id.ratingBar3);
        ratingBar3.setRating(valor4);

        ratingBar4 = findViewById(R.id.ratingBar4);
        ratingBar4.setRating(valor1);

        ratingBar5 = findViewById(R.id.ratingBar5);
        ratingBar5.setRating(valor1);

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
                Toast.makeText(MainActivity.this,"Seleccionaste el Genero Festival Bar =)",Toast.LENGTH_SHORT).show();
            }
        });

        btnHiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Seleccionaste el Género de Hip Hop =)",Toast.LENGTH_SHORT).show();
            }
        });


        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Seleccinaste el Género de Rock. =)",Toast.LENGTH_SHORT).show();
            }
        });
    }
}