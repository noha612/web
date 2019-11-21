/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author nguyenthang
 */
public class KhoaHoc {
    private String ten;
    private String mota;
    private String url;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public KhoaHoc(String ten, String mota, String url) {
        this.ten = ten;
        this.mota = mota;
        this.url = url;
    }
}
