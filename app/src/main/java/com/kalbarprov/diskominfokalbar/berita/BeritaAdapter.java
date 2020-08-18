package com.kalbarprov.diskominfokalbar.berita;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kalbarprov.diskominfokalbar.R;

import java.util.List;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.HolderBerita> {

    private Context context;
    private List<BeritaModel> listBerita;

    public BeritaAdapter(Context context, List<BeritaModel> listBerita) {
        this.context = context;
        this.listBerita = listBerita;
    }

    @NonNull
    @Override
    public HolderBerita onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_berita, parent, false);
        HolderBerita holderBerita = new HolderBerita(layout);
        return holderBerita;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBerita holder, int position) {
        BeritaModel beritaModel = listBerita.get(position);
        holder.tvJudul.setText(beritaModel.getNews_title());
        holder.tvSlug.setText(beritaModel.getNews_slug());
        holder.tvImage.setText(beritaModel.getNews_image());
        holder.tvUrl.setText(beritaModel.getNews_url());
        holder.tvSinopsis.setText(beritaModel.getNews_sinopsis());
        holder.tvDatacreate.setText(beritaModel.getNews_datacreate());
        holder.tvUser.setText(beritaModel.getNews_user());
    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

    public class HolderBerita extends RecyclerView.ViewHolder {
        TextView tvJudul, tvSlug, tvImage, tvUrl, tvSinopsis, tvDatacreate, tvUser;

        public HolderBerita(@NonNull View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvSlug = itemView.findViewById(R.id.tv_slug);
            tvImage = itemView.findViewById(R.id.tv_image);
            tvUrl = itemView.findViewById(R.id.tv_url);
            tvSinopsis = itemView.findViewById(R.id.tv_sinopsis);
            tvDatacreate = itemView.findViewById(R.id.tv_datacreate);
            tvUser = itemView.findViewById(R.id.tv_user);

        }
    }
}
