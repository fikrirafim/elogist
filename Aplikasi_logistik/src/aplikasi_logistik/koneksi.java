/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_logistik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/elogist","root","");
            stm = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"koneksi database gagal"+e.getMessage());
        }
    }
}
