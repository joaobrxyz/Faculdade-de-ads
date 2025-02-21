package com.example.mappex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btSomar, btSubtrair, btMultiplicar, btDividir;
    EditText txtN1, txtN2, txtRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular os objetos com a interface gráfica
        btSomar = (Button) findViewById(R.id.btSomar);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);
        btDividir = (Button) findViewById(R.id.btDividir);
        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
        txtRes = (EditText) findViewById(R.id.txtRes);

        // Programando o click do botão adicionar
        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criando as variavéis e armazenando os dados digitados pelo usuário
                double n1 = Double.parseDouble(txtN1.getText().toString());
                double n2 = Double.parseDouble(txtN2.getText().toString());
                double res = n1 + n2;

                // Mostrando o resultado
                txtRes.setText("" + res);
            }
        });
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criando as variavéis e armazenando os dados digitados pelo usuário
                double n1 = Double.parseDouble(txtN1.getText().toString());
                double n2 = Double.parseDouble(txtN2.getText().toString());
                double res = n1 - n2;

                // Mostrando o resultado
                txtRes.setText("" + res);
            }
        });
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criando as variavéis e armazenando os dados digitados pelo usuário
                double n1 = Double.parseDouble(txtN1.getText().toString());
                double n2 = Double.parseDouble(txtN2.getText().toString());
                double res = n1 * n2;

                // Mostrando o resultado
                txtRes.setText("" + res);
            }
        });
        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criando as variavéis e armazenando os dados digitados pelo usuário
                double n1 = Double.parseDouble(txtN1.getText().toString());
                double n2 = Double.parseDouble(txtN2.getText().toString());
                double res = n1 / n2;

                // Mostrando o resultado
                txtRes.setText("" + res);
            }
        });

    }
}