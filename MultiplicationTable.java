/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author kendrabooker
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=1; i<=9; i++ ){
        
            System.out.println("\n" + "Multiples of " + i);
            for(int j=0; j<=12; j++){
            
                System.out.println(i + " * " + j + " = " + (j * i) );
            }
        }
        
    }
    
}
