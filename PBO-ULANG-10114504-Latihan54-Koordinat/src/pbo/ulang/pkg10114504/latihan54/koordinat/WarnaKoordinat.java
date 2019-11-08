/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi :Program Menampilkan Titik Koordinat warna dan warnanya
 */
public class WarnaKoordinat extends Koordinat {
 
public String warna;
    private String jingga;

    public WarnaKoordinat(String warna, int x, int y) {
        super(x, y);
        this.warna = warna;
    }

   

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
