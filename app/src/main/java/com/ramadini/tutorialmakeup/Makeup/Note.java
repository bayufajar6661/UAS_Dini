package com.ramadini.tutorialmakeup.Makeup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.ramadini.tutorialmakeup.MainActivity;
import com.ramadini.tutorialmakeup.R;

import java.util.ArrayList;


public class Note extends AppCompatActivity {
    RecyclerView recyclerView;
    KomentarAdapter adapter;
    ArrayList<Komentar> komentar;
    Database db;
    Cursor cursor;
    TextView tvNote;
    Button btn_Tambah;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar);

        db = new Database(this);

        recyclerView = (RecyclerView) findViewById(R.id.rvNote);
        tvNote = (TextView) findViewById(R.id.tvNote);
        btn_Tambah = (Button) findViewById(R.id.btn_tambah);

        btn_Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note.this, Tambah_komentar.class);
                startActivity(intent);
                finish();
            }
        });

        addDataDummy();
    }

    //untuk menambahkan data ke database
    private void addDataDummy() {
        komentar = new ArrayList<>();
        SQLiteDatabase dbsql = db.getReadableDatabase();
        cursor = dbsql.rawQuery("SELECT * FROM komentar",null);
        cursor.moveToFirst();

        if(cursor.getCount() > 0){
            do {

                komentar.add(new Komentar(cursor.getString(cursor.getColumnIndex("nama")),cursor.getString(cursor.getColumnIndex("komentar"))));

            } while (cursor.moveToNext());
        }

        adapter = new KomentarAdapter(komentar);

        layoutManager = new LinearLayoutManager(Note.this);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(layoutManager);

        //menampilkan tvNote
        if(komentar.size() > 0){
            this.tvNote.setText("Jumlah Komentar: " + komentar.size());
        }else{
            adapter.notifyDataSetChanged();
            this.tvNote.setText("Tidak ada Komentar untuk ditampilkan. : ");
        }
    }


}
