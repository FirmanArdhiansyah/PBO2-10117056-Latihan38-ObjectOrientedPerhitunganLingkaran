/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  Nama : Firman Ardhiansyah
 *          Kelas : IF-2 (PB02)
 *          NIM : 10117056
 * Deskripsi Program : Melakukan validasi agar input diameter yang masuk
 * adalah bilangan/angka kemudian menghitung jari-jari, luas, dan keliling lingkaran
 * dengan konsep OOP
 */
public class main {

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
}

