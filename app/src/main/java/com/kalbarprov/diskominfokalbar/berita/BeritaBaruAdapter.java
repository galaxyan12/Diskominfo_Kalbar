package com.kalbarprov.diskominfokalbar.berita;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kalbarprov.diskominfokalbar.R;

import java.util.List;

public class BeritaBaruAdapter extends RecyclerView.Adapter<BeritaBaruAdapter.HolderBeritaBaru> {

    private Context context;
    private List<BeritaModel> listBeritaBaru;

    public BeritaBaruAdapter(Context context, List<BeritaModel> listBeritaBaru) {
        this.context = context;
        this.listBeritaBaru = listBeritaBaru;
    }

    @NonNull
    @Override
    public HolderBeritaBaru onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.row_berita_main, parent, false);
        return new HolderBeritaBaru(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBeritaBaru holder, int position) {
        BeritaModel beritaModel = listBeritaBaru.get(position);
        holder.tvJudulmain.setText(beritaModel.getNewsTitle());
        holder.tvSlugmain.setText(beritaModel.getNewsSlug());
        Glide.with(context).load(beritaModel.getNewsImage()).into(holder.ivImagemain);
        holder.tvUrlmain.setText(beritaModel.getNewsUrl());
        holder.tvSinopsismain.setText(beritaModel.getNewsSinopsis());
        holder.tvDatacreatemain.setText(beritaModel.getNewsDatecreate());
        holder.tvUsermain.setText(beritaModel.getNewsUser());
        holder.cardViewMain.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), BeritaDetilActivity.class);
            intent.putExtra(BeritaDetilActivity.NEWS_SLUG, beritaModel.getNewsSlug());
            holder.itemView.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return listBeritaBaru.size();
    }

    public class HolderBeritaBaru extends RecyclerView.ViewHolder {

        TextView tvJudulmain, tvSlugmain, tvImagemain, tvUrlmain, tvSinopsismain, tvDatacreatemain, tvUsermain;
        ImageView ivImagemain;
        CardView cardViewMain;

        public HolderBeritaBaru(@NonNull View itemView) {
            super(itemView);

            tvJudulmain = itemView.findViewById(R.id.tv_judulMain);
            tvSlugmain = itemView.findViewById(R.id.tv_slugMain);
            tvImagemain = itemView.findViewById(R.id.tv_imageMain);
            ivImagemain = itemView.findViewById(R.id.iv_imageMain);
            tvUrlmain = itemView.findViewById(R.id.tv_urlMain);
            tvSinopsismain = itemView.findViewById(R.id.tv_sinopsisMain);
            tvDatacreatemain = itemView.findViewById(R.id.tv_datacreateMain);
            tvUsermain = itemView.findViewById(R.id.tv_userMain);
            cardViewMain = itemView.findViewById(R.id.cv_beritaMain);
        }
    }
}
