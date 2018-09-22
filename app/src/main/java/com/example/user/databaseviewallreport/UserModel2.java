package com.example.user.databaseviewallreport;

import java.io.Serializable;

public class UserModel2 implements Serializable{

    private String jenisaduan2, nama, alamat, telefon, emel, tarikh, aduan;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }

    public String getJenisaduan2() {
        return jenisaduan2;
    }
    public void setJenisaduan2(String jenisaduan2) { this.jenisaduan2 = jenisaduan2; }

    public String getNama() {
        return nama ;
    }
    public void setNama(String nama) { this.nama  = nama ; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    public String getEmel() {
        return emel;
    }
    public void setEmel(String emel) { this.emel = emel; }

    public String getTarikh() {
        return tarikh;
    }
    public void setTarikh(String tarikh) { this.tarikh = tarikh; }

    public String getAduan() {
        return aduan;
    }
    public void setAduan(String aduan) { this.aduan = aduan; }

}




