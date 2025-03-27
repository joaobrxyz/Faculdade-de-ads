package com.example.projeto_bd;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoControllerUsuarios {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoControllerUsuarios(Context context) {
        banco = new CriaBanco(context);
    }


    public String insereDados(String nome, String cpf, String email, String senha) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put("nome", nome);
        valores.put("cpf", cpf);
        valores.put("email", email);
        valores.put("senha", senha);

        resultado = db.insert("usuarios", null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao efetuar o Cadastre-se";
        else
            return "Cadastro efetuado com sucesso";
    }

    public Cursor consultaDadosLogin(String email, String senha) {
        Cursor cursor;
        String[] campos = { "codigo", "nome", "cpf", "email", "senha" };
        String where = "email='" + email + "' and senha = '" + senha + "'";
        db = banco.getReadableDatabase();
        // select * from usuarios where email = 'digitado' and senha = 'senha'
        cursor = db.query("usuarios", campos, where, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }
}
