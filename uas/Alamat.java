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
public class Alamat {
    private String jalan;
    private int nomor;
    
    public String showAlamat(){
    
    return jalan+""+nomor+"";
    }

    public Alamat(String jalan, int nomor) {
        this.jalan = jalan;
        this.nomor = nomor;
    }

    public String getJalan() {
        return jalan;
    }

    public int getNomor() {
        return nomor;
    }
    
}
