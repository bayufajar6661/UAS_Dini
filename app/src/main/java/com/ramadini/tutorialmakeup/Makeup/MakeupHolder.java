package com.ramadini.tutorialmakeup.Makeup;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ramadini.tutorialmakeup.R;

public class MakeupHolder extends RecyclerView.ViewHolder {
    public static TextView txt_Nama;
    public static TextView txt_Kategori;
    public static TextView txt_Eyebrow;
    public static TextView txt_Foundation;
    public static TextView txt_Bedak;
    public static TextView txt_Eyeshadow;
    public static TextView txt_Highlighter;
    public static TextView txt_Blushon;
    public static TextView txt_Shading;
    public static TextView txt_Lipstik;
    public static TextView txt_Mascara;
    public static TextView txt_Eyeliner;


    public static ImageView img_image;

    public MakeupHolder( View itemView) {
        super(itemView);

        txt_Nama = (TextView) itemView.findViewById(R.id.txt_nama);
        txt_Kategori = (TextView) itemView.findViewById(R.id.txt_kategori);
        txt_Eyebrow = (TextView) itemView.findViewById(R.id.txt_eyebrow);
        txt_Foundation = (TextView) itemView.findViewById(R.id.txt_foundation);
        txt_Bedak = (TextView) itemView.findViewById(R.id.txt_bedak);
        txt_Eyeshadow = (TextView) itemView.findViewById(R.id.txt_eyeshadow);
        txt_Highlighter = (TextView) itemView.findViewById(R.id.txt_highlighter);
        txt_Blushon = (TextView) itemView.findViewById(R.id.txt_blushon);
        txt_Shading = (TextView) itemView.findViewById(R.id.txt_shading);
        txt_Lipstik = (TextView) itemView.findViewById(R.id.txt_lipstik);
        txt_Mascara = (TextView) itemView.findViewById(R.id.txt_mascara);
        txt_Eyeliner = (TextView) itemView.findViewById(R.id.txt_eyeliner);
        img_image = (ImageView) itemView.findViewById(R.id.img_image);
    }
}