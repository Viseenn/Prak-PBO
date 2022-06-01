/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.DataTransaksi;

/**
 *
 * @author Visen
 */
public interface interfaceDataTransaksi {
    public void insert(String id, String barang, String kasir, int qty, int hargasatuan, int diskon, int totalharga);
    public void update(String id, String barang, String kasir, int qty, int hargasatuan, int diskon, int totalharga);
    public void delete(String id);
    public List<DataTransaksi> getData();
}
