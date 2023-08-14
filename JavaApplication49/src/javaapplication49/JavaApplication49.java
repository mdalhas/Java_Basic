
package javaapplication49;

import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaApplication49 {

  
    public static void main(String[] args) throws FileNotFoundException {
        File file;
        file = new File("C:\\Users\\user\\Destop\\Fileread.txt");
        Scanner read = new Scanner(file);
        
        
        if (file.exists()){
            
         String tenWord = " ";
        int count=0;
            while (read.hasNext()) {
                String word = read.next();
                
               // System.out.println(word);
                tenWord += tenWord+ " ";
                count++;
                
                if(count==10){
                    System.out.println(tenWord);
                    count=0;
                    tenWord = " "; 
                }
                
            }
        } else {
            System.out.println("File is empty");
        }
        
        
        
        read.close();


    }
    
}
