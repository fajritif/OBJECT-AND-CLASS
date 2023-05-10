/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayo;

/**
 *
 * @author User
 */
public class Tayo {
    
    void a(String mobilType){
        System.out.println("merek mobil\t : " +mobilType);
    }

    void a(String warna, int jumlahroda, String noplat){
        System.out.println("Warna mobil \t : " +warna);
        System.out.println("Jumlah Roda \t : " +jumlahroda);
        System.out.println("Nomor Plat \t : " +noplat); 
    }
   
    void a (double kecepatan, double waktu){
        System.out.println("Kecepatan mobil : " + kecepatan + "km/jam");
        System.out.println("Waktu Tempuh mobil : " + waktu + "jam");
        System.out.println("Jarak Tempuh mobil : " + (kecepatan*waktu) + "km");
    }
}
