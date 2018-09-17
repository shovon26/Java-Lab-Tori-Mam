/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author Student
 */
public class CricketerDriver {
    
    public static void main(String[] args)
    {
        Cricketer c1=new Cricketer("Shakib","Dhaka");
        c1.get();
        
        Cricketer c2=new Cricketer(75);
        c2.get1();
        
         Cricketer c3=new Cricketer();
         c3.calculation();      
         
          System.out.println("number of players : "+ c1.numOfPlayer);

    }
}
