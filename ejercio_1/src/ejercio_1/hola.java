/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_1;

/**
 *
 * @author pablo
 */
public class hola {
     public static String mensaje(int n ,int i )
    {
        if (i<n)
        {
            System.out.print(tribonaci(i) + " " );
            return mensaje(n,(i+1));
            
        }
        else
            return"";
    }
   
    public static int tribonaci(int n){
        if ( n == 0 )
        {
            return 0 ; 
        }
        else if (n == 1 )
        {
            return 0 ;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
           return tribonaci(n-1) + tribonaci(n-2) + tribonaci(n-3);
        }

    }
}  
