/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoData;
import dao.interfaceDataTransaksi;
import java.util.List;
import model.DataTransaksi;
import model.tableModelData;
import view.detailData;
import view.tambahData;
import view.viewDataCatatanTransaksi;

/**
 *
 * @author Visen
 */
public class ControllerData {
    viewDataCatatanTransaksi frame;
    interfaceDataTransaksi infcData;
    List<DataTransaksi> list_data;

    public ControllerData(viewDataCatatanTransaksi frame) {
        this.frame = frame;
        infcData = new daoData();
        list_data = infcData.getData();
    }
  
    public void loadTable(){
       tableModelData tmd = new tableModelData(list_data);
       frame.getTableData().setModel(tmd);
    }
    
    public void tambahData(){
        frame.dispose();
        new tambahData().setVisible(true);
    }
    public void halamanDetail(int row){
        DataTransaksi data = list_data.get(row);
        frame.dispose();
        new detailData(data).setVisible(true);
    }
}
