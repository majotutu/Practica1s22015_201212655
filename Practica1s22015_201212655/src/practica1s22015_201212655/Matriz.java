/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MariaJose
 */
public class Matriz {
    public static Nodo_Matriz raiz;
    Tablero t;
    public static int contar1;
    public static int contar2;
    public static int cont;
    public static int coory=640;
    
    
    
        
        public Matriz(){
        raiz=null;
        contar1=640;
        cont=50;
        
        }
        
        
            public static void generarPrimera(){
                
                
              
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
                
                for(int x=1; x<4 ;x++){
                    
                    
                                    aux=new Nodo_Matriz(x,0,null,null,null,null,null,aux2);
                                    aux.setBounds(cont, contar1, 50, 50);
                                    System.out.println(cont);
                                    System.out.println(contar1);
                                    Tablero.ventana.add(aux);
                                    aux2.setDerecha(aux);                                    
                                    aux2=aux;  
                                    
                                    aux4=new Nodo_Matriz(x,1,null,null,null,aux2,null,uno);
                                    aux4.setBounds(cont, contar1-50, 50, 50);
                                    System.out.println(cont);
                                    System.out.println(contar1-50);
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
                contar1=contar1-50;
                
                
                
            }
            
            public static void InsertarColumna(){
                int contC=1;
                Nodo_Matriz helper=raiz;
                    while(helper.derecha!=null){
                        contC=contC+1;
                        helper=helper.getDerecha();}
                    
                    
                    Nodo_Matriz insercion=new Nodo_Matriz(contC,0,null,null,null,null,null,helper);
                    insercion.setBounds(cont, 640, 50, 50);
                    insercion.setVisible(true);
                    System.out.println(cont);
                    System.out.println(640);
                    Tablero.ventana.add(insercion);
                    helper.setDerecha(insercion);
                    helper=insercion;
                    llenarC(helper,contC);
                }
            
            public static void llenarC(Nodo_Matriz helper, int contC){
               int contF=0;
               
               Nodo_Matriz aux=raiz;
                while(aux.arriba!=null){
                    
                    contF=contF+1;
                    aux=aux.getArriba();}
                
                Nodo_Matriz Colu=new Nodo_Matriz(contC,contF,null,null,null,helper,null,aux);
                int cy=coory-(contF*50);
                Colu.setBounds(cont, cy, 50, 50);
                Tablero.ventana.add(Colu);
                System.out.println(cont);
                System.out.println(coory);
                aux.setDerecha(Colu);
                helper.setArriba(Colu);
                cont=cont+50;
                
                aux=Colu;
            
            }

   
}
       //     public static void main(String args[]) {
         //   generarPrimera();}
        
//}