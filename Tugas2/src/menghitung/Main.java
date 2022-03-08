/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitung;

import java.util.Scanner;

/**
 *
 * @author Visen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ulangi; 
        
        Scanner data = new Scanner(System.in);
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            int pilih = data.nextInt();
        
            switch (pilih){
                case 1 :
                    System.out.print("Input Panjang: ");
                    double p = data.nextDouble();
                    System.out.print("Input Lebar: ");
                    double l = data.nextDouble();
                    System.out.print("Input Tinggi: ");
                    double t = data.nextDouble();
                    Balok balok = new Balok(p, l, t);
                    
                    System.out.println("Luas Persegi Panjang= " + balok.menghitungLuas());
                    System.out.println("Keliling Persegi Panjang= " + balok.menghitungKeliling());
                    System.out.println("Volume Balok= " + balok.menghitungVolume());
                    System.out.println("Luas Permukaan Balok= " + balok.menghitungLuasPermukaan());        
                    break;
                case 2 :
                    System.out.print("Input Tinggi: ");
                    t = data.nextDouble();
                    System.out.print("Input Jari - jari: ");
                    double r = data.nextDouble();
                    Tabung tabung = new Tabung(r, t);
                    
                    System.out.println("Luas Lingkaran= " + tabung.menghitungLuas());
                    System.out.println("Keliling Lingkaran= " + tabung.menghitungKeliling());
                    System.out.println("Volume Tabung= " + tabung.menghitungVolume());
                    System.out.println("Luas Permukaan Tabung= " + tabung.menghitungLuasPermukaan());
                    break;
                case 0 :
                    System.exit(0);
                default :
                    System.out.println("Menu tidak ada. Mohon masukkan menu dengan benar!");
                    break;
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulangi = data.nextInt();
        }while(ulangi == 1);
    
    }
}
