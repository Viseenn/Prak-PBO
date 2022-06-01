/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoData;
import dao.interfaceDataTransaksi;
import javax.swing.JOptionPane;
import model.DataTransaksi;
import view.editData;
import view.viewDataCatatanTransaksi;

/**
 *
 * @author Visen
 */
public class ControllerEditData {
    editData frame;
    interfaceDataTransaksi infcData;

    public ControllerEditData(editData frame) {
        this.frame = frame;
        infcData = new daoData();
    }
    public void tampilkanData(DataTransaksi data){
        frame.setId(data.getId());
        frame.setNamaBarang(data.getNamaBarang());
        frame.setNamaKasir(data.getNamaKasir());
        frame.setQty(data.getQty());
        frame.setHargaSatuan(data.getHargaSatuan());
        frame.setDiskon(data.getDiskon());
        
    }
    public void simpanEdit(String id){
        String barang = frame.getNamaBarang().getText();
        String kasir = frame.getNamaKasir().getText();
        int qty = (int) frame.getQty().getValue();
        int hargasatuan = (int) frame.getHargaSatuan().getValue();
        int diskon = (int) frame.getDiskon().getValue();
        int total = (qty*hargasatuan);
        int totall = total*diskon/100;
        int totalharga = total - totall;
        frame.setId(id);
        
        if(barang.equals("")||kasir.equals("")||qty==0||hargasatuan==0||diskon==0){
            JOptionPane.showMessageDialog(frame, "Gagal mengedit data, tidak boleh ada kolom yang kosong!");
        }else{
            infcData.update(id, barang, kasir, qty, hargasatuan, diskon, totalharga);
            JOptionPane.showMessageDialog(frame, "Berhasil mengedit data");
            kembali();
        }
    }
    public void kembali(){
        frame.dispose();
        new viewDataCatatanTransaksi().setVisible(true);
       }
}
