package com.kalbarprov.diskominfokalbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kalbarprov.diskominfokalbar.struktur.StrukturActivity;
import com.kalbarprov.diskominfokalbar.unitkerja.UnitKerjaActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imgStruktur, imgUniker, imgBerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgStruktur = findViewById(R.id.struktur_organisasi);
        imgUniker = findViewById(R.id.unit_kerja);
        imgBerita = findViewById(R.id.berita);
        imgStruktur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StrukturActivity.class);
                startActivity(intent);
            }
        });
        imgUniker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UnitKerjaActivity.class);
                startActivity(intent);
            }
        });
        imgBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BeritaActivity.class);
                startActivity(intent);
            }
        });
    }

}