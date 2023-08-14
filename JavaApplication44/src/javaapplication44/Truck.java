
package javaapplication44;

public class Truck extends Vehicle{
     private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        //If weight>2000,10% discount. Otherwise no discount on regularPrice
        if(weight>2000){
                double price = getRegularPrice()- getRegularPrice()*.10;
                return price;
        }
        else return super.getSalePrice();
        
         //To change body of generated methods, choose Tools | Templates.
    }
    
 

  
     
}
