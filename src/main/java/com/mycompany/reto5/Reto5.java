/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto5;

import vista.ReportesView;

/**
 *
 * @author juansebastian
 */
public class Reto5 {

    public static void main(String[] args) {
        System.out.println( "Consulta 1" );
        ReportesView C1 = new ReportesView();
        C1.primerInforme();
        
        System.out.println( "Consulta 2" );
        ReportesView C2 = new ReportesView();
        C2.segundoInforme();
        
        System.out.println("Consulta 3 ");
        ReportesView C3 = new ReportesView();
        C3.tercerInforme();
    }
}
