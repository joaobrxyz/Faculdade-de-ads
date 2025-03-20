package com.example.projeto_bd;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText txtLogEmail, txtLogSenha;
    Button btLogAcessar, btLogCadastre_se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLogEmail = findViewById(R.id.txtLogEmail);
        txtLogSenha = findViewById(R.id.txtLogSenha);
        btLogAcessar = findViewById(R.id.btLogAcessar);
        btLogCadastre_se = findViewById(R.id.btLogCadastre_se);

        btLogAcessar.setOnClickListener(this);
        btLogCadastre_se.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btLogAcessar) {
            Intent tela = new Intent(this, MainActivity.class);
            startActivity(tela);
        }
        if (v.getId() == R.id.btLogCadastre_se) {
            Intent tela = new Intent(this, Cadastre_se.class);
            startActivity(tela);
        }
    }
}