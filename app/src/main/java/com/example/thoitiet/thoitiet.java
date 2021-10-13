package com.example.thoitiet;

public class thoitiet {
    String nhietDo,tocDo,tamNhin,thoiGian ;
    int thoiTiet;
    public String getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(String nhietDo) {
        this.nhietDo = nhietDo;
    }

    public String getTocDo() {
        return tocDo;
    }

    public void setTocDo(String tocDo) {
        this.tocDo = tocDo;
    }

    public String getTamNhin() {
        return tamNhin;
    }

    public void setTamNhin(String tamNhin) {
        this.tamNhin = tamNhin;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getThoiTiet() {
        return thoiTiet;
    }

    public void setThoiTiet(int thoiTiet) {
        this.thoiTiet = thoiTiet;
    }

    public thoitiet(String nhietDo, String tocDo, String tamNhin, String thoiGian, int thoiTiet) {
        this.nhietDo = nhietDo;
        this.tocDo = tocDo;
        this.tamNhin = tamNhin;
        this.thoiGian = thoiGian;
        this.thoiTiet = thoiTiet;
    }

    public thoitiet() {
    }



}
