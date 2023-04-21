package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Dealership 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        //Instantiate a car model
        car myCar = new car("Ford", "Mustang", 2019, 25000.00, "Red", "1FABP40E7KF123456", "ABC123", "John Doe", "123 Main St", "336-555-1234", "jdoe@mai.com");
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getPrice());
        System.out.println(myCar.getColor());
    
        //Instantiate a car model with default constructor
        car myCar2 = new car();
        //Print out the car model with toString
        System.out.println(myCar2.toString());
        //Instantitate a arraylist of cars
        ArrayList<car> carList = new ArrayList<car>();
        //A loop that instantiates at least five objects and adds them (with the first object) to the array or ArrayList
        for (int i = 0; i < 5; i++) {
            carList.add(new car());
        }
        //A loop that prints out the toString of each object in the array or ArrayList
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).toString());
        }
        

        
     
    }
}

