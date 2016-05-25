/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import vistas.LogInVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vistas.vistaHistorial;


/**
 *
 * @author Eduardo
 */
public class ControladorPrincipal {
    private LogInVista ventana;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorPrincipal cp= new ControladorPrincipal();
        cp.ventana = new LogInVista();
        cp.ventana.setVisible(true);
        cp.ventana.setTitle("Dungeon Dice Monster");
        cp.ventana.setResizable(false);
        cp.ventana.setLocation(600, 300);
        
        
        
    }
}
    
    
               
