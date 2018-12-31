/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperpus;

import siperpus.entity.Buku;
import siperpus.entity.Member;
import siperpus.entity.Person;
import siperpus.entity.Petugas;
import siperpus.entity.Transpinjam;

/**
 *
 * @author Elba
 */
public class Main {

    public static void main(String[] args) {
        Person member = new Member("M001", "Udin", "Lohbener",16, "Jabar", "083647723431");
         Person petugas = new Petugas("P001", "Joko", "Bangkir",60, "Jatim", "0893221765433");
         Buku buku1 = new Buku("BK001", "Rentang Kisah", "Gagas Media", "Gitasav");
         Buku buku2 = new Buku("BK002", "Imperfect", "Gramedia", "Meira Anastasia");
         Transpinjam tp = new Transpinjam("07/12/2018", "09/17/2018", member, petugas);
         tp.pinjamBuku(buku1);
         tp.pinjamBuku(buku2);
         
         tp.showTransaksi();
         
         
    }
    
}
