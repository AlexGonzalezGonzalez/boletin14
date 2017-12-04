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
    private int nCoches;
    private String matricula;
    private int plazasTotales = 5;
    
    public void aparcarCoche (){
        
         for(int c=0; c<5; c++){
          int matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese matrícula"));
          matricula = nCoches++;
          
          if (nCoches <5){ 
              plazasTotales --;
              JOptionPane.showMessageDialog(null, "Quedan "+plazasTotales+" plazas libres");
          } else {
            JOptionPane.showMessageDialog(null, "¡COMPLETO!");
          }
        }
    }

}
