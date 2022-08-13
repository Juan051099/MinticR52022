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
public class TercerInformeDao {
     public List<TercerInformeVo> listar2() throws SQLException{
        ArrayList<TercerInformeVo> respuesta = new ArrayList<>();
        Connection con = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String consulta = "SELECT C.ID_COMPRA, P.CONSTRUCTORA, P.BANCO_VINCULADO" 
                         +" FROM COMPRA C"
                         +" JOIN PROYECTO P ON(C.ID_PROYECTO=P.ID_PROYECTO)"
                         +" WHERE C.PROVEEDOR ='Homecenter'"
                         +" AND P.CIUDAD = 'Salento'";

        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(consulta);
            while(rs.next()){
                TercerInformeVo conslt = new TercerInformeVo();
                conslt.setId_compra(rs.getInt("ID_Compra"));
                conslt.setConstructora(rs.getString("Constructora"));
                conslt.setBanco_vinculado(rs.getString("Banco_Vinculado"));
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
