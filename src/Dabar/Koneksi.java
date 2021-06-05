package Dabar;
/**
 *
 * @author Reta Ramadhani Petriandy
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection databasekoneksi;
    public static Connection koneksiDB() throws SQLException {
        if (databasekoneksi == null){
            try {
                String DB = "jdbc:mysql://localhost:3306/dabar";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                databasekoneksi = (Connection) DriverManager.getConnection(DB,user,pass);
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi GAGAL");
            }
        } return databasekoneksi;
    }
    
}
