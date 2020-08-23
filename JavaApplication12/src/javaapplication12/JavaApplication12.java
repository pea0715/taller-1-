
package javaapplication12;

import  java.util.Scanner;

public class JavaApplication12 {


    public static void main(String[] args) 
    {
                Scanner teclado = new Scanner(System.in);
                
                int [] a  = { 1 , 3 , 4 , 5 , 6, 7 , 8, 9 };
                int  b  =  0 ;              
                int  reptificar;
                    
                System.out.println("ngrese el Número que desea Buscar:"); 
                reptificar = teclado.nextInt();
                
                
                hola rep = new hola();
                
                
                System.out.println("el nummero "  +  rep.comprovar(a , reptificar ,b  ));
                
               
      
        
        
    }
    
}
