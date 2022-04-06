/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis;

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
        
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        int pilih = data.nextInt();
        
        System.out.println("");
        System.out.println("FORM PENDAFTARAN");
        System.out.println("");
        System.out.print("Input NIK : ");
        String nik = data.next();
        System.out.print("Input Nama : ");
        data.nextLine();
        String nama = data.nextLine();
        System.out.print("Input Nilai Tes Tulis : ");
        double tulis = data.nextDouble();
        System.out.print("Input Nilai Tes Coding : ");
        double coding = data.nextDouble();
        System.out.print("Input Nilai Tes Wawancara : ");
        double wawancara = data.nextDouble();
        
        switch(pilih){
            case 1 :
                Android android = new Android(nik, nama, tulis, coding, wawancara);
                do{
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int p = data.nextInt();
                    
                    switch (p) {
                        case 1:
                            System.out.println("");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : ");
                            android.setTulis(data.nextDouble());
                            System.out.print("Input Nilai Tes Coding : ");
                            android.setCoding(data.nextDouble());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            android.setWawancara(data.nextDouble());
                            break;
                        case 2:
                            System.out.println("Nilai Akhir : " + android.hitung());
                            System.out.println("KETERANGAN : " + android.keterangan());
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            System.out.println("Opsi tidak ada\n");
                            break;
                    }
                }while(true);
            case 2 :
                Web web = new Web(nik, nama, tulis, coding, wawancara);
                do{
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int p = data.nextInt();
                    
                    switch (p){
                        case 1:
                            System.out.println("");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : ");
                            web.setTulis(data.nextDouble());
                            System.out.print("Input Nilai Tes Coding : ");
                            web.setCoding(data.nextDouble());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            web.setWawancara(data.nextDouble());
                            break;
                        case 2:
                            System.out.println("Nilai Akhir : " + web.hitung());
                            System.out.println("KETERANGAN : " + web.keterangan());
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            System.out.println("Opsi tidak ada\n");
                            break;
                    }
                }while(true);
        } 
    }
}
