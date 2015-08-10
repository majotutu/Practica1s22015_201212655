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
import javax.swing.JLabel;
import static practica1s22015_201212655.ListaFinal.jLabel4;

/**
 *
 * @author MariaJose
 */
public class Nodo_Matriz extends javax.swing.JButton implements ActionListener {
    Lista l;
    Nodo_Matriz arriba;
    Nodo_Matriz abajo;
    Nodo_Matriz derecha;
    Nodo_Matriz izquierda;
    Object nombre, imagen;
    int x,y;
    //public int r=0;
    
    public Nodo_Matriz(int X, int Y,Object nom, Object img, Nodo_Matriz arr, Nodo_Matriz aba, Nodo_Matriz der, Nodo_Matriz izq){
            
            this.x=X;
            this.y=Y;
            this.nombre=nom;
            this.imagen= img;
            this.arriba=arr;
            this.abajo=aba;
            this.derecha=der;
            this.izquierda=izq;
            this.addActionListener(this);
            this.setVisible(true);
            
            
            
            
         }
         //metodos get
            public int getX(){
                return x;
   }
            public int getY(){
                return y;
   }
            public Nodo_Matriz getArriba(){
                return arriba;
   }
            public Nodo_Matriz getAbajo(){
                return abajo;
   }
            public Nodo_Matriz getDerecha(){
                return derecha;
   }
            public Nodo_Matriz getIzquierda(){
                return izquierda;
            }
            public Object getImagen(){
                return imagen;
    }
            public Object getNombre(){
                return nombre;
    }
            //metodos set
                public void setArriba(Nodo_Matriz arriba){
                    this.arriba=arriba;     
   }
                public void setAbajo(Nodo_Matriz abajo){
                    this.abajo=abajo;
                 
   }
                public void setDerecha(Nodo_Matriz derecha){
                    this.derecha=derecha;}
                
                public void setIzquierda(Nodo_Matriz izquierda){
                    this.izquierda=izquierda;}
                
                public void setImagen(Object Imagen){
                    this.imagen=Imagen;
    }
                public void setNombre(Object nombre){
                    this.nombre=nombre;
    }
                public void setX(int X){
                    this.x=X;
    }
                public void setY(int y){
                    this.y=y;}

    @Override
    public void actionPerformed(ActionEvent e) {
        
   
        Object c=e.getSource();
        if(c==this){
        
        
        if(l.forma==0){
            if(this.getImagen()!=null){
                
                                 System.out.println(this.getImagen().toString());
                                 this.setIcon(null);
                                 l.InsertarInicio(this.getNombre(), this.getImagen());
                                }
            else{
            System.out.println("nada");}
        ModoPila();
        }}
        //To change body of generated methods, choose Tools | Templates.
    }

    private void ModoPila() {
        String path1="/Imagenes/"+l.ObtenerPilaImagen2(0).toString()+".JPG";
        URL urls=this.getClass().getResource(path1);
        ImageIcon iconos1 = new ImageIcon(urls);
        Icon iconos22=new ImageIcon(iconos1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        this.setIcon(iconos22);
        this.setImagen(l.ObtenerPilaImagen2(0));
        this.setNombre(l.ObtenerPilaNombre(0));
            
        l.EliminarPila(0);
        
        String path="/Imagenes/"+l.ObtenerPilaImagen2(0).toString()+".JPG";
            URL url=this.getClass().getResource(path);
            ImageIcon iconos = new ImageIcon(url);
            Icon iconos2=new ImageIcon(iconos.getImage().getScaledInstance(Tablero.lista_extraer.getWidth(), Tablero.lista_extraer.getHeight(), Image.SCALE_DEFAULT));
            Tablero.lista_extraer.setIcon(iconos2);
            Tablero.objeto2.setText(l.ObtenerPilaNombre(0).toString()); }

   

    
}
