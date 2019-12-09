/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MyStack implements MyInterface {
    
    static int max =10;
    int stack[];
    int stacktop;
    int index = 0;
    
    public boolean isEmpty(){
        return(stacktop < 0);
    }
    
    public boolean isFull(){
        return(stacktop > max-1);
    }
    
    MyStack(){
        
        this.stack = new int[10];
        stacktop = -1;
        
    }

    @Override
    public void insert(int i) {
        stack[++stacktop] = i;
        System.out.println("Pushed into Stack");
        
    }

    @Override
    public int delete() {
        int i = stack[stacktop--];
        return i;
    }

    @Override
    public int peek() {
        int i = stack[stacktop];
        return i;
    }

    @Override
    public void display() {
        int j;
        for(j=0;j<=stacktop;j++){
       System.out.println(stack[j] + "");
        }
    }
    
    
}
