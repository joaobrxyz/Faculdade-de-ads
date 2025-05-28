package com.example.projeto_bd;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Menu extends AppCompatActivity implements View.OnClickListener {
    ImageButton btMNUContatos, btMNUMeusDados, btMNUAgendamento, btMNUConsultaAgendamento;
    String email = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent tela = getIntent();
        Bundle parametos = tela.getExtras();
        email = parametos.getString("email");

        btMNUContatos = findViewById(R.id.btMNUContatos);
        btMNUMeusDados = findViewById(R.id.btMNUDados);
        btMNUAgendamento = findViewById(R.id.btMNUAgendamento);
        btMNUConsultaAgendamento = findViewById(R.id.btMNUConsultaAgendamento);
        btMNUAgendamento.setOnClickListener(this);
        btMNUContatos.setOnClickListener(this);
        btMNUMeusDados.setOnClickListener(this);
        btMNUConsultaAgendamento.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btMNUContatos){
            Intent tela = new Intent(this, MainActivity.class);
            startActivity(tela);
        }
        if (v.getId() == R.id.btMNUDados) {
            Intent tela = new Intent(this, MeusDados.class);
            Bundle parametros = new Bundle();
            parametros.putString("email", email);
            tela.putExtras(parametros);
            startActivity(tela);
        }
        if (v.getId() == R.id.btMNUAgendamento) {
            Intent tela = new Intent(this, Agendamento.class);
            Bundle parametros = new Bundle();
            parametros.putString("email", email);
            tela.putExtras(parametros);
            startActivity(tela);
        }
        if (v.getId() == R.id.btMNUConsultaAgendamento) {
            Intent tela = new Intent(this, FiltroDataConsulta.class);
            Bundle parametros = new Bundle();
            parametros.putString("email", email);
            tela.putExtras(parametros);
            startActivity(tela);
        }
    }
}
