package com.ramadini.tutorialmakeup.Makeup;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.ramadini.tutorialmakeup.R;

import java.util.List;

public class AdapterMakeup extends RecyclerView.Adapter<MakeupHolder> {
    Context context;
    List<ItemObjectMakeup> itemObjectMakeups;

    public AdapterMakeup(Context context, List<ItemObjectMakeup> itemObjectMakeups) {
        this.context = context;
        this.itemObjectMakeups = itemObjectMakeups;
    }

    @Override
    public MakeupHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_makeup_activity, null);
        MakeupHolder makeupHolder = new MakeupHolder(view);
        return makeupHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MakeupHolder makeupHolder, int position) {
        MakeupHolder.txt_Nama.setText(itemObjectMakeups.get(position).Nama);
        MakeupHolder.txt_Kategori.setText(itemObjectMakeups.get(position).Kategori);
        MakeupHolder.txt_Eyebrow.setText(itemObjectMakeups.get(position).Eyebrow);
        MakeupHolder.txt_Foundation.setText(itemObjectMakeups.get(position).Foundation);
        MakeupHolder.txt_Bedak.setText(itemObjectMakeups.get(position).Bedak);
        MakeupHolder.txt_Eyeshadow.setText(itemObjectMakeups.get(position).Eyeshadow);
        MakeupHolder.txt_Highlighter.setText(itemObjectMakeups.get(position).Highlighter);
        MakeupHolder.txt_Blushon.setText(itemObjectMakeups.get(position).Blushon);
        MakeupHolder.txt_Shading.setText(itemObjectMakeups.get(position).Shading);
        MakeupHolder.txt_Lipstik.setText(itemObjectMakeups.get(position).Lipstik);
        MakeupHolder.txt_Mascara.setText(itemObjectMakeups.get(position).Mascara);
        MakeupHolder.txt_Eyeliner.setText(itemObjectMakeups.get(position).Eyeliner);
        Glide.with(context)
                .load(itemObjectMakeups.get(position).img)
                .into(MakeupHolder.img_image);
    }

    @Override
    public int getItemCount() {
        return itemObjectMakeups.size();
    }
}