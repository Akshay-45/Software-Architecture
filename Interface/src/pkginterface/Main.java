/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.Scanner;
import static pkginterface.MyStack.max;

/**
 *
 * @author Student
 */
public class Main {
    
    public static void main(String[] args){
        
        int loop = 100;
        int i;
        Scanner s = new Scanner(System.in);
        MyStack Stack = new MyStack();
         boolean bcount = true;
       do{
        
            System.out.println("Enter the number what you want to execute" );
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            
            int choice = s.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter the elements");
                    int push = s.nextInt();
                    Stack.insert(push);
                    break;
                    
                case 2:
                    Stack.delete();
                    break;
                
                case 3:
                    int p = Stack.peek();
                    System.out.println();
                    break;
                    
                case 4:
                    Stack.display();
                    bcount=false;
                    break;
                    
                case 5:
                    break;
                    
                
                default : System.out.println("Invalid Choice");
                
            }
        }while(bcount);
    }
    }
    

