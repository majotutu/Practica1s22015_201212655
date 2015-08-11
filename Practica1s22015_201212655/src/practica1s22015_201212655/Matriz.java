/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212655;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author MariaJose
 */
public class Matriz {
    public static Nodo_Matriz raiz;
    public static int ancho;
    public static int largo;
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
        ancho=4;
        largo=2;
        
        }
        
        public static void Graficas(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            
            fichero = new FileWriter("Matriz.txt");
            pw = new PrintWriter(fichero);
            pw.println("digraph G");
            pw.println("{");
            //pw.println("Matriz;");
            
          //System.out.println(ObtenerImagen(0,0));
                            for(int x=0;x<ancho;x++){
                                                        for(int y=0;y<largo;y++){
                                                                                    String tener=ObtenerImagen(x,y);
                                                                                    System.out.println(ancho);
                                                                                    System.out.println(largo);
                                                                                    System.out.println(x+"  "+y);
                                                                                    pw.println(tener+";");
                                                        System.out.println(tener);}
                                                                                    
                    }
                            for(int x=0;x<ancho-1;x++){
                                                        for(int y=0;y<largo;y++){
                                                                                    String tener=ObtenerImagen(x,y);
                                                                                    pw.println(ObtenerImagen(x,y)+" -> "+ObtenerImagen(x+1,y)+";");
                                                                                    pw.println(ObtenerImagen(x+1,y)+" -> "+ObtenerImagen(x,y)+";");
                                                                                    
                                                                                    
                                                                                    }
                                                                                    
                    }
                            
                           
      
          pw.println("}");      
                
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        generar("Matriz");
        }
        public static void generar(String LaRuta){
       
try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

//path del archivo creado con el codigo del graphviz que queremos

String fileInputPath = LaRuta+".txt";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = LaRuta+".jpg";

//tipo de imagen de salida, en este caso es jpg

String tParam = "-Tjpg";

String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

String[] cmd = new String[5];
cmd[0] = dotPath;
cmd[1] = tParam;
cmd[2] = fileInputPath;
cmd[3] = tOParam;
cmd[4] = fileOutputPath;

//Invocamos nuestra clase 

Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola

rt.exec( cmd );

} catch (Exception ex) {
ex.printStackTrace();
}  finally {
}
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
                    ancho=ancho+1;
                    
                    
                    Nodo_Matriz insercion=new Nodo_Matriz(contC,0,null,null,null,null,null,helper);
                    insercion.setBounds(contC*50, 640, 50, 50);
                    insercion.setVisible(true);
                    //System.out.println(cont);
                    //System.out.println(640);
                    Tablero.ventana.add(insercion);
                    helper.setDerecha(insercion);
                    helper=insercion;
                    llenarC(helper,contC);
                }
            public static String ObtenerImagen(int x, int y){
            
                Nodo_Matriz busca=raiz;
                int f=0;
                int g=0;
               if(y==0&&x==0){
                   busca=raiz;
               }
               else if(y==0 && x!=0){
                   int r=0;         
                                    while(r!=x){
                                                r++;
                                                busca=busca.getDerecha();}
                                        }
               else if(x==0 && y!=0){
                    int w=0;
                                    while(w!=y){
                                                w++;
                                                busca=busca.getArriba();}}
               else{
                if(ancho>x){
                    while(f!=x){
                                f++;
                                busca=busca.getDerecha();
                                }
                
                }
                else{}
                if(largo>y){
                    while(g!=y){
                                g++;
                                busca=busca.getArriba();
                                }
                
                }
                else{}
               }
              if(busca.nombre==null){
              return "vacio"+x+y;}
              else{
                return busca.nombre.toString();}

            }
            public static void llenarC(Nodo_Matriz helper, int contC){
               int contF1=1;
               
               Nodo_Matriz aux=raiz;
               Nodo_Matriz aux2=raiz;
               Nodo_Matriz aux3=null;
               int contadorff=50;
                while(aux2.arriba!=null){
                    System.out.println(contF1);
                    contF1=contF1+1;
                    aux2=aux2.getArriba();
                    
                }
                //contF1=contF1+1;
                int x=1;
                while(x!=contF1){
                   
                    aux=aux.getArriba();
                        while(aux.derecha!=null){                            
                            aux=aux.getDerecha();}
                    System.out.println("esta izquierda "+aux.x+" "+aux.y);
                    System.out.println("va por "+contC+" "+x);
                    Nodo_Matriz Filas=new Nodo_Matriz(contC,x,null,null,null,helper,null,aux);
                    int coo=50;
                    Filas.setBounds(contC*50, 640-(x*50), 50, 50);
                   
                    Tablero.ventana.add(Filas);
                    helper.setArriba(Filas);
                    aux.setDerecha(Filas);
                    helper=Filas;
                    System.out.println(helper.getAbajo().x+" "+helper.getAbajo().y);
               
                System.out.println(helper.getIzquierda().x+" "+helper.getIzquierda().y);
                    System.out.println(x);
                x++;}
                

               
                //cont=cont+50;
                
                //aux=Colu;
            
            }
            

   public static void InsertarFila(){
                int contFl=1;
                Nodo_Matriz helper=raiz;
                    while(helper.arriba!=null){
                        contFl=contFl+1;
                        helper=helper.getArriba();}
                    largo=largo+1;                    
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