/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Visen
 */

import java.sql.*;

public class Connector {
    String DBurl = "jdbc:mysql://localhost/tugasjdbc";
    String DBusername = "root";
    String DBpassword = "";
    
    Connection connect;
    Statement statement;
    
    public Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi Gagal");
        }
    }
}
