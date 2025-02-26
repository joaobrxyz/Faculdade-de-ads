package com.example.mappex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView figura;
    Button btGato, btCachorro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular os objetos
        figura = (ImageView) findViewById(R.id.figura);
        btGato = (Button) findViewById(R.id.btGato);
        btCachorro = (Button) findViewById(R.id.btCachorro);

        // Programando os clicks nos botões
        btGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figura.setImageResource(R.drawable.gato);
            }
        });

        btCachorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                figura.setImageResource(R.drawable.cachorro);
            }
        });

    }
}