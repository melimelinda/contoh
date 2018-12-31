/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import uas.Mahasiswa;
import uas.Person;
import uas.Dosen;

/**
 *
 * @author MELI MELINDA
 */
public class Main{

    public static void main(String[] args) {
        Person mahasiswa = new Mahasiswa("M001", "Udin", "jl. Bangkir Nomor", 22);
         Person dosen = new Dosen("D001", "Joko", "jl. Lohbener Nomor",8);
        ((Mahasiswa)mahasiswa).showMahasiswa();
        ((Dosen)dosen).showDosen();
         
         
    }
    
}
