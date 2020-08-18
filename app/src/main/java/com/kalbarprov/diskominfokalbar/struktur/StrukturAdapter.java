package com.kalbarprov.diskominfokalbar.struktur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kalbarprov.diskominfokalbar.R;

import java.util.ArrayList;

public class StrukturAdapter extends RecyclerView.Adapter<StrukturAdapter.StrukturViewHolder> {

    private ArrayList<StrukturOrganisasi> dataList;

    public StrukturAdapter(ArrayList<StrukturOrganisasi> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public StrukturViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_struktur, parent, false);
        return new StrukturViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StrukturViewHolder holder, int position) {
        holder.tvNama.setText(dataList.get(position).getNama());
        holder.tvJabatan.setText(dataList.get(position).getJabatan());
        holder.tvNIP.setText(dataList.get(position).getNip());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class StrukturViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNama, tvJabatan, tvNIP;

        public StrukturViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.struktur_nama);
            tvJabatan = itemView.findViewById(R.id.struktur_jabatan);
            tvNIP = itemView.findViewById(R.id.struktur_nip);
        }
    }

}
