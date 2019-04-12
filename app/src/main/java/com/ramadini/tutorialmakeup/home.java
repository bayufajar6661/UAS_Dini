package com.ramadini.tutorialmakeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ramadini.tutorialmakeup.Makeup.Makeup;
import com.ramadini.tutorialmakeup.Makeup.VideoMakeup;

public class home extends AppCompatActivity {
    Button btnMakeup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnMakeup    = (Button)findViewById(R.id.btnMakeup);

        btnMakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VideoMakeup.class);
                startActivity(i);
            }
        });



    }
    }

