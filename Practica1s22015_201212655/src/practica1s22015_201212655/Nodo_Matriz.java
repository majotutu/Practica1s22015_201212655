/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

import java.awt.Component;

/**
 *
 * @author MariaJose
 */
public class Nodo_Matriz extends javax.swing.JButton{
    
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
            //this.addActionListener(actionListener);
            
            
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
    
}
