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
public class Buku {
    
    private String idBuku;
    private String judul;
    private String penerbit;
    private String pengarang;

    public Buku(String idBuku, String judul, String penerbit, String pengarang) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }
    
    public void showBuku(){
        System.out.println(idBuku+""+judul+""+penerbit+""+pengarang);
    
    }
}
