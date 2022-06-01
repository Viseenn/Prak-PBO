/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Visen
 */
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Connector {
    static Connection con;
    public static Connection connection(){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("trans_db");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.print("Koneksi Berhasil");
            }catch (SQLException ex) {
                ex.printStackTrace();
                System.out.print("Koneksi Gagal");
            }
        return con;
    }
}
