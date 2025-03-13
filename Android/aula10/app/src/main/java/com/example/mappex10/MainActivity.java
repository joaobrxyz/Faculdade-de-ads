package com.example.mappex10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btMostrarData;
    DatePicker data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMostrarData = findViewById(R.id.btMostrarData);
        data = findViewById(R.id.data);

        btMostrarData.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setMessage("Data Selecionada: " +
                data.getDayOfMonth() + "/" + (data.getMonth()+1) + "/" + data.getYear());
        dialogo.setNeutralButton("ok",null);
        dialogo.setTitle("Atenção");
        dialogo.show();
    }
}