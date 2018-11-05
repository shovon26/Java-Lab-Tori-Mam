/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

import java.util.Scanner;
/**
 *
 * @author student
 */
public class Driverclass {
    
     static Scanner input=new Scanner(System.in);
      public static void main(String[] args)
    {
//        Printed p=new Printed(12311,"JAVA book", 300);
//        p.print_element();
//        
//        Multimedia m=new Multimedia(12311,"Folk song", 2265);
//        m.print_element();
        
      
        int id,page;
        String title;
        Printed pitem[]=new Printed[4];
        for(int i=0;i<pitem.length;i++)
        {  
            System.out.println("Enter id,title,page");
            
            id=input.nextInt();
            title=input.next();
            page=input.nextInt();
            pitem[i]=new Printed(id,title,page);
        }
        
        for(int i=0;i<pitem.length;i++)
        {
            pitem[i].print_element();
            //char c=input.next().charAt(0);
        }
    }
}
