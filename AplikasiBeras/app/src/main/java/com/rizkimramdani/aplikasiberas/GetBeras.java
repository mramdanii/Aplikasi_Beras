package com.rizkimramdani.aplikasiberas;

import com.google.gson.annotations.SerializedName;

public class GetBeras {
    @SerializedName("id") private int Id;
    @SerializedName("nama") private String Nama;
    @SerializedName("harga") private String Harga;
    @SerializedName("jumlah") private String Jumlah;
    @SerializedName("urlgambar") private String urlgambar;

    public int getId() {
        return Id;
    }

    public String getNama() {
        return Nama;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public String getHarga() {
        return Harga;
    }

    public String getUrlgambar() {
        return urlgambar;
    }
}
