
package javaapplication52;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;




public class JavaApplication52 {

  
    public static void main(String[] args) {
       int [] numbers = {10,20,10,20,50};
        String [] greetings= {"Hello","hi","Welcome"};
        
        try {
            FileOutputStream fileOut  = new FileOutputStream("C:\\Users\\user\\Desktop\\fdfr.dat");
            ObjectOutput objectOutput = new ObjectOutputStream(fileOut);
            
            objectOutput.writeObject(numbers);
            objectOutput.writeObject(greetings);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication52.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication52.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\fdfr.dat");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            
             int [] newNumbers = (int[]) objectInputStream.readObject();
        String [] newGreetings= (String[]) objectInputStream.readObject();
        
            System.out.println(Arrays.toString(newNumbers));
            System.out.println(Arrays.toString(newGreetings));
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication52.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication52.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication52.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
        
    }
    
}
