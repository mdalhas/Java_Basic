
package binaricode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinariCode {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        File file = new File("C:\\Users\\user\\Desktop\\myfile.txt");
      
      // System.out.println(file.exists() );
        Scanner sc = new Scanner(file);
        FileOutputStream outputStream = new FileOutputStream(file);
        
       int a=259;
           outputStream.write(a);
        
        FileInputStream inputStream = new FileInputStream(file);
       
             System.out.println(inputStream.read());
            
       
        
    }
    
}
