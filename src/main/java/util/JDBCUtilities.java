/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juansebastian
 */
public class JDBCUtilities {
     // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "/Users/juansebastian/Desktop/Mintic 2022/Ciclo 2/Programming/Week 3/G18/ProyectosConstruccion.db";
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
    }
}
