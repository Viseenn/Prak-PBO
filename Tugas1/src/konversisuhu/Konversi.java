/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author Visen
 */
public class Konversi {

    /**
     */
    public double suhu;
    private double reamur;
    private double fahrenheit;
    private double kelvin;
    private String kondisi;
    
    public Konversi(double suhu){
        this.suhu = suhu;
    }
    
    public void setReamur(double suhu){
        reamur = (4*this.suhu)/5;
    }
    
    public void setFahrenheit(double suhu){
        fahrenheit = ((9 * this.suhu) / 5) + 32;
    }
    
    public void setKelvin(double suhu){
        kelvin = this.suhu + 273.15;
    }
    
    public double getReamur(){
        return reamur;
    }
    
    public double getFahrenheit(){
        return fahrenheit;
    }
    
    public double getKelvin(){
        return kelvin;
    }
    
    public void setKondisi(double suhu){
        if(suhu <= 0){
            kondisi = "Beku.";
        }else if(suhu >= 100){
            kondisi = "Mendidih.";
        }else{
            kondisi = "Normal.";
        }
    }
    
    public String getKondisi(){
        return kondisi;
    }

}
 
