/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author MELI MELINDA
 */
public class Dosen extends Person {
private String nik;

    public Dosen(String nik, String nama, String jalan, int nomor) {
        super(nama, jalan, nomor);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }
    
    public void showDosen(){
        System.out.println("==Dosen==");
        System.out.println("NIK :" + nik);
        System.out.println("Nama :" + super.getNama());
        System.out.println("Alamat :" + getAlamat().showAlamat());
    }
    
}
