
package exam;


public class Vehicle {
   private  int regularPrice;
   private double waight; 

    public Vehicle() {
    }

    public Vehicle(int regularPrice, double waight) {
        this.regularPrice = regularPrice;
        this.waight = waight;
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getWaight() {
        return waight;
    }

    public void setWaight(double waight) {
        this.waight = waight;
    }
   
    public double salesPrice(){
        
     return regularPrice;
    }
   
}
