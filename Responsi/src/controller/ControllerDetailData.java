/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoData;
import dao.interfaceDataTransaksi;
import javax.swing.JOptionPane;
import view.detailData;
import model.DataTransaksi;
import view.editData;
import view.viewDataCatatanTransaksi;

/**
 *
 * @author Visen
 */
public class ControllerDetailData {
    detailData frame;
    interfaceDataTransaksi infcData;

    public ControllerDetailData(detailData frame) {
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
        frame.setTotalHarga(data.getHargaTotal());
    }
    
    public void kembali(){
        frame.dispose();
        new viewDataCatatanTransaksi().setVisible(true);
    }
    public void halamanEdit(DataTransaksi data){
        frame.dispose();
        new editData(data).setVisible(true);
    }
    public void hapusData(String idTrans){
        infcData.delete(idTrans);
        JOptionPane.showMessageDialog(frame, "Data berhasil dihapus!");
        kembali();
    }
}
