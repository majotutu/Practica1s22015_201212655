/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author MariaJose
 */
public class Tablero {
    public static JPanel PanelTablero;
    public static JFrame ventana;
    public Tablero(){
        ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setBounds(0, 0, 1000, 730);
        //ventana.setSize(1000,1000);
        ventana.setVisible(true);
       
        
    }
}
