/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author budi
 */
public class Mobil {
        private String nama;
    private double harga;
 
    public Mobil(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
 
    public String getNama() {
        return nama;
    }
 
    public double getHarga() {
        return harga;
    }
}

class Main {
    public static void main(String[] args) {
        List<Mobil> daftarMobil = new ArrayList<>();
        double uangModal = 50000; // Uang modal awal
        double nilaiAset = 0; // Nilai aset awal
 
        // Menambahkan mobil pertama
        Mobil mobil1 = new Mobil("Mobil A", 20000);
        daftarMobil.add(mobil1);
        uangModal -= mobil1.getHarga();
        nilaiAset += mobil1.getHarga();
 
        // Menambahkan mobil kedua
        Mobil mobil2 = new Mobil("Mobil B", 30000);
        daftarMobil.add(mobil2);
        uangModal -= mobil2.getHarga();
        nilaiAset += mobil2.getHarga();
 
        // Menampilkan daftar mobil
        for (Mobil mobil : daftarMobil) {
            System.out.println("Nama: " + mobil.getNama() + ", Harga: " + mobil.getHarga());
        }
 
        // Menampilkan uang modal dan nilai aset terbaru
        System.out.println("Uang Modal: " + uangModal);
        System.out.println("Nilai Aset: " + nilaiAset);
    }
}
