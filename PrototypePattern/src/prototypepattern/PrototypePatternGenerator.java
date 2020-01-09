
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

/**
 *
 * @author student
 */
public class PrototypePatternGenerator {
    public PrototypePatternGenerator(Car prototypeCar, Bike prototypeBike) throws CloneNotSupportedException{        
        System.out.println("Car : " + prototypeCar.ReturnCar() + " : " + prototypeBike.ReturnBike());
        
        Car car = cloneCar(prototypeCar);
        Bike bike = cloneBike(prototypeBike);
        
        System.out.println("New Car : " + car.ReturnCar() + " New Bike : " + bike.ReturnBike());
    }
    
    private Car cloneCar(Car prototypeCar) throws CloneNotSupportedException {        
        return (Car) prototypeCar.Clone();
    }
    
    private Bike cloneBike(Bike prototypeBike) throws CloneNotSupportedException{
        return (Bike) prototypeBike.Clone();
    }
}
