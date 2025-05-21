package com.example.projeto_bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
public class BancoControllerAgendamento {
    private SQLiteDatabase db;
    private CriaBanco banco;


    public BancoControllerAgendamento(Context context) {
        banco = new CriaBanco(context);
    }
    public String insereAgendamento(String data, String hora, String email) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();


        valores = new ContentValues();
        valores.put("data", data);
        valores.put("hora", hora);
        valores.put("email", email);


        resultado = db.insert("agendamento", null, valores);
        db.close();


        if (resultado == -1)
            return "Erro ao efetuar o agendamento";
        else
            return "Agendamento efetuado com sucesso";
    }

    public Cursor ConsultarAgendamentos() {
        Cursor cursor;
        //SELECT idAgendamento, data, hora, email FROM agendamento
        String[] campos = { "idAgendamento", "data", "hora", "email" };
        db = banco.getReadableDatabase();
        cursor = db.query("agendamento", campos, null, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public Cursor consultaDadosAgendamento(String data, String hora) {
        Cursor cursor;
        String[] campos = {"data", "hora"};
        String where = "data = '" + data + "'and hora ='" + hora + "'" ;
        db = banco.getReadableDatabase();

        cursor = db.query("agendamento", campos, where, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}
