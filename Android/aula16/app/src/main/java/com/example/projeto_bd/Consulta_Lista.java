package com.example.projeto_bd;

import androidx.appcompat.app.AppCompatActivity;


import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;


import java.util.LinkedList;
import java.util.List;
public class Consulta_Lista extends AppCompatActivity {
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_lista);


        List<ModeloDados> listaAgendamento =null;
        listaAgendamento = consultaTodosAgendamentos();


        AgendaAdapter adaptador = new AgendaAdapter(this, listaAgendamento);


        lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adaptador);
    }


    private List<ModeloDados> consultaTodosAgendamentos() {
        List<ModeloDados> lista = new LinkedList<ModeloDados>();


        BancoControllerAgendamento bd = new BancoControllerAgendamento(getBaseContext());
        Cursor dados = bd.ConsultarAgendamentos();


        if (dados != null){
            // se encontrou dados na tabela de agendamento
            do {
                ModeloDados item = new ModeloDados();
                item.setIdAgendamento(dados.getInt(0));
                item.setData(dados.getString(1));
                item.setHora(dados.getString(2));
                item.setEmail(dados.getString(3));
                lista.add(item);
            } while (dados.moveToNext());
        }else{
            String msg = "Não há agendamentos efetuados";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
        return lista;
    }
}
