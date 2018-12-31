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
public class Mahasiswa extends Person{
   private String nim;

    public Mahasiswa(String nim, String nama, String jalan, int nomor) {
        super(nama, jalan, nomor);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
    public void showMahasiswa(){
        System.out.println("==Mahasiswa==");
        System.out.println("NIM:" + nim);
        System.out.println("Nama:" + super.getNama());
        System.out.println("Alamat:" + getAlamat().showAlamat());
    }
}
