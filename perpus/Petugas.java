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
public class Petugas extends Person {
private String kdPetugas;

    public Petugas(String kdPetugas, String nama, String jalan, int KodePos, String prov, String noTelp) {
        super(nama, jalan, KodePos, prov, noTelp);
        this.kdPetugas = kdPetugas;
    }

    public String getKdPetugas() {
        return kdPetugas;
    }
    
    public void showPetugas(){
        System.out.println("==Petugas==");
        System.out.println("Kode Petugas:" + kdPetugas);
        System.out.println("Nama:" + super.getNama());
        System.out.println("Alamat:" + getAlamat().showAlamat());
        System.out.println("No Telp: "+ getNoTelp());
    }
    
}
