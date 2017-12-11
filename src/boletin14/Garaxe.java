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
    double tiempo;
    double prezo;

    public void aparcarCoche() {

        for (int c = 0; c < 5; c++) {
            matricula = JOptionPane.showInputDialog("Ingrese matrícula");
            nCoches++;
            factura mt = new factura();
            
            tiempo = (int) (Math.random() * 10) + 1;
            if (tiempo > 3.0) {
                prezo = ((double) tiempo - 3) * 0.2 + 1.5;
            } else {
                prezo = 1.5;
            }
            mt.factura(matricula, tiempo, prezo);
           

            if (nCoches < 5) {
                plazasTotales--;
                JOptionPane.showMessageDialog(null, "Quedan " + plazasTotales + " plazas libres");
            } else {
                JOptionPane.showMessageDialog(null, "¡COMPLETO!");
            }
        }
    }

}
