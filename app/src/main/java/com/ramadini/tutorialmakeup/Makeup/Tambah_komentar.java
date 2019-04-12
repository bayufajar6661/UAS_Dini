package com.ramadini.tutorialmakeup.Makeup;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ramadini.tutorialmakeup.R;

public class Tambah_komentar extends AppCompatActivity {
    EditText txt_nama,txt_komentar;
    Button Save;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tambah_komentar);

        db = new Database(this);

        txt_nama = (EditText) findViewById(R.id.text_nama);
        txt_komentar = (EditText) findViewById(R.id.text_komentar);
        Save = (Button) findViewById(R.id.button_save);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase dbnya = db.getWritableDatabase();
                dbnya.execSQL("insert into komentar(nama, komentar) values('" + txt_nama.getText().toString()  + "','" + txt_komentar.getText().toString() + "')");

                Toast.makeText(getApplicationContext(), "Komentar Berhasil Ditambahkan", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Tambah_komentar.this, Note.class);
                startActivity(intent);
                finish();
            }
        });
    }





}
