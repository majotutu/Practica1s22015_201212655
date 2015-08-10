/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author MariaJose
 */
public class Matriz {
    public static Nodo_Matriz raiz;
    Tablero t;
    public static int contar1;
    public static int contar2;
    
        
        public Matriz(){
        raiz=null;}
        
        
            public static void generarPrimera(){
                contar1=640;
                contar2=590;
              
                raiz=new Nodo_Matriz(0,0,null,null,null,null,null,null);
                raiz.setBounds(0, contar1, 50, 50);
                Nodo_Matriz uno=new Nodo_Matriz(0,1,null,null,null,raiz,null,null);
                uno.setBounds(0, 590, 50, 50);
                
                raiz.setArriba(uno);
                Tablero.ventana.add(raiz);
                Tablero.ventana.add(uno);
                
                
                
                Nodo_Matriz aux;
                Nodo_Matriz aux2=raiz;
                Nodo_Matriz aux3=raiz;
                Nodo_Matriz aux4;
                int cont=50;
                for(int x=1; x<4 ;x++){
                    
                    
                                    aux=new Nodo_Matriz(x,0,null,null,null,null,null,aux2);
                                    aux.setBounds(cont, contar1, 50, 50);
                                    Tablero.ventana.add(aux);
                                    aux2.setDerecha(aux);                                    
                                    aux2=aux;  
                                    aux4=new Nodo_Matriz(x,1,null,null,null,aux2,null,uno);
                                    aux4.setBounds(cont, contar1-50, 50, 50);
                                    Tablero.ventana.add(aux4);
                                  
                                    aux2.setArriba(aux4);
                                    uno.setDerecha(aux4);
                                    uno=aux4;
                                    cont=cont+50;
                            
                try{
                   
                    System.out.println("x,y: "+x+" "+aux.y);
                    System.out.println("izquierda: "+aux.getIzquierda().x+" "+aux.getIzquierda().y);
                    System.out.println("derecha: "+aux.getIzquierda().getDerecha().x+" "+aux.getIzquierda().getDerecha().y);
                    System.out.println("arriba: "+aux2.getArriba().x+" "+aux2.getArriba().y);}
                catch(Exception e){}}
                
                
                
            }}
       //     public static void main(String args[]) {
         //   generarPrimera();}
        
//}