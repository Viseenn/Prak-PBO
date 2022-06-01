/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Visen
 */
public class DataTransaksi {

    private String idTransaksi;
    private String namaBarang;
    private String namaKasir;
    private int quantity;
    private int hargaSatuan;
    private int diskon;
    private int hargaTotal;
    
    public String getId() {
        return idTransaksi;
    }

    public void setId(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
    
    public void setQty(int quantity) {
        this.quantity = quantity;
    }

    public int getQty() {
        return quantity;
    }
    
    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }
    
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public int getDiskon() {
        return diskon;
    }
    
    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }
}
