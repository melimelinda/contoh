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
import java.util.ArrayList;
public class Transpinjam {
    private static int noTrans;
    private String tglPinjam;
    private String tglKembali;
    private Person member;
    private Person petugas;
    ArrayList<Buku>listBuku = new ArrayList<>();

    public Transpinjam(String tglPinjam, String tglKembali, Person member, Person petugas) {
        noTrans++;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.member = member;
        this.petugas = petugas;
    }
    
    
    public void pinjamBuku(Buku buku){
    listBuku.add(buku);
    }
    
    public void showTransaksi(){
        System.out.println("==Transaksi==");
        System.out.println("No Trans : "+ noTrans);
        ((Member)member).showMember();
        ((Petugas)petugas).showPetugas();
        for (Buku buku : listBuku) {
            buku.showBuku();
        }
    }
}
   