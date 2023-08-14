/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrrayevidance;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrrayEvidance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
    int [] myArray = new int [10];
    for(int i=0; i<myArray.length; i++){
        myArray [i]= (int) (Math.random()*100);
        System.out.print("i,"+i+"="+myArray [i]+" ");
    }
        System.out.println("");
        System.out.println("Enter index number");
        int num= sc.nextInt();
        
        try {
            int value = myArray[num];
            System.out.println("i,"+num+"="+ value);
            
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        
        
        
// TODO code application logic here
    }
    
}
