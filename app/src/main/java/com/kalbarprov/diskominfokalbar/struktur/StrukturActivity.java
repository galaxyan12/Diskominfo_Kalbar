package com.kalbarprov.diskominfokalbar.struktur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kalbarprov.diskominfokalbar.R;

import java.util.ArrayList;

public class StrukturActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StrukturAdapter adapter;
    private ArrayList<StrukturOrganisasi> strukturOrganisasiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur);

        addData();

        recyclerView = findViewById(R.id.recycler_struktur);

        adapter = new StrukturAdapter(strukturOrganisasiArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(StrukturActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    void addData(){
        strukturOrganisasiArrayList = new ArrayList<>();
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Ir. Sukaliman, MT","KEPALA DINAS", "196307101989091002"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Drs. Alfian, M.Si","SEKRETARIS", "196502101986031016"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Calvario Mandayu S.STP, M.Sii","KASUBBAG RENJA DAN MONEV", "199004132010101001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Arif Setia Putra, S.Kom, MM","KASUBBAG UMUM DAN APARATUR", "198602162010011005"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Mariasyih, S.Sos","KASUBBAG KEUANGAN DAN ASET", "196511121992032007"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Drs. Rene Rienaldy, M.Si","KABID. INFORMASI PUBLIK", "197103141989031001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Ir. Hj. Sumiani, MM","KASI. PENGELOLAAN OPINI DAN ASPIRASI PUBLIK", "196408041997032001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Wiwin Sutiana, ST","KASI. PELAYANAN INFORMASI", "197905022011011002"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Teodolus Teddy Hinggaan, ST","KASI. PENGELOLAAN INFORMASI", "197609032005011008"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Sofiarti Dyah Anggunia, ST, M.Sc","KABID. APLIKASI INFORMATIKA", "198402232006042012"));
    }
}