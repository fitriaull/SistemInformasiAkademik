package sisteminformasiakademik;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_perkuliahan";
            String user = "root";
            String pass = "";

            // Tambahkan baris ini di dalam blok try
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) { // Gunakan Exception umum agar menangkap ClassNotFound juga
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
    }
    return koneksi;
}
}
