package com.example.mappex9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spOpcoes;
    ListView lvOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spOpcoes = findViewById(R.id.spOpcoes);
        lvOpcoes = findViewById(R.id.lvOpcoes);

        String[] periodolv = {"Manhã", "Tarde", "Noite"};
        ArrayAdapter<String> aadlv = new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, periodolv);
        lvOpcoes.setAdapter(aadlv);

        String[] periodo = getResources().getStringArray(R.array.periodo);
        ArrayAdapter<String> aad = new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, periodo);
        spOpcoes.setAdapter(aad);

    }
}