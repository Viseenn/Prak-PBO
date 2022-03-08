/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung;

/**
 *
 * @author Visen
 */
public class PersegiPanjang implements MenghitungBidang{
    private double p;
    private double l;
    
    public PersegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
    }
    
    //Encapsulation
    public void setPanjang(double p){
        this.p = p;
    }
    
    public void setLebar(double l){
        this.l = l;
    }
    
    public double getPanjang(){
        return this.p;
    }
    
    public double getLebar(){
        return this.l;
    }
    
    @Override
    public double menghitungLuas(){
        return this.p*this.l;
    }
    
    @Override
    public double menghitungKeliling(){
        return 2*(this.p+this.l);
    }
}
