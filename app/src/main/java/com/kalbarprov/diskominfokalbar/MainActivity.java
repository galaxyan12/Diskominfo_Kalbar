package com.kalbarprov.diskominfokalbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.kalbarprov.diskominfokalbar.berita.APIRequestData;
import com.kalbarprov.diskominfokalbar.berita.BeritaActivity;
import com.kalbarprov.diskominfokalbar.berita.BeritaBaruAdapter;
import com.kalbarprov.diskominfokalbar.berita.BeritaModel;
import com.kalbarprov.diskominfokalbar.berita.ResponseModel;
import com.kalbarprov.diskominfokalbar.berita.RetroServer;
import com.kalbarprov.diskominfokalbar.struktur.StrukturActivity;
import com.kalbarprov.diskominfokalbar.unitkerja.UnitKerjaActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBeritaMain;
    private RecyclerView.Adapter adBeritaMain;
    private RecyclerView.LayoutManager lmBeritaMain;
    private List<BeritaModel> beritaModelList = new ArrayList<>();
    private ProgressBar progressBarmain;
    ImageView imgStruktur, imgUniker, imgBerita, imgAlamat, imgVisimisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBeritaMain = findViewById(R.id.rv_beritaMain);
        imgStruktur = findViewById(R.id.struktur_organisasi);
        imgUniker = findViewById(R.id.unit_kerja);
        imgBerita = findViewById(R.id.berita);
        imgAlamat = findViewById(R.id.imgAlamat);
        imgVisimisi = findViewById(R.id.visi_misi);
        progressBarmain = findViewById(R.id.progress_Beritamain);
        imgStruktur.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, StrukturActivity.class);
            startActivity(intent);
        });
        imgUniker.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, UnitKerjaActivity.class);
            startActivity(intent);
        });
        imgBerita.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BeritaActivity.class);
            startActivity(intent);
        });
        imgAlamat.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AlamatActivity.class);
            startActivity(intent);
        });
        imgVisimisi.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, VisiMisiActivity.class );
            startActivity(intent);
        });

        lmBeritaMain = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvBeritaMain.setLayoutManager(lmBeritaMain);
        retrieveBeritaMain();
    }

    public void retrieveBeritaMain(){
        APIRequestData apiRequestData = RetroServer.connectRetrofit().create(APIRequestData.class);
        Call<ResponseModel> call = apiRequestData.ardRetrieveLimit();
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                beritaModelList = response.body().getContent();
                adBeritaMain = new BeritaBaruAdapter(MainActivity.this, beritaModelList);
                progressBarmain.setVisibility(View.GONE);
                rvBeritaMain.setAdapter(adBeritaMain);
                adBeritaMain.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Gagal Mengambil Data Berita", Toast.LENGTH_SHORT).show();
            }
        });
    }

}