/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import model.DataTransaksi;
import model.Connector;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Visen
 */
public class daoData implements interfaceDataTransaksi{
    Connection connection;
    final String insert = "INSERT INTO transactions (id_trans, nama_barang, nama_kasir, qty, price_per_qty, discount, price_total) VALUES (?,?,?,?,?,?,?);";
    final String update = "UPDATE transactions SET nama_barang=?, nama_kasir=?, qty=?, price_per_qty=?, discount=?, price_total=? WHERE id_trans=?;";
    final String delete = "DELETE FROM transactions WHERE id_trans=?;";
    final String select = "SELECT * FROM transactions";

    public daoData(){
        connection = Connector.connection();
    }
    
    @Override
    public void insert(String id, String barang, String kasir, int qty, int hargasatuan, int diskon, int totalharga){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, id);
            statement.setString(2, barang);
            statement.setString(3, kasir);
            statement.setInt(4, qty);
            statement.setInt(5, hargasatuan);
            statement.setDouble(6, diskon);
            statement.setDouble(7, totalharga);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try {
                statement.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(String id, String barang, String kasir, int qty, int hargasatuan, int diskon, int totalharga){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, barang);
            statement.setString(2, kasir);
            statement.setInt(3, qty);
            statement.setInt(4, hargasatuan);
            statement.setDouble(5, diskon);
            statement.setDouble(6, totalharga);
            statement.setString(7, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(String id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<DataTransaksi> getData() {
        List<DataTransaksi> listData = null;
        try{
            listData = new ArrayList<DataTransaksi>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                DataTransaksi data = new DataTransaksi();
                data.setId(rs.getString("id_trans"));
                data.setNamaBarang(rs.getString("nama_barang"));
                data.setNamaKasir(rs.getString("nama_kasir"));
                data.setQty(rs.getInt("qty"));
                data.setHargaSatuan(rs.getInt("price_per_qty"));
                data.setDiskon(rs.getInt("discount"));
                data.setHargaTotal(rs.getInt("price_total"));
                listData.add(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(daoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listData;
    }
}
