
package binaricode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;




public class StringToBinary {
    
    public static void main(String[] args) throws IOException  {
        int [] numbers = {10,20,10,20,50};
        String [] greetings= {"Hello","hi","Welcome"};
       
        
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream = new FileOutputStream("E:\\GitHub\\Evedance\\Java_Basic\\BinariCode\\test.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringToBinary.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        int [] newNumber;
        newNumber = (int[]) InputStream.readObject();
        String [] newGretting = (String[] ) InputStream.readObject();
        
        System.out.println(Arrays.toString(newNumber));
        System.out.println(Arrays.toString(newNumber));
        
        //else System.out.println(file.exists());
        
//        try {
//            FileInputStream fileInputStream = new FileInputStream("test.dat");
//        } catch (Exception e) {
//            e.printStackTrace();
//            
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }



//    throws java.io.IOException{
//    
//    try(java.io.IOException){
//    
//    }}


    
    }
}
