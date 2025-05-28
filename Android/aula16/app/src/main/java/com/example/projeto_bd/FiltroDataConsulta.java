package com.example.projeto_bd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FiltroDataConsulta extends AppCompatActivity implements View.OnClickListener {
    String email = "";
    Button btFDCConsultar;
    DatePicker dpFDCData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_filtro_data_consulta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.FiltroDataConsulta), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent tela = getIntent();
        Bundle parametos = tela.getExtras();
        email = parametos.getString("email");

        btFDCConsultar = findViewById(R.id.btFDCConsultar);
        dpFDCData = findViewById(R.id.dpFDCData);

        btFDCConsultar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String data = dpFDCData.getDayOfMonth() + "/" + (dpFDCData.getMonth() + 1) + "/" + dpFDCData.getYear();

        Intent tela = new Intent(this, Consulta_Lista.class);
        Bundle parametros = new Bundle();
        parametros.putString("data", data);
        parametros.putString("email", email);
        tela.putExtras(parametros);
        startActivity(tela);
    }
}