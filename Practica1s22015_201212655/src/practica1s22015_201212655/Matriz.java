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
    public static int coorx=50;
    
    
    
        
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
                    //System.out.println(cont);
                    //System.out.println(640);
                    Tablero.ventana.add(insercion);
                    helper.setDerecha(insercion);
                    helper=insercion;
                    llenarC(helper,contC);
                }
            
            public static void llenarC(Nodo_Matriz helper, int contC){
               int contF=0;
               
               Nodo_Matriz aux=raiz;
               Nodo_Matriz aux2=null;
               Nodo_Matriz aux3=null;
                while(aux.arriba!=null){
                    
                    contF=contF+1;
                    aux=aux.getArriba();}
                for(int x=1;x<contC;x++){
                    aux2=aux.getDerecha();
                    aux=aux2;
                    System.out.println(aux2.getAbajo().x+" "+aux2.getAbajo().y);
               
                System.out.println(aux2.getIzquierda().x+" "+aux2.getIzquierda().y);
                    System.out.println(x);}
                
                Nodo_Matriz Colu=new Nodo_Matriz(contC,contF,null,null,null,helper,null,aux);
                int cy=coory-(contF*50);
                Colu.setBounds(cont, cy, 50, 50);
                Tablero.ventana.add(Colu);
                
                //System.out.println(cont);
                //System.out.println(cy);
                aux.setDerecha(Colu);
                helper.setArriba(Colu);
                
                
                System.out.println(Colu.getAbajo().x+" "+Colu.getAbajo().y);

                System.out.println(Colu.getIzquierda().x+" "+Colu.getIzquierda().y);
               
                cont=cont+50;
                
                aux=Colu;
            
            }

   public static void InsertarFila(){
                int contFl=1;
                Nodo_Matriz helper=raiz;
                    while(helper.arriba!=null){
                        contFl=contFl+1;
                        helper=helper.getArriba();}
                    
                    
                    Nodo_Matriz insercion=new Nodo_Matriz(0,contFl,null,null,null,helper,null,null);
                    contar1=contar1-50;
                    insercion.setBounds(0, contar1, 50, 50);
                    
                    insercion.setVisible(true);
                    System.out.println(0);
                    System.out.println(contar1);
                    Tablero.ventana.add(insercion);
                    helper.setArriba(insercion);
                    helper=insercion;
                    llenarF(helper,contFl);
                }
            
            public static void llenarF(Nodo_Matriz helper, int contFl){
               int contC1=0;
               
               Nodo_Matriz aux=raiz;
               Nodo_Matriz aux2=raiz;
               Nodo_Matriz aux3=null;
               int contadorff=50;
                while(aux2.derecha!=null){
                    System.out.println(contC1);
                    contC1=contC1+1;
                    aux2=aux2.getDerecha();
                    
                }
                contC1=contC1+1;
                int x=1;
                while(x!=contC1){
                   
                    aux=aux.getDerecha();
                        while(aux.arriba!=null){                            
                            aux=aux.getArriba();}
                    System.out.println("esta abajo "+aux.x+" "+aux.y);
                    System.out.println("va por "+x+" "+contFl);
                    Nodo_Matriz Filas=new Nodo_Matriz(x,contFl,null,null,null,aux,null,helper);
                    Filas.setBounds(contadorff, contar1, 50, 50);
                    contadorff=contadorff+50;
                    Tablero.ventana.add(Filas);
                    helper.setDerecha(Filas);
                    aux.setArriba(Filas);
                    helper=Filas;
                    System.out.println(helper.getAbajo().x+" "+helper.getAbajo().y);
               
                System.out.println(helper.getIzquierda().x+" "+helper.getIzquierda().y);
                    System.out.println(x);
                x++;}
                

               
                //cont=cont+50;
                
                //aux=Colu;
            
            }
}
       //     public static void main(String args[]) {
         //   generarPrimera();}
        
//}