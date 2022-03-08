/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung;

/**
 *
 * @author Visen
 */
public class Lingkaran implements MenghitungBidang{
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    //Encapsulation
    public void setRadius(double r){
        this.r = r;
    }
    
    public double getRadius(){
        return this.r;
    }
    
    @Override
    public double menghitungLuas(){
        return PHI*(this.r*this.r);
    }
    
    @Override
    public double menghitungKeliling(){
        return 2*PHI*this.r;
    }
}
