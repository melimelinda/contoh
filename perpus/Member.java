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
public class Member extends Person{
   private String kdMember;

    public Member(String kdMember, String nama, String jalan, int KodePos, String prov, String noTelp) {
        super(nama, jalan, KodePos, prov, noTelp);
        this.kdMember = kdMember;
    }

    public String getKdMember() {
        return kdMember;
    }
    public void showMember(){
        System.out.println("==Member==");
        System.out.println("Kode Member:" + kdMember);
        System.out.println("Nama:" + super.getNama());
        System.out.println("Alamat:" + getAlamat().showAlamat());
        System.out.println("No Telp: " + getNoTelp());
    }
}
