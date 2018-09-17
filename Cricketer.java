/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Cricketer {
    
    public String country_name,address;
    
    public int[] run = new int[5];
    public int[] wkt=new int[5];
    public int jersey_num;
    
    public static int numOfPlayer;
    
    Cricketer()
    {
        System.out.println("This is players statistics");
        numOfPlayer++;
    }
    Cricketer(String cn,String add)
    {
        country_name=cn;
        address=add;
        numOfPlayer++;
    }
    
    public void get()
    {
        System.out.println("Players Country is : "+country_name);
        System.out.println("Players Address is : "+address);
    }
     
    Cricketer(int jersey)
    {
        jersey_num=jersey;
    }
    
    public void get1()
    {
        System.out.println("Players Jersey Number is : "+jersey_num);
    }
    
    public void calculation()
    {
        int avg1,avg2;
        Scanner input=new Scanner(System.in);
        int i,j;
        System.out.println("Enter players Run and wicket");
        for(i=0;i<5;i++)
        {
           run[i] =input.nextInt();
           wkt[i] = input.nextInt();
        }
        int s1=0,s2=0;
        for(i=0;i<5;i++)
        {
            s1+=run[i];
            s2+=wkt[i];
        }
        avg1=s1/5;
        avg2=s2/5;
        
        if(avg1>=70 && avg2>=5) System.out.println("Excellent");
        else if(avg1>=45 && avg2>=3) System.out.println("Good");
        else if(avg1>=25 && avg2>=1) System.out.println("Fair");
        else  System.out.println("Undefined");
    }
    
}










//Cricketer()
//    {
//        System.out.println("Hello World");
//    }
//    
//    public void set(String name,String add)
//    {
//        country_name = name;
//        address = add;
//    }
//    
//    public void get()
//    {
//        System.out.println("CountryName : "+country_name);
//        System.out.println("AddName : "+address);
//    }