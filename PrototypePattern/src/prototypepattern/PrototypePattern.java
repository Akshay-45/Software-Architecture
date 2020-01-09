/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class PrototypePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scooter scooter = new Scooter();
        Sedan sedan = new Sedan();
        
        try {
            PrototypePatternGenerator prototypeGenerator = new PrototypePatternGenerator(sedan, scooter);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Runtime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
