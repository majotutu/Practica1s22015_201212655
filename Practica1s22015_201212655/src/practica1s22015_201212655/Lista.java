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
public class Lista {
     Nodo inicio;
     Nodo fin;
     public static int tamanio;
     
        public Lista(){
            inicio=null;
            fin=null;}
        //metodos de insercion
            public void InsertarInicio(Object nombre, Object imagen){
                if(inicio==null){
                    inicio=new Nodo(nombre, imagen,null,null);
                    fin=inicio;}
                else{
                    Nodo nuevo=new Nodo(nombre, imagen,null,inicio);
                    inicio.setAnterior(nuevo);
                    inicio=nuevo;
                    }
                tamanio++;
            }
            
            public void InsertarFin(Object nombre, Object imagen){
                if(inicio==null){
                    inicio=new Nodo(nombre, imagen, null, null);
                    fin=inicio;}
                else{
                    Nodo nuevo=new Nodo(nombre, imagen,fin,null);
                    fin.setSiguiente(nuevo);
                    fin=nuevo;}
                tamanio++;}
            
            //metodos extraccion
            public String ExtraerImagenInicio(){
                Object img=inicio.getImagen();
                Object nombre=inicio.getNombre();
                inicio=inicio.getSiguiente();
                    if(inicio!=null){
                        inicio.setAnterior(null);}
                    else{
                        fin=null;}
                    tamanio--;
                String atributos=img.toString()+","+nombre.toString();
            return atributos;
    }
            public Boolean Eliminar(Object dato, Object im){
                Nodo temp=inicio;
                int contador=-1;
                while(contador<tamanio){
                    contador++;                 
                    if(temp.getNombre().equals(dato)){
                        if(temp.getImagen().equals(im)){
                        
                            if(contador==0){
                                                    inicio=inicio.getSiguiente();
                                                    if(inicio!=null){
                                                                    inicio.setAnterior(null);}
                                                    else{
                                                                    fin=null;}
                                                                    tamanio--;
                                                                    return true;}
                            else if(contador==tamanio-1){
                                                    fin=fin.getAnterior();
                                                    if(inicio!=null){
                                                                    fin.setSiguiente(null);}
                                                    else{
                                                                    inicio=null;}
                                                                    tamanio--;
                                                                    return true;}
                            else{
                                                                    Nodo temp2=temp.siguiente;
                                                                    Nodo temp3=temp.anterior;
                                                                    temp2.setAnterior(temp3);
                                                                    temp3.setSiguiente(temp2);
                                                                    tamanio--;
                                                                    return true;}}

                                                                    temp=temp.siguiente;}}

                                                                    
                  return false;
               
       
        
        }
}
