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
     static Nodo inicio;
     static Nodo fin;
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
            public static void Pila(){
                Nodo temp=fin;
                while(temp!=null){
                    System.out.println(temp.getNombre());
                    System.out.println(temp.getImagen());
                    System.out.println("=====================================");
                    temp=temp.getAnterior();
         
            }
        }   
            public static void Cola(){
                Nodo temp=inicio;
                while(temp!=null){
                    System.out.println(temp.getNombre());
                    System.out.println(temp.getImagen());
                    System.out.println("=====================================");
                    temp=temp.getSiguiente();
         
            }
        }
            public static Boolean EliminarPila(int a){
                Object dato;
                Object im;
                dato=ObtenerPilaNombre(a);
                im=ObtenerPilaImagen2(a);
                Nodo temp=fin;
                Nodo tem4;
                int bandera=0;
                int contador=0;
                while(contador!=a){
                    contador++;           
                    temp=temp.anterior;}
                    if(temp.getNombre().equals(dato)){
                        if(temp.getImagen().equals(im)&& bandera<1){
                            
                            if(contador==0){
                                                    fin=fin.getAnterior();
                                                    if(fin!=null){
                                                                    fin.setSiguiente(null);
                                                                    tem4=fin.getAnterior();
                                                                    if(tem4!=null){}
                                                                    else{fin.setAnterior(null);
                                                                    inicio=fin;}}
                                                    else{
                                                                    inicio=null;}
                                                                    tamanio--;
                                                                    return true;}
                            else if(contador==tamanio-1){
                                                    inicio=inicio.getSiguiente();
                                                    if(inicio!=null){
                                                                    inicio.setAnterior(null);}
                                                    else{
                                                                    fin=null;
                                                                    fin.setAnterior(null);}
                                                                    tamanio--;
                                                                    return true;}
                            else{
                                                                    Nodo temp2=temp.siguiente;
                                                                    Nodo temp3=temp.anterior;
                                                                    temp2.setAnterior(temp3);
                                                                    temp3.setSiguiente(temp2);
                                                                    tamanio--;
                                                                    return true;}}
                    bandera++;}

                                                                    

                                                                    
                  return false;
               
        }
            public static Boolean Eliminar(int a){
                Object dato;
                Object im;
                dato=ObtenerColaNombre(a);
                im=ObtenerColaImagen2(a);
                Nodo temp=inicio;
                int bandera=0;
                int contador=0;
                while(contador!=a){
                    contador++;       
                    temp=temp.siguiente;}
                    if(temp.getNombre().equals(dato)){
                        if(temp.getImagen().equals(im)&& bandera<1){
                            
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
                    bandera++;}

                                                                    

                                                                    
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
            
            public static Object ObtenerPilaNombre(int indice){
                int contador=0;
                Nodo temporal=fin;
            
                while(contador<indice){
                
                                        temporal=temporal.anterior;
                                        contador++;
                
                }
            return temporal.nombre;
        }
 
            public static Object ObtenerColaNombre(int indice){
                int contador=0;
                Nodo temporal=inicio;
            
                while(contador<indice){
                
                                        temporal=temporal.siguiente;
                                        contador++;
                
                }
            return temporal.nombre;
        }
            public static Object ObtenerColaImagen2(int indice){
                int contador=0;
                Nodo temporal=inicio;
            
                while(contador<indice){
                
                                        temporal=temporal.siguiente;
                                        contador++;
                
                }
            return temporal.imagen;
        }
            public static Object ObtenerPilaImagen2(int indice){
                int contador=0;
                Nodo temporal=fin;
            
            
                while(contador<indice){
                
                                        temporal=temporal.anterior;
                                        contador++;
                                        //System.out.println(temporal.imagen);
                
                }
            System.out.println(temporal.imagen);    
            return temporal.imagen;}
       
            public static Boolean ModificarCola(int a, Object nombre){
                
                Object imagen;
                
                imagen=ObtenerPilaImagen2(a);
                int conta=0;
                Nodo temp=inicio;
                while(conta!=a){
                conta++;
                temp=temp.siguiente;}
                if(conta==a){
                                    
                                                                        temp.setNombre(nombre);
                                                                        temp.setImagen(imagen);
                                                                        
            return true;}
        return false;
   }
            public static Boolean ModificarPila(int a, Object nombre){
                
                Object imagen;
                
                imagen=ObtenerPilaImagen2(a);
                int conta=0;
                Nodo temp=fin;
                while(conta!=a){
                conta++;
                temp=temp.anterior;}
                if(conta==a){
                                    
                                                                        temp.setNombre(nombre);
                                                                        temp.setImagen(imagen);
                                                                        
            return true;}
            
       
        return false;
   }
}
