/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5dan602;

import java.util.Scanner;

/**
 *
 * SILVIA DIAN LESTARI
 * TGL 26 April 2025
 */
public class Pertemuan5dan602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        LuasSegitiga Segitiga01 = new LuasSegitiga();
        
        System.out.print("Masukkan alas segitiga: ");
        Segitiga01.alas = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        Segitiga01.tinggi = scanner.nextDouble();
        
        double luas = Segitiga01.HitungLuas();
            System.out.println("Luas segitiga: " + luas + "cm");
        
    }
    
}
