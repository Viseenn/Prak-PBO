/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung;

/**
 *
 * @author Visen
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double t;
    
    public Tabung(double r, double t){
        super(r);
        this.t = t;
    }
    
    public Tabung(double r){
        super(r);
    }
    
    //Encapsulation
    public void setTinggi(double tinggi){
        this.t = tinggi;
    }
    
    public double getTinggi(){
        return this.t;
    }
    
    @Override
    public double menghitungLuasPermukaan(){
        return super.menghitungKeliling()*(super.getRadius()+this.t);
    }
    
    @Override
    public double menghitungVolume(){
        return super.menghitungLuas()*this.t;
    }
}
