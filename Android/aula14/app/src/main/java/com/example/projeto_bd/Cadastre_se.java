package com.example.projeto_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastre_se extends AppCompatActivity implements View.OnClickListener {

    EditText txtCadNome, txtCadCPF,txtCadEmail, txtCadSenha, txtCadConfSenha;
    Button btCadSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastre_se);

        txtCadNome = findViewById(R.id.txtCadNome);
        txtCadCPF = findViewById(R.id.txtCadCPF);
        txtCadEmail = findViewById(R.id.txtCadEmail);
        txtCadSenha = findViewById(R.id.txtCadSenha);
        txtCadConfSenha = findViewById(R.id.txtCadConfSenha);
        btCadSalvar = findViewById(R.id.btCadSalvar);

        btCadSalvar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String nome = txtCadNome.getText().toString();
        String cpf = txtCadCPF.getText().toString();
        String email = txtCadEmail.getText().toString();
        String senha = txtCadSenha.getText().toString();
        String confSenha = txtCadConfSenha.getText().toString();
        String msg = "";

        if (nome.isEmpty()) {
            msg = "O campo NOME deve ser preenchido!";
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        } else {
            if (cpf.isEmpty()) {
                msg = "O campo CPF deve ser preenchido!";
                Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            } else {
                if (email.isEmpty()) {
                    msg = "O campo EMAIL deve ser preenchido!";
                    Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
                } else {
                    if (senha.isEmpty()) {
                        msg = "O campo SENHA deve ser preenchido!";
                        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
                    } else {
                        if (confSenha.isEmpty()) {
                            msg = "O campo CONFIRMA SENHA deve ser preenchido!";
                            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
                        } else {
                            if (!confSenha.equals(senha)) {
                                msg = "Os campos SENHA e CONFIRMA SENHA devem ser iguais!";
                                Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
                            } else {
                                BancoControllerUsuarios bd = new BancoControllerUsuarios(getBaseContext());
                                String resultado;

                                resultado = bd.insereDados(nome,cpf,email,senha);
                                Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show();
                                limpar();
                            }
                        }
                    }
                }
            }
        }
    }
    public void limpar() {
        txtCadNome.setText("");
        txtCadCPF.setText("");
        txtCadEmail.setText("");
        txtCadSenha.setText("");
        txtCadConfSenha.setText("");
    }
}