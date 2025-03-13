package com.example.mappex11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TimePicker hora;
    Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hora = findViewById(R.id.hora);
        btMostrar = findViewById(R.id.btMostrar);

        btMostrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setMessage("Hora selecionada: "
        + String.valueOf(hora.getHour() + ":"
        + String.valueOf(hora.getMinute())));
        dialogo.setNeutralButton("OK", null);
        dialogo.setTitle("Atenção");
        dialogo.show();
    }
}