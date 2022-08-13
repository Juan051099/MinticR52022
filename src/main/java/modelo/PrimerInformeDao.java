/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author juansebastian
 */
public class PrimerInformeDao {
     //Creamos metodo para listar
    public List<PrimerInformeVo> listar() throws SQLException{
        ArrayList<PrimerInformeVo> respuesta = new ArrayList<>();
        Connection con = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String consulta = "SELECT ID_LIDER, NOMBRE, PRIMER_APELLIDO, CIUDAD_RESIDENCIA"
                        +" FROM LIDER L" 
                        +" ORDER BY CIUDAD_RESIDENCIA ASC";

        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(consulta);
            while(rs.next()){
                PrimerInformeVo conslt = new PrimerInformeVo();
                conslt.setId_lider(rs.getInt("id_lider"));
                conslt.setNombre(rs.getString("nombre"));
                conslt.setPrimer_apellido(rs.getString("primer_apellido"));
                conslt.setCiudad_residencia(rs.getString("ciudad_residencia"));
                respuesta.add(conslt);
            }
        }finally{
            //Liberar recursos
            if (rs != null){
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null){
                con.close();
            }

        }
        return respuesta;
    }
}
