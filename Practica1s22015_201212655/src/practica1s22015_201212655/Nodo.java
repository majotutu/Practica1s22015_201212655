/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

/**
 *
 * @author MariaJose
 */

public class Nodo {
    //atributos del nodo
    Nodo siguiente;
    Nodo anterior;
    Object imagen,nombre;
    
    //asignacion de atributos
         public Nodo(Object nom, Object img, Nodo ant, Nodo sig){
            this.nombre=nom;
            this.imagen= img;
            this.siguiente=sig;
            this.anterior=ant;
         }
         //metodos get
            public Nodo getSiguiente(){
                return siguiente;
   }
            public Nodo getAnterior(){
                return anterior;
            }
            public Object getImagen(){
                return imagen;
    }
            public Object getNombre(){
                return nombre;
    }
            //metodos set
                public void setSiguiente(Nodo siguiente){
                    this.siguiente=siguiente;     
   }
                public void setAnterior(Nodo anterior){
                    this.anterior=anterior;
   }
                public void setImagen(Object Imagen){
                    this.imagen=Imagen;
    }
                public void setNombre(Object nombre){
                    this.nombre=nombre;
    }
            
}
