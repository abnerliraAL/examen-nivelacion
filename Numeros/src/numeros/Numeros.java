/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author usuario 1
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        
        int limite =0;
       
       
       System.out.println("ingrese el numero limite");
       limite=leer.nextInt();
            
       for(int i=0;i<limite;i++)
       {
    if(i%2==1){//4%2=0 3%2=1s
        System.out.println("el numero"+i+" es par");
    }
    System.out.println("el numero"+i+" es impar");
       }
       
    
       
}
}