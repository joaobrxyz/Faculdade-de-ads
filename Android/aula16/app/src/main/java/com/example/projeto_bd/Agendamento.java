package com.example.projeto_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

public class Agendamento extends AppCompatActivity {
    Spinner spAgeHora;
    DatePicker dpAgeData;
    Button btAgeAgendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);

        spAgeHora = findViewById(R.id.spAgeHora);
        dpAgeData = findViewById(R.id.dpAgeData);
        btAgeAgendar = findViewById(R.id.btAgAgendar);

        String[] horarios = new String[] {"08:00", "08:20", "08:40", "09:00"};

        ArrayAdapter<String> aad = new ArrayAdapter<>(this, android.R.layout.simple_gallery_item, horarios);
        spAgeHora.setAdapter(aad);
    }
}