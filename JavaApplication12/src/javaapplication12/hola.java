/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author pablo
 */
public class hola {
    public boolean comprovar(int[] a , int reptificar , int i){   
        if (i < a.length )
        {
            return false;
        }
        else if (a[i] == reptificar )
        {
            return true;
        }
        else
        {
             
            return comprovar( a , reptificar , i+1); 
    
        }
    }

    
}
