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
public abstract class Bike implements Cloneable{
    public abstract String ReturnBike();     
    
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
    

