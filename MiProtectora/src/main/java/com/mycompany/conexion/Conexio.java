/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class Conexio {

    private Connection conexion = null;

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/prova";
    private String usuario = "root";
    private String contrasena = "1234";

    public Conexio() {
        conectar();
    }
    
    

    public Connection getConexion() {
        return conexion;
    }

    public void conectar() {
        try {

            Class.forName(driver);//Le mandamos el driver
            conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error en conectar: " + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Error al crear conexión: " + ex.getMessage());
        }

    }
    public void ejecutarUpdate(String sql){

    }

    public void desconcectar() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
