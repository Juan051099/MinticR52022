/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.SQLException;
import java.util.List;
import modelo.PrimerInformeDao;
import modelo.PrimerInformeVo;
import modelo.SegundoInformeDao;
import modelo.SegundoInformeVo;
import modelo.TercerInformeDao;
import modelo.TercerInformeVo;

/**
 *
 * @author juansebastian
 */
public class ReportesController {
    private final PrimerInformeDao primerInformeDao;
    private final SegundoInformeDao segundoInformeDao;
    private final TercerInformeDao tercerInformeDao;
   
    

    public ReportesController(){
        primerInformeDao = new PrimerInformeDao();
        segundoInformeDao = new SegundoInformeDao();
        tercerInformeDao = new TercerInformeDao();
        
        
    }

    //Toca hacer tres metodos para entregar la informacion y poder verla en pantalla
    public List<PrimerInformeVo> mostrarB() throws SQLException{
        return primerInformeDao.listar();
    }
    
    public List<SegundoInformeVo> mostrar() throws SQLException{
        return segundoInformeDao.listar();
    }
    
    public List<TercerInformeVo> mostrar1() throws SQLException {
        return tercerInformeDao.listar2();
    } 

}
