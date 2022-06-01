/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoData;
import dao.interfaceDataTransaksi;
import javax.swing.JOptionPane;
import view.tambahData;
import model.DataTransaksi;
import view.viewDataCatatanTransaksi;


/**
 *
 * @author Visen
 */
public class ControllerTambahData {
    tambahData frame;
    interfaceDataTransaksi infcData;
        
    public ControllerTambahData(tambahData frame) {
        this.frame = frame;
        infcData = new daoData();
    }
    
    public void tambahkanData(){
        String id = frame.getId().getText();
        String barang = frame.getNamaBarang().getText();
        String kasir = frame.getNamaKasir().getText();
        int qty = (int) frame.getQty().getValue();
        int hargasatuan = (int) frame.getHargaSatuan().getValue();
        int diskon = (int) frame.getDiskon().getValue();
        int total = (qty*hargasatuan);
        int totall = total*diskon/100;
        int totalharga = total - totall;
        if(id.equals("")||barang.equals("")||kasir.equals("")||qty==0||hargasatuan==0||diskon==0){
            JOptionPane.showMessageDialog(frame, "Gagal menambahkan data, tidak boleh ada kolom yang kosong!");
        }else{
            infcData.insert(id, barang, kasir, qty, hargasatuan, diskon, totalharga);
            JOptionPane.showMessageDialog(frame, "Berhasil menambahkan data terbaru");
            kembali();
        }
    }
    
    public void kembali(){
        frame.dispose();
        new viewDataCatatanTransaksi().setVisible(true);
    }
    
    public void resetForm(){
        frame.setId("");
        frame.setNamaBarang("");
        frame.setNamaKasir("");
        frame.setQty(0);
        frame.setHargaSatuan(0);
        frame.setDiskon(0);
    }
}
