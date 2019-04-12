package com.ramadini.tutorialmakeup.Makeup;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "komentar.db";
    private static final int DATABSE_VERSION = 1;
    private String sql;

    public Database(Context context){
        super(context, DATABASE_NAME, null, DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        sql = "create table komentar(no integer primary key, nama text null, komentar text null);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {

    }

}
