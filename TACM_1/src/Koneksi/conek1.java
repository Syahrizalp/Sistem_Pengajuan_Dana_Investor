/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

/**
 *
 * @author Acer
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conek1 {
     private static Connection koneksi;

    public static Connection GetConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/pembayaran_dana_investor"; // Ganti dengan URL database Anda
                String user = "root"; // Ganti dengan username database Anda
                String password = ""; // Ganti dengan password database Anda
                
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace(); // Cetak error ke konsol
            }
        }
        return koneksi;
    }
}
