package com.kalbarprov.diskominfokalbar.berita;

import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.kalbarprov.diskominfokalbar.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BeritaDetilActivity extends AppCompatActivity {

    public static String NEWS_SLUG = "";
    private String slug = "";
    private int position = 0;
    ImageView iv_Berita;
    TextView tv_judulDetil, tv_tanggalDetil, tv_penulisDetil, tv_isiDetil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita_detil);

        iv_Berita = findViewById(R.id.iv_detilBerita);
        tv_judulDetil = findViewById(R.id.tv_judulDetil);
        tv_tanggalDetil = findViewById(R.id.tv_tanggalDetil);
        tv_penulisDetil = findViewById(R.id.tv_penulisDetil);
        tv_isiDetil = findViewById(R.id.tv_isidetil);
        slug = getIntent().getStringExtra(NEWS_SLUG);
        retrieveDetil();
    }

    public void retrieveDetil() {
        APIRequestData ardDetil = RetroServer.connectRetrofit().create(APIRequestData.class);
        Call<ResponseDetilModel> tampilDetil = ardDetil.ardRetrieveDetil("detil/"+slug);
        tampilDetil.enqueue(new Callback<ResponseDetilModel>() {
            @Override
            public void onResponse(Call<ResponseDetilModel> call, Response<ResponseDetilModel> response) {
                List<DetilModel> detilModels = response.body().getContent();
                for (DetilModel detil : detilModels) {
                    Glide.with(BeritaDetilActivity.this).load(detil.getDetilImage()).into(iv_Berita);
                    tv_judulDetil.setText(detil.getDetilTitle());
                    tv_tanggalDetil.setText(detil.getDetilDatecreate());
                    tv_penulisDetil.setText(detil.getDetilUser());
                    String isi = Html.fromHtml(detil.getDetilContent()).toString();
                    tv_isiDetil.setText(isi);
                }
            }

            @Override
            public void onFailure(Call<ResponseDetilModel> call, Throwable t) {
                Toast.makeText(BeritaDetilActivity.this, "Gagal Mengambil Data Berita"+t, Toast.LENGTH_SHORT).show();
            }
        });

    }
}