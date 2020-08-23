package javaapplication9;
import java.util.Scanner;
public class JavaApplication9 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        funcion opercion1 = new funcion();
        entrada = new Scanner(System.in);
        String sPalabra; 
        System.out.print("ingrese palabra :  "); 
        sPalabra= entrada.nextLine();
        int inc = 0;
        int des = sPalabra.length()-1;
        System.out.println(opercion1.operacion(sPalabra,inc ,des )); 
       
     
        
    }
   
            
    
}

