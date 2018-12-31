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
public class Alamat {
    private String jalan;
    private int KodePos;
    private String prov;
    
    public String showAlamat(){
    
    return jalan+""+KodePos+""+prov;
    }

    public Alamat(String jalan, int KodePos, String prov) {
        this.jalan = jalan;
        this.KodePos = KodePos;
        this.prov = prov;
    }

    public String getJalan() {
        return jalan;
    }

    public int getKodePos() {
        return KodePos;
    }

    public String getProv() {
        return prov;
    }
    
    
}
