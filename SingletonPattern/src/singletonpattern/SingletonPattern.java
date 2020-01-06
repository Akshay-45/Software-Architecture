/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author student
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SBW instance = SBW.getInstance();
        instance.getSBWdetails();
        System.out.println("");
        System.out.println(SBW.getInstance().hashCode()+ " : " + SBW.getInstance().hashCode());
        System.out.println("");
        instance.getSBWdetails();
        
    }
    
}
