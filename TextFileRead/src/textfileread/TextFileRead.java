package textfileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileRead {

    public static void main(String[] args) throws FileNotFoundException {
        //  Scanner sc = new Scanner(System.file);
        File file = new File("D:\\JS\\hasan.txt");
        System.out.println(file.exists());

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print(" Lorem ipsum dolor sit amet, consectetur adipiscing elit Lorem. Fusce nunc mi");

        printWriter.close();
        Scanner output = new Scanner(file);

        String compare = "Lorem";
         String matchText = "";
         int count= 0;
        while(output.hasNext()){
           matchText = output.next();
           if(matchText.matches(compare)){
             //  System.out.println(matchText);
               for(int i=0; i<10; i++){
                   matchText +=output.next() + " ";
                   count++;
                   if(count==10){
                       System.out.println(matchText);
                       matchText= " ";
                   }
               }
           }
        }

    }

}
