package com.example.mappex8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ckLivros, ckAulas, ckVideos, ckOutros;
    RadioButton rdPratica, rdTeoria;
    Button btExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os objetos
        ckLivros = findViewById(R.id.ckLivros);
        ckAulas = findViewById(R.id.ckAulas);
        ckVideos = findViewById(R.id.ckVideos);
        ckOutros = findViewById(R.id.ckOutros);

        rdPratica = findViewById(R.id.rdPratica);
        rdTeoria = findViewById(R.id.rdTeoria);

        btExibir = findViewById(R.id.btExibir);

        btExibir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String texto = "Selecionado(s): ";
        if (ckLivros.isChecked()) {
            texto += "- Livros ";
        }
        if (ckAulas.isChecked()) {
            texto += "- Aulas ";
        }
        if (ckVideos.isChecked()) {
            texto += "- Vídeos ";
        }
        if (ckOutros.isChecked()) {
            texto += "- Outros ";
        }
        if (rdPratica.isChecked()) {
            texto += "- Prática ";
        }
        if (rdTeoria.isChecked()) {
            texto += "- Teoria ";
        }
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
    }
}