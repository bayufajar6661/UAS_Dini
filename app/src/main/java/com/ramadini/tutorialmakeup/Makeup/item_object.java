package com.ramadini.tutorialmakeup.Makeup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ramadini.tutorialmakeup.R;

public class item_object extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_makeup_activity);
    }

    public void openMenu(View view) {
        Intent intent = new Intent(item_object.this, Note.class);
        startActivity(intent);
    }
}
