package com.example.mappex7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtPortfolio, txtProva, txtExercicios, txtMedia;
    Button btCalcular, btLimpar;
    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular os objetos

        txtPortfolio = findViewById(R.id.txtPort);
        txtProva = findViewById(R.id.txtProva);
        txtExercicios = findViewById(R.id.txtExercicios);
        txtMedia = findViewById(R.id.txtMedia);
        btCalcular = findViewById(R.id.btCalcular);
        btLimpar = findViewById(R.id.btLimpar);
        imagem = findViewById(R.id.imagem);

        btCalcular.setOnClickListener(this);
        btLimpar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // Se o usuário clicou no botão limpar
        if (v.getId() == R.id.btLimpar) {
            txtPortfolio.setText("");
            txtMedia.setText("");
            txtExercicios.setText("");
            txtProva.setText("");
            imagem.setImageResource(R.drawable.ic_launcher_background);
        }
        // Se o usuário clicou no botão calcular
        if (v.getId() == R.id.btCalcular) {
            double port = Double.parseDouble(txtPortfolio.toString());
            double exercicios = Double.parseDouble(txtExercicios.toString());
            double prova = Double.parseDouble(txtProva.toString());
            double media = (exercicios * 0.2) + (port * 0.3) + (prova * 0.5);
            txtMedia.setText(""+media);

            if (media >= 6) {
                imagem.setImageResource(R.drawable.bom);
            } else {
                imagem.setImageResource(R.drawable.ruim);
            }
        }
    }
}