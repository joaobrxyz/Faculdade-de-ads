package com.example.projeto_bd;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
            if (validaLogin()) {
                Intent tela = new Intent(this, MainActivity.class);
                startActivity(tela);
            }
        }
        if (v.getId() == R.id.btLogCadastre_se) {
            Intent tela = new Intent(this, Cadastre_se.class);
            startActivity(tela);
        }
    }
    public boolean validaLogin() {
        String email = txtLogEmail.getText().toString();
        String senha = txtLogSenha.getText().toString();
        String msg = "";
        if(email.isEmpty()) {
            msg = "O campo de E-mail deve ser preenchido!";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            return false;
        } else if (senha.isEmpty()) {
            msg = "O campo SENHA não foi preenchido!";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            return false;
        }
        BancoControllerUsuarios bd = new BancoControllerUsuarios(getBaseContext());

        Cursor dados = bd.consultaDadosLogin(email, senha);

        if(dados.moveToFirst()){
            return true;
        } else {
            msg = "O E-mail / Senha não estão cadastrados no sistema, CADASTRE-SE";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            return false;
        }
    }
}