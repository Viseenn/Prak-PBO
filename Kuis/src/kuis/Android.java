/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

/**
 *
 * @author Visen
 */
public class Android extends Data implements Seleksi{
    
    public Android(String nik, String nama, double tulis, double coding, double wawancara){
        super(nik, nama, tulis, coding, wawancara);
    }
    
    public void setTulis(double tulis){
        this.tulis = tulis;
    }
    
    public void setCoding(double coding){
        this.coding = coding;
    }
    
    public void setWawancara(double wawancara){
        this.wawancara = wawancara;
    }
    
    public double getTulis(){
        return this.tulis;
    }
    
    public double getCoding(){
        return this.coding;
    }
    
    public double getWawancara(){
        return this.wawancara;
    }
    
    @Override
    public double hitung() {
        return (0.2*this.tulis + 0.5*this.coding + 0.3*this.wawancara);
    }

    @Override
    public String keterangan() {
        if(this.hitung() >= 85){
            return "LOLOS \nSelamat kepada " + this.nama + " telah diterima sebagai Android\n";
        }else{
            return "GAGAL \nMohon maaf kepada " + this.nama + " telah ditolak sebagai Android\n";
        }
    }
    
}
