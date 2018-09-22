package com.example.user.databaseviewallreport;

import java.io.Serializable;
public class UserModel implements Serializable {
    private String jenisaduan, tarikh;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }

    public String getJenisaduan() {
        return jenisaduan;
    }
    public void setJenisaduan(String jenisaduan) { this.jenisaduan = jenisaduan; }

    public String getTarikh() {
        return tarikh;
    }
    public void setTarikh(String tarikh) { this.tarikh = tarikh; }


}



