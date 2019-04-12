package com.ramadini.tutorialmakeup.Makeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ramadini.tutorialmakeup.R;

public class Halaman_komentar extends AppCompatActivity {
    Button btnKomentar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_komentar);


    }

    //btn untuk ke halaman rv komentar, msk ke note dulu
    public void toKomentarOnClick(View view) {
        Intent intent= new Intent(this, Note.class);
        startActivity(intent);
    }
}
