
package javaapplication9;

public class funcion {
     public boolean operacion(String sPalabra,int inc , int des){
        if (((des - inc)  == 1)||((des - inc ) == 2))  
        {
                 
                return true;
        }
        else if (sPalabra.charAt(inc)==sPalabra.charAt(des )){
            
               return operacion(sPalabra,inc+1,des-1);               
        }
        else
        {
           return false;  
        }  

    }
}     