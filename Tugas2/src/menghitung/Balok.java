/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung;

/**
 *
 * @author Visen
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double t;
    
    public Balok(double p, double l, double t){
        super(p, l);
        this.t = t;
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
        return 2*(super.menghitungLuas() + (super.getPanjang()*this.t) + (super.getLebar()*this.t));
    }
    
    @Override
    public double menghitungVolume(){
        return super.menghitungLuas()*this.t;
    }
}
