/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperpus.entity;

/**
 *
 * @author Elba
 */
public class Person {
    private String nama;
    private Alamat alamat;
    private String noTelp;

    public Person(String nama, String jalan, int KodePos, String prov, String noTelp) {
        this.nama = nama;
        this.alamat = new Alamat(jalan,KodePos,prov);
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

   
    
}
