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
public class SBW {
    
    private static SBW instance;
    
    private String name ="Swastik Bakery Works";
    private String address ="Margao";
    private String telephone_number ="08322254926";
    private String email ="akshaydhargalkar@gmail.com";
    
    private SBW(){
        
    }
    
    public static SBW getInstance(){
        if(instance==null)
            instance = new SBW();
        return instance;
    }
    
    public void getSBWdetails(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(telephone_number);
        System.out.println(email);
    }
}
