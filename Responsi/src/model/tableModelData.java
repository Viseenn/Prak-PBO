/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Visen
 */
public class tableModelData extends AbstractTableModel{
    List<DataTransaksi> list_data;

    public tableModelData(List<DataTransaksi> list_data) {
        this.list_data = list_data;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return list_data.size();
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID Transaksi";
            case 1 -> "Nama Barang";
            case 2 -> "Nama Kasir";
            case 3 -> "Quantity";
            case 4 -> "Harga Satuan";
            case 5 -> "Diskon";
            case 6 -> "Harga Total";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> list_data.get(row).getId();
            case 1 -> list_data.get(row).getNamaBarang();
            case 2 -> list_data.get(row).getNamaKasir();
            case 3 -> list_data.get(row).getQty();
            case 4 -> list_data.get(row).getHargaSatuan();
            case 5 -> list_data.get(row).getDiskon();
            case 6 -> list_data.get(row).getHargaTotal();
            default -> null;
        };
    }
}
