/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         boolean bcount = true;
    do
     {
       System.out.println("enter the number");
         System.out.println("1.Domestic");
         System.out.println("2.Institutional");
         System.out.println("3.Commercial");  
         
         int choice =sc.nextInt();
         
         switch(choice){
             case 1:
                 System.out.println("Enter the Amount:");
                 float d =sc.nextFloat();
                 Domestic dom = new Domestic();
                 System.out.println(dom.generateElectricityBill(d));
                 break;
                 
             case 2:
                 System.out.println("Enter the Amount:");
                 float i =sc.nextFloat();
                 Institutional ins = new Institutional();
                 System.out.println(ins.generateElectricityBill(i));
                 break;
                 
             case 3:
                 System.out.println("Enter the Amount:");
                 float c =sc.nextFloat();
                 Commercial com = new Commercial();
                 System.out.println(com.generateElectricityBill(c));
                 break;
                 
         }
     }while(bcount);
     }
    
    
}
