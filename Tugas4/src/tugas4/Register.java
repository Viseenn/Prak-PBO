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

public class Register extends JFrame{
    public String username, password;
    
    Connector connect = new Connector();
    Data data = new Data();
    
    //Deklarasi Komponen
    JLabel lUsername = new  JLabel("Username");
    JTextField user = new JTextField();
    
    JLabel lPassword = new  JLabel("Password");
    JTextField pw = new JTextField();
    
    JButton btnRegister = new JButton("Daftar");
    JButton btnReset = new JButton("Reset");
    JButton btnLogin = new JButton("Login");
    
    public Register(){
        setTitle("Register");
        setLayout(null);
        setSize(380,350);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        add(lUsername);
        add(user);
        add(lPassword);
        add(pw);
        add(btnRegister);
        add(btnReset);
        add(btnLogin);
        
        lUsername.setBounds(100, 30, 100, 30);
        user.setBounds(100, 60, 172, 30);
        lPassword.setBounds(100, 100, 100, 30);
        pw.setBounds(100, 130, 172, 30);
        btnRegister.setBounds(100, 195, 170, 30);
        btnReset.setBounds(100, 240, 80, 30);
        btnLogin.setBounds(190, 240, 80, 30);
        
        btnRegister.addActionListener((ActionEvent arg0) -> {
            username = user.getText();
            password = pw.getText();
            
            if(!username.isEmpty() && !password.isEmpty()){
                data.inputData(username, password);
            }else{
                JOptionPane.showMessageDialog(null,"Tidak Boleh Kosong");
            }
        });
        
        btnReset.addActionListener((ActionEvent arg0) -> {
            user.setText("");
            pw.setText("");
        });
        
        btnLogin.addActionListener((ActionEvent arg0) -> {
            new Login().setVisible(true);
            setVisible(false);
        });
    }
}
                
                
              
