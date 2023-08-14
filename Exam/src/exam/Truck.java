
package exam;


public class Truck extends Vehicle{
    
    private double weight; 

    public Truck() {
    }

    public Truck(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double salesPrice() {
        if(weight>2000){
            double price = getRegularPrice() *.90;
            return price;
        }
        else   return super.salesPrice();
        
       //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
