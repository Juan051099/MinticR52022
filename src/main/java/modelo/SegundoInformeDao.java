/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author juansebastian
 */
public class SegundoInformeDao {
    public List<SegundoInformeVo> listar() throws SQLException{
        ArrayList<SegundoInformeVo> consult = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        
        String consulta = "SELECT ID_PROYECTO, CONSTRUCTORA, NUMERO_HABITACIONES, CIUDAD"
                +" FROM PROYECTO P"
                +" WHERE CLASIFICACION = 'Casa Campestre' "
                +" AND CIUDAD IN('Santa Marta','Cartagena','Barranquilla')";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(consulta);
            while(rs.next()){
            SegundoInformeVo info = new SegundoInformeVo();
            info.setId_proyecto(rs.getInt("ID_Proyecto"));
            info.setConstructora(rs.getString("Constructora"));
            info.setNhabitaciones(rs.getInt("Numero_habitaciones"));
            info.setCiudad(rs.getString("Ciudad"));
            consult.add(info);
            
            }
        
        
        }finally{
            //Liberar recursos
            if (rs != null){
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null){
                conn.close();
            }

        }
        return consult;
        
        
    }
    
}
