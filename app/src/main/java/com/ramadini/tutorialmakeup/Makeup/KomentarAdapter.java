package com.ramadini.tutorialmakeup.Makeup;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ramadini.tutorialmakeup.R;

import java.util.ArrayList;

public class KomentarAdapter extends RecyclerView.Adapter<KomentarAdapter.KomentarAdapterViewHolder> {

    private ArrayList<Komentar> komentar;

    public KomentarAdapter(ArrayList<Komentar> list) {
        this.komentar= list;
    }

    @NonNull
    @Override
    public KomentarAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_rvactivity, parent, false);
        return new KomentarAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KomentarAdapterViewHolder holder,final int position) {
        holder.txt_nama.setText(komentar.get(position).getNama());
        holder.txt_komentar.setText(komentar.get(position).getKomentar());

    }

    @Override
    public int getItemCount() {
        return (komentar != null) ? komentar.size() : 0;
    }

    public class KomentarAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_nama,txt_komentar;


        public KomentarAdapterViewHolder(View itemView) {
            super(itemView);
            txt_nama = (TextView) itemView.findViewById(R.id.txt_nama);
            txt_komentar = (TextView) itemView.findViewById(R.id.txt_komentar);
        }
    }
}
