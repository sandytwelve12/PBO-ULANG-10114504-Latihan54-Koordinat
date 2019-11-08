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
public class PBOULANG10114504Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk;
        wk = new WarnaKoordinat("jingga",10,4);
        wk.setWarna("jingga");
        wk.setX(10);
        wk.setY(4);
        
        System.out.println("Warna Koordinat : "+wk.getWarna());
        System.out.println("Warna Koordinat Sumbu x : "+wk.getX()+", y : "
                +wk.getY());
    
    
    }
    
}
