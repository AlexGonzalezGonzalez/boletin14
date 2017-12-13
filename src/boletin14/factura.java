/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class factura extends Garaxe {

    public void factura(String matricula,double tiempo,double prezo) {
        String mensaje, mensaje2;
        double cartosR,cartosD;
        System.out.println("FACTURA");
        System.out.println("matricula: "+matricula);
        System.out.println("tiempo:"+tiempo);
        System.out.println("precio:"+prezo);
        mensaje = JOptionPane.showInputDialog("Introduzca cartos");
        cartosR = Integer.parseInt(mensaje);
         System.out.println("Cartos recibidos: " + cartosR);
         
         cartosD = cartosR - prezo;
        System.out.println("Cartos devoltos: " + cartosD);
        System.out.println("Grazas por usar o noso aparcadoiro");
    }

}
