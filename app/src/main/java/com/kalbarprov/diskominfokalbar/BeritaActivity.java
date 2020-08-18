package com.kalbarprov.diskominfokalbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.kalbarprov.diskominfokalbar.berita.APIRequestData;
import com.kalbarprov.diskominfokalbar.berita.BeritaAdapter;
import com.kalbarprov.diskominfokalbar.berita.BeritaModel;
import com.kalbarprov.diskominfokalbar.berita.ResponseModel;
import com.kalbarprov.diskominfokalbar.berita.RetroServer;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BeritaActivity extends AppCompatActivity {

    private RecyclerView rvBerita;
    private RecyclerView.Adapter adBerita;
    private RecyclerView.LayoutManager lmBerita;
    private List<BeritaModel> listBerita = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        rvBerita = findViewById(R.id.rv_berita);
        lmBerita = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


    }

    public void retrieveBerita(){
        APIRequestData ardBerita = RetroServer.connectRetrofit().create(APIRequestData.class);
        Call<ResponseModel> tampilBerita = ardBerita.ardRetrieveData();
        tampilBerita.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                int kode = response.body().getCode();
                String message = response.body().getMessage();

                Toast.makeText(BeritaActivity.this, "Code :"+kode+" | Pesan : "+message, Toast.LENGTH_SHORT).show();

                listBerita = response.body().getContent();

                adBerita = new BeritaAdapter(BeritaActivity.this, listBerita);
                rvBerita.setAdapter(adBerita);
                adBerita.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(BeritaActivity.this, "Gagal Mengambil Data Berita", Toast.LENGTH_SHORT).show();
            }
        });
    }

}