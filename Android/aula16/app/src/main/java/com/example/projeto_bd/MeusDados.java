package com.example.projeto_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MeusDados extends AppCompatActivity {
    String email = "";
    EditText txtMeuNome, txtMeuEmail, txtMeuCPF, txtMeuSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        Intent tela = getIntent();
        Bundle parametos = tela.getExtras();
        email = parametos.getString("email");

        txtMeuNome = findViewById(R.id.txtMeuNome);
        txtMeuEmail = findViewById(R.id.txtMeuEmail);
        txtMeuCPF = findViewById(R.id.txtMeuCPF);
        txtMeuSenha = findViewById(R.id.txtMinhaSenha);

        BancoControllerUsuarios bd = new BancoControllerUsuarios(getBaseContext());

        Cursor dados = bd.consultaPorEmail(email) ;

        if(dados.moveToFirst()){
            txtMeuNome.setText( dados.getString(1) );
            txtMeuCPF.setText( dados.getString(2) );
            txtMeuEmail.setText( dados.getString(3) );
            txtMeuSenha.setText( dados.getString(4) );
        }
    }
}