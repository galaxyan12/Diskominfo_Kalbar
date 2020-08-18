package com.kalbarprov.diskominfokalbar.struktur;

public class StrukturOrganisasi {

    private String nama;
    private String jabatan;
    private String nip;

    public StrukturOrganisasi(String nama, String jabatan, String nip) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
