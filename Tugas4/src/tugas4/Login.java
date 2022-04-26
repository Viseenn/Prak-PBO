/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Visen
 */

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Login extends JFrame{
    public String username, password;
    
    Connector connect = new Connector();
    
    //Deklarasi Komponen    
    JLabel lUsername = new  JLabel("Username");
    JTextField user = new JTextField();
    
    JLabel lPassword = new  JLabel("Password");
    JTextField pw = new JTextField();
    
    JButton btnLogin = new JButton("Login");
    JButton btnReset = new JButton("Reset");
    JButton btnRegister = new JButton("Daftar");
    
    public Login(){
        setTitle("Login");
        setLayout(null);
        setSize(380,350);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        add(lUsername);
        add(user);
        add(lPassword);
        add(pw);
        add(btnLogin);
        add(btnReset);
        add(btnRegister);
       
        lUsername.setBounds(100, 30, 100, 30);
        user.setBounds(100, 60, 172, 30);
        lPassword.setBounds(100, 100, 100, 30);
        pw.setBounds(100, 130, 172, 30);
        btnRegister.setBounds(190, 240, 80, 30);
        btnReset.setBounds(100, 240, 80, 30);
        btnLogin.setBounds(100, 195, 170, 30);
        
        btnLogin.addActionListener((ActionEvent arg0) -> {
            username = user.getText();
            password = pw.getText();
            
            Data data = new Data();
            
            if(data.cekUser(username) && data.cekLogin(username, password)){
                JOptionPane.showMessageDialog(null,"Berhasil Login");
            }else if(username.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(null,"Tidak Boleh Kosong");
            }else if(!data.cekUser(username) && !data.cekPw(password)){
                JOptionPane.showMessageDialog(null,"Username Tidak Ditemukan");
            }else if(!data.cekUser(username)){
                JOptionPane.showMessageDialog(null,"Username Salah");
            }else{
                JOptionPane.showMessageDialog(null,"Password Salah");
            }
        });
        
        btnReset.addActionListener((ActionEvent arg0) -> {
            user.setText("");
            pw.setText("");
        });
        
        btnRegister.addActionListener((ActionEvent arg0) -> {
            new Register().setVisible(true);
            setVisible(false);
        });
    }
}
