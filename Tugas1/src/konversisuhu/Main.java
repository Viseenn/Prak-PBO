/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package konversisuhu;

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
        
        Scanner data = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius      : ");
        double suhu = data.nextDouble();
        
        do{
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            int pilih = data.nextInt();

            System.out.println("");
            switch (pilih) {
                case 1:
                    Konversi hasilKonversi = new Konversi(suhu);
                    hasilKonversi.setFahrenheit(suhu);
                    hasilKonversi.setReamur(suhu);
                    hasilKonversi.setKelvin(suhu);
                    hasilKonversi.setKondisi(suhu);
                    
                    System.out.println("Suhu Dalam Celcius   : "+suhu+"°C");
                    System.out.println("Dalam Fahrenheit     : "+hasilKonversi.getFahrenheit()+"°F");
                    System.out.println("Dalam Reamur         : "+hasilKonversi.getReamur()+"°R");
                    System.out.println("Dalam Kelvin         : "+hasilKonversi.getKelvin()+"K");
                    System.out.println("Kondisi Air "+hasilKonversi.getKondisi());
                    break;
                case 2:
                    System.out.println("Input Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius      : ");
                    double edit = data.nextDouble();
                    suhu = edit;
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                    break;
            }
        }while(true);
    }

}