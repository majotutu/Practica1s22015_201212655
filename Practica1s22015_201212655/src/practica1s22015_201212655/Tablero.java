/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author MariaJose
 */
public class Tablero implements ActionListener {
    Matriz m;
    Lista l;
    public static JButton AgregarFila, AgregarColumna,graficas;
    public static JLabel lista_extraer,objeto,objeto2;
    public static JFrame ventana;
    public Tablero(){
        ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setBounds(0, 0, 1500, 730);
        ventana.setVisible(true);
        AgregarFila=new JButton("AgregarFila");
        AgregarFila.setBounds(1210,0,150,15);
        AgregarColumna=new JButton("AgregarColumna");
        AgregarColumna.setBounds(1210,16,150,15);
        lista_extraer=new JLabel();
        lista_extraer.setBounds(1020, 12, 132, 122);
        objeto=new JLabel("Nombre");
        objeto2=new JLabel();
        objeto.setBounds(1170, 40, 60, 15);
        objeto2.setBounds(1210, 65, 70, 15);
        graficas=new JButton("Grafica");
        graficas.setBounds(20, 7, 80, 20);
        graficas.addActionListener(this);
        ventana.add(graficas);
       if(l.forma==0){
           Object img=l.ObtenerPilaImagen2(0);
           Object nom=l.ObtenerPilaNombre(0);
            String path="/Imagenes/"+img.toString()+".JPG";
            URL url=this.getClass().getResource(path);
            ImageIcon iconos = new ImageIcon(url);
            Icon iconos2=new ImageIcon(iconos.getImage().getScaledInstance(lista_extraer.getWidth(), lista_extraer.getHeight(), Image.SCALE_DEFAULT));
            lista_extraer.setIcon(iconos2);
            objeto2.setText(nom.toString());
            }
       else{
       Object img=l.ObtenerColaImagen2(0);
           Object nom=l.ObtenerColaNombre(0);
            String path="/Imagenes/"+img.toString()+".JPG";
            URL url=this.getClass().getResource(path);
            ImageIcon iconos = new ImageIcon(url);
            Icon iconos2=new ImageIcon(iconos.getImage().getScaledInstance(lista_extraer.getWidth(), lista_extraer.getHeight(), Image.SCALE_DEFAULT));
            lista_extraer.setIcon(iconos2);
            objeto2.setText(nom.toString());}
        AgregarColumna.addActionListener(this);
        AgregarFila.addActionListener(this);
        ventana.add(objeto);
        ventana.add(objeto2);
        ventana.add(AgregarFila);
        ventana.add(AgregarColumna);
        ventana.add(lista_extraer);
        
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==AgregarColumna){
        m.InsertarColumna();}
        else if(e.getSource()==AgregarFila){
        m.InsertarFila();}
        else if(e.getSource()==graficas){
        m.Graficas();}
    }
}
