/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.sql.*;
import javax.swing.JOptionPane;
import java.security.*;
import java.util.logging.*;

/**
 *
 * @author Visen
 */
public class Data {
    Connector connect = new Connector();
    String data[] = new String[2];
    public String[] username;
    String password, vmd5;
    
    void inputData(String username, String password){
        try{
            if(!cekUser(username)){
                String enPass = enkripsi(password);
                String query = "INSERT INTO `users`(`username`,`password`) VALUES('" + username + "','" + enPass + "')";
                
                connect.statement = connect.connect.createStatement();
                connect.statement.executeUpdate(query);
                
                System.out.println("Berhasil Mendaftar");
                JOptionPane.showMessageDialog(null,"Berhasil Mendaftarkan User");
            }else{
                JOptionPane.showMessageDialog(null,"Username Sudah Digunakan");
            }
        }catch(Exception ex){
            System.out.println("Gagal Mendaftar");
        }
    }
    
    public static String enkripsi(String password){
        String digest = null;
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder(2*hash.length);
            for(byte b : hash){
                sb.append(String.format("%02x", b&0xff));
            }
            digest = sb.toString();
        }catch(NoSuchAlgorithmException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }return digest;
    }
    
    public String[] lihatData(){
        try{
            String query = "SELECT * FROM `users`";
            connect.statement = connect.connect.createStatement();
            ResultSet rs = connect.statement.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString("username");
            }
            
            connect.statement.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            return data;
        }
    }
    
    boolean cekUser(String username){
        try{
            String query = "SELECT * FROM `users` WHERE username='"+username+"'";
            connect.statement = connect.connect.createStatement();
            ResultSet rs = connect.statement.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString("username");
            }
            
            //connect.statement.close();
            data[0].toString();
            System.out.println(data[0].toString());
            return true;
        }catch(Exception e){
            System.out.println("Username belum tersedia");
            return false;
        }
    }
    
    boolean cekPw(String password){
        try{
            String enPass = enkripsi(password);
            String query = "SELECT * FROM `users` WHERE password='"+enPass+"'";
            connect.statement = connect.connect.createStatement();
            ResultSet rs = connect.statement.executeQuery(query);
            
            while(rs.next()){
                data[1] = rs.getString("password");
            }
            
            connect.statement.close();
            data[1].toString();
            return true;
        }catch(Exception e){
            System.out.println("Password belum tersedia");
            return false;
        }
    }
    
    boolean cekLogin(String username, String password){
        try{
            String enPass = enkripsi(password);
            String query = "SELECT * FROM `users` WHERE username='"+username+"'";
            connect.statement = connect.connect.createStatement();
            ResultSet rs = connect.statement.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString("username");
                data[1] = rs.getString("password");
            }
            connect.statement.close();
            data[0].toString();
            data[1].toString();
            if(data[1].toString().equals(enPass)){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            System.out.println("Terjadi kesalahan input");
            return false;
        }
    }
}
