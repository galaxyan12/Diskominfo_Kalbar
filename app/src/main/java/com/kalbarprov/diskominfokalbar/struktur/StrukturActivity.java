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
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Arry Yosfani Alnur, S.Kom","KASI. INFRASTRUKTUR DAN TEKNOLOGI, INFORMASI DAN KOMUNIKASI", "197604302006041004"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Meidy Vinandar Pratama, S.STP","KASI. APLIKASI", "199205102014061001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("M. Adi, S.Kom","KASI. TATA KELOLA STANDAR PEMERINTAHAN BERBASIS ELEKTRONIK", "198110182011011001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Maria Wijayanti, ST","KABID. KOMUNIKASI PUBLIK", "197301052002122001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Purnamawati, SH","KASI. LAYANAN HUBUNGAN MEDIA", "196406221985112002"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Arfiandi, SE.MM","KASI. SUMBER DAYA KOMUNIKASI PUBLIK", "197702252000031003"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Heronimus Sonni, S.Kom","KASI. PENGELOLAAN MEDIA KOMUNIKASI PUBLIK", "197802222011011002"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Ir. Teddy Erwanto, M.Sc","KABID. PERSANDIAN DAN STATISTIK", "196307021995021001"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Agus Hasim, ST, M.Si","KASI. PENGELOLA DATA STATISTIK", "196608241998031006"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Sylvia Josepha Maria Pessy, S.IP, MT","KASI. PERSANDIAN DAN KEAMANAN INFORMASI", "196902181989032005"));
        strukturOrganisasiArrayList.add(new StrukturOrganisasi("Hendra, S.Sos, M.Si","KASI. ANALISIS DATA STATISTIK", "196906121990031003"));
    }
}