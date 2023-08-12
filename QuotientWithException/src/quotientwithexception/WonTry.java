package quotientwithexception;

import java.util.Scanner;

public class WonTry {

    public static double division(int num1, int num2) {

        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter 2 int numbers: ");
        

        try {
            int num1 = sc.nextInt();
        int num2 = sc.nextInt();
            System.out.println(" Result of Division: " + division(num1, num2));
        } catch (Exception e) {
            System.out.println(" Divisor can not be Zero.");
        }
        // System.out.println(" Result of Division: "+division(num1, num2) );
    }
}




package javaapplication38;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaApplication38 {

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
