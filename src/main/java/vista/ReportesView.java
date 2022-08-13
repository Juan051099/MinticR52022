/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ReportesController;
import java.sql.SQLException;
import java.util.List;
import modelo.PrimerInformeVo;
import modelo.SegundoInformeVo;
import modelo.TercerInformeVo;



/**
 *
 * @author juansebastian
 */
public class ReportesView {
   private static ReportesController controlador;
    public ReportesView(){
        controlador = new ReportesController();
    }
    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
        }
        public void primerInforme(){
        System.out.println(repitaCaracter('=', 6) + " PRIMER INFORME "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-6s %-18s %-15s %-15s", "ID_LIDER", "NOMBRE","PRIMER_APELLIDO","CIUDAD_RESIDENCIA"));
        System.out.println(repitaCaracter('-', 60));
        try{
            List<PrimerInformeVo> proyec = controlador.mostrarB();
            for(PrimerInformeVo i:proyec){
                System.out.println(i);
            }
        }catch(SQLException e){
            System.err.println("Error: "+e);
        }
      }
        public void segundoInforme(){
            System.out.println(repitaCaracter('=', 6) + " SEGUNDO INFORME "
            + repitaCaracter('=', 7));
            System.out.println(String.format("%-6s %-18s %-15s %-14s", "ID_PROYECTO", "CONSTRUCTORA","NHABITACIONES","CIUDAD"));
            System.out.println(repitaCaracter('-', 60));
        try {
            List<SegundoInformeVo> informe2 = controlador.mostrar();
            for(SegundoInformeVo j: informe2){
                System.out.println(j);
            }
        
        }catch(SQLException e){
            System.err.println("Error:"+e);
        }
        }
        public void tercerInforme(){
        System.out.println(repitaCaracter('=', 6) + " TERCER INFORME "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-6s %-18s %-14s", "ID_COMPRA", "CONSTRUCTORA","BANCO VINCULADO"));
        System.out.println(repitaCaracter('-', 60));
        try{
            List<TercerInformeVo> proyec = controlador.mostrar1();
            for(TercerInformeVo j:proyec){
                System.out.println(j);
            }
        }catch(SQLException e){
            System.err.println("Error: "+e);
        }
      }
}
     
