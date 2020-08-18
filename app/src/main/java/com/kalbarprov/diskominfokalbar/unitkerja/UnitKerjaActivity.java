package com.kalbarprov.diskominfokalbar.unitkerja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kalbarprov.diskominfokalbar.R;

public class UnitKerjaActivity extends AppCompatActivity {

    CardView cvSekretariat;
    CardView cvInformasiPublik;
    CardView cvAplikasiInformatika;
    CardView cvKomunikasiPublik;
    CardView cvPersandianStatistik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_kerja);
        cvSekretariat = findViewById(R.id.cv_Sekretariat);
        cvInformasiPublik = findViewById(R.id.cv_InformasiPublik);
        cvAplikasiInformatika = findViewById(R.id.cv_AplikasiInformatika);
        cvKomunikasiPublik = findViewById(R.id.cv_KomunikasiPublik);
        cvPersandianStatistik = findViewById(R.id.cv_PersandianStatistik);

        cvSekretariat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitKerjaActivity.this, UnitKerjaSekretariatActivity.class);
                startActivity(intent);
            }
        });
        cvInformasiPublik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitKerjaActivity.this, UnitKerjaInformasiPublikActivity.class);
                startActivity(intent);
            }
        });
        cvAplikasiInformatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitKerjaActivity.this, UnitKerjaAplikasiInformatikaActivity.class);
                startActivity(intent);
            }
        });
        cvKomunikasiPublik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitKerjaActivity.this, UnitKerjaKomunikasiPublikActivity.class);
                startActivity(intent);
            }
        });
        cvPersandianStatistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitKerjaActivity.this, UnitKerjaPersandianStatistikActivity.class);
                startActivity(intent);
            }
        });
    }
}