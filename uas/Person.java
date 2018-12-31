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
public class Person {
    private String nama;
    private Alamat alamat;

    public Person(String nama, String jalan, int nomor) {
        this.nama = nama;
        this.alamat = new Alamat(jalan,nomor);
    }

    public String getNama() {
        return nama;
    }

    public Alamat getAlamat() {
        return alamat;
    }

   
    
}
