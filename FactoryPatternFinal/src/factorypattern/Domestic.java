/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author student
 */
public class Domestic implements ElectricityBill{

    @Override
    public float generateElectricityBill(float a) {
        
        return (3.50f * a);
        
    }
    
}
