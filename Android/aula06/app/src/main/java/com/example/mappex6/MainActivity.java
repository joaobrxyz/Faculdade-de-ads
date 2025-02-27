package com.example.mappex6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btTela1, btTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os objetos com a interface gráfica
        btTela1 = (Button) findViewById(R.id.btTela1);
        btTela2 = (Button) findViewById(R.id.btTela2);

        // Quando ouvir o click nos botões irá chamar os códigos do onClick
        btTela1.setOnClickListener(this);
        btTela2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Se a origem do click foi o botão tela1
        if (v.getId() == R.id.btTela1) {
            Intent tela1 = new Intent(this, Tela1.class);
            startActivity(tela1);
        }
        // Se a origem do click foi o botão tela2
        if (v.getId() == R.id.btTela2) {
            Intent tela2 = new Intent(this, Tela2.class);
            startActivity(tela2);
        }
    }
}