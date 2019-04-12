package com.ramadini.tutorialmakeup.Makeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.ramadini.tutorialmakeup.R;

import java.util.ArrayList;
import java.util.List;

public class Makeup extends AppCompatActivity {
    private RecyclerView list_item;
    private android.support.v7.widget.LinearLayoutManager LinearLayoutManager;
    private List<ItemObjectMakeup> itemObjectMakeups;
    private AdapterMakeup adapter;
    MediaController media;
    DisplayMetrics dm;
    VideoView videoViewSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup);

        list_item = (RecyclerView) findViewById(R.id.list_item);
        LinearLayoutManager = new LinearLayoutManager(this);
        list_item.setLayoutManager(LinearLayoutManager);

        itemObjectMakeups = new ArrayList<>();
        itemObjectMakeups.add(new ItemObjectMakeup("Hanum Mega", "Makeup Pemula", "Viva eyebrow pencil 'Black' RP. 35.000", "Pixy BB Cream shade 03 Rp.35.000", "Marina Compact Powder Natural Rp. 18.000", "", "", "", "", "Emina Lip Cushion Rp. 43.500", "", "",  R.drawable.pemula));
        itemObjectMakeups.add(new ItemObjectMakeup("Astari","Makeup Party","Eyebrow The Saem Rp.80.000","Foundation NYX Rp. 250.000","Bedak Marcks Rp. 25.000","Eyeshadow Magic Pallete Rp. 200.000","Highlighter MakeOver Glow Rp. 170.000","Blushon Magic Pallete Rp. 200.000","Shading Magic Pallete Rp. 200.000","Lipstick Girlactik Rp. 320.000","Mascara Loreal Rp. 150.000","Eyeliner NYX Rp. 95.000 ", R.drawable.party));
        itemObjectMakeups.add(new ItemObjectMakeup("Ririe Prasmeswari","Makeup Bold","Eyebrow Lakme Rp.80.000","Foundation Superstay Mate Rp. 210.000","Bedak Viva Queen Rp. 45.000","Eyeshadow Zulu Rp. 400.000","Highlighter Luxcrime Rp.100.000","Blushon Hot Mama ","Bronzer Rimmel Natural","Lipstik MAC","Lashes by Forher.lashes","Eyeliner Maybelline ",R.drawable.bold));
        itemObjectMakeups.add(new ItemObjectMakeup("Citta Farenty","Simple Makeup","Eyebrow EtudeHouse","Emina BB Cushion","Marcks powder","Eyeshadow Ultimate edit pallete","Highlighter Canggu","Blushon Emina","Shading NYX ","Lipmate pixy","Mascara Maybelline","eyeliner wardah",R.drawable.simple));

        /*membuat adapter*/
        adapter = new AdapterMakeup(getApplicationContext(), itemObjectMakeups);
        /*masukkan ke recyclerview*/
        list_item.setAdapter(adapter);



    }
}