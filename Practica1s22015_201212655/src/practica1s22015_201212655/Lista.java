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
     public static int forma;
     
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
                tamanio++;
            System.out.println(nombre.toString() +" "+imagen.toString());
            }
            
            //metodos extraccion
            public void Pila(){
                Nodo temp=fin;
                while(temp!=null){
                    System.out.println(temp.getNombre());
                    System.out.println(temp.getImagen());
                    System.out.println("=====================================");
                    temp=temp.getAnterior();
         
            }
        }   
            public void Cola(){
                Nodo temp=inicio;
                while(temp!=null){
                    System.out.println(temp.getNombre());
                    System.out.println(temp.getImagen());
                    System.out.println("=====================================");
                    temp=temp.getSiguiente();
         
            }
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
                                                                    return true;}}}

                                                                    temp=temp.siguiente;}

                                                                    
                  return false;
               
        }
            public Nodo IndiceDar(Object dato){
                Nodo temp=inicio;
                while(temp!=null){
                                    if(temp.getNombre().equals(dato)){
                                                                        return temp;}
                                                                        temp=temp.siguiente;
            }
            return null;}
            
            public Object ObtenerPilaNombre(int indice){
                int contador=0;
                Nodo temporal=fin;
            
                while(contador<indice){
                
                                        temporal=temporal.anterior;
                                        contador++;
                
                }
            return temporal.nombre;
        }
 
            public Object ObtenerColaNombre(int indice){
                int contador=0;
                Nodo temporal=inicio;
            
                while(contador<indice){
                
                                        temporal=temporal.siguiente;
                                        contador++;
                
                }
            return temporal.nombre;
        }
            public Object ObtenerColaImagen2(int indice){
                int contador=0;
                Nodo temporal=inicio;
            
                while(contador<indice){
                
                                        temporal=temporal.siguiente;
                                        contador++;
                
                }
            return temporal.imagen;
        }
            public Object ObtenerPilaImagen2(int indice){
                int contador=0;
                Nodo temporal=fin;
            
                while(contador<indice){
                
                                        temporal=temporal.anterior;
                                        contador++;
                
                }
            return temporal.imagen;
        }
}