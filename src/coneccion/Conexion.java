/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Conexion
{

    Connection con = null;
    
    //se coloca la ruta de la base de datos
    String server = "jdbc:mysql://localhost:3306/personal";
    String usuario = "root";
    String pass = "";
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //direccionde la base de datos
            con = DriverManager.getConnection(server,usuario,pass);
            if (con!=null)
            {
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
            }
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error clase Conexion.conectar!"+e);
        }
        
        return con;
    }
   
    
    
    
}
