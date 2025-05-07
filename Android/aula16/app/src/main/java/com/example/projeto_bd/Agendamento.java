package com.example.projeto_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class Agendamento extends AppCompatActivity implements View.OnClickListener {
    Spinner spAgeHora;
    DatePicker dpAgeData;
    Button btAgeAgendar;
    String email, data, hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);

        Intent tela = getIntent();
        Bundle parametos = tela.getExtras();
        email = parametos.getString("email");

        spAgeHora = findViewById(R.id.spAgeHora);
        dpAgeData = findViewById(R.id.dpAgeData);
        btAgeAgendar = findViewById(R.id.btAgAgendar);

        String[] horarios = new String[] {"08:00", "08:20", "08:40", "09:00"};

        ArrayAdapter<String> aad = new ArrayAdapter<>(this, android.R.layout.simple_gallery_item, horarios);
        spAgeHora.setAdapter(aad);

        btAgeAgendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        data = dpAgeData.getDayOfMonth() + "/" + (dpAgeData.getMonth()+1) + "/" + dpAgeData.getYear();
        hora = spAgeHora.getSelectedItem().toString();

        BancoControllerAgendamento bd = new BancoControllerAgendamento(getBaseContext());
        String resultado;

        resultado = bd.insereAgendamento(data, hora, email);

        Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
    }
}