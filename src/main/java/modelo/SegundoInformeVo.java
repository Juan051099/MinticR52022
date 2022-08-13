/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juansebastian
 */
public class SegundoInformeVo {
    private Integer id_proyecto;
    private String constructora;
    private Integer nhabitaciones;
    private String ciudad;

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNhabitaciones() {
        return nhabitaciones;
    }

    public void setNhabitaciones(Integer nhabitaciones) {
        this.nhabitaciones = nhabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
     @Override
    public String toString() {
       return  String.format("%-10d %-25s %-20d %-15s", id_proyecto, constructora, nhabitaciones, ciudad);
    }
}
