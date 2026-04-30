package supersubclass;

import supersubclass.vehicle.Truck;

public class SuperSubClass {

    public static void main(String[] args) {

        Truck t = new Truck();
        t.setWeight(3000);
        t.setRegularPrice(1500);
        
        
        System.out.println( t.getSalePrice() );
    }

}
