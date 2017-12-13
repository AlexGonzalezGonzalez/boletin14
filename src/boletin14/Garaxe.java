/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Garaxe {

    int nCoches;
    String matricula;
    int plazasTotales = 5;
    long tiempoInicio,tiempo;
    double prezo;
    
    public void aparcarCoche() {

        for (int c = 0; c < plazasTotales; c++) {
            tiempoInicio=System.currentTimeMillis();
            matricula = JOptionPane.showInputDialog("Ingrese matrícula");
            nCoches++;
            factura mt = new factura();
            
            tiempo =    System.currentTimeMillis()-tiempoInicio;
            if (tiempo > 3000) {
                prezo = ( tiempo - 3000) * 0.0002 + 1.5;
            } else {
                prezo = 1.5;
            }
            mt.factura(matricula, tiempo, prezo);
           

            if (nCoches < 5) {
                
                JOptionPane.showMessageDialog(null, "Quedan " + plazasTotales + " plazas libres");
            } else {
                JOptionPane.showMessageDialog(null, "¡COMPLETO!");
            }
        }
    }

}
