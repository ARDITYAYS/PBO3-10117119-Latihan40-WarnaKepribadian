/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan40warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * NAMA : ARDITYA YOGAPUTRA S
 * NIM : 10117119
 * KELAS : PBO3 / IF-3
 * Deskripsi Program : program ini dapat memprediksi kepribadian dengan memilih 
 * warna
 */
public class PBO310117119Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Warna wrn = new Warna();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + usr.namaUser.toUpperCase() + "====");
        wrn.tesKepribadian(wrn.namaWarna, usr.namaUser);

    }

}
