
package exam;


public class Exam {

    
    public static void main(String[] args) {
       Truck truc = new Truck();
       truc.setRegularPrice(1000);
       truc.setWeight(2005);
       
        System.out.println(" Payable amount : "+ truc.salesPrice());
    }
    
}
