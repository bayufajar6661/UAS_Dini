package com.ramadini.tutorialmakeup.Makeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.ramadini.tutorialmakeup.R;
import com.ramadini.tutorialmakeup.home;

public class VideoMakeup extends AppCompatActivity {
    Button btnListMakeup;
    MediaController media_Controller;
    DisplayMetrics dm;

    VideoView videoViewSaya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_makeup);
        Intent intent = new Intent(this, home.class);
        btnListMakeup    = (Button)findViewById(R.id.btnListMakeup);

        btnListMakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Makeup.class);
                startActivity(i);
            }
        });

        // view
        videoViewSaya = (VideoView) findViewById(R.id.videoViewUtama);
        // inisialisasi
        media_Controller = new MediaController(this);
        dm = new DisplayMetrics();

        // ambil ukuran layar
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;

        // lebar dan tinggi video view diberi nilai agar menyesuaikan ukuran layout
        videoViewSaya.setMinimumWidth(width);
        videoViewSaya.setMinimumHeight(height);

        // kontroler video
        videoViewSaya.setMediaController(media_Controller);
    }

    private void muatVideo(String judul, String nama_file) {
        // ambil video
        videoViewSaya.setVideoPath("android.resource://"+getPackageName()+"/raw/"+nama_file);

        // mulai
        videoViewSaya.start();
    }

    //button pindah ke halaman komentar
    public void moveKomentar(View view){
        Intent intent = new Intent(VideoMakeup.this, Halaman_komentar.class);
        startActivity(intent);
    }

    public void video1(View view) { muatVideo("daily " ,"pemula"); }
    public void video2(View view) {
        muatVideo("pesta", "pesta");
    }
    public void video3(View view) {
        muatVideo("bold", "bold");
    }
    public void video4(View view) {muatVideo("simple","simple");}

}