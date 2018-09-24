/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author student
 */
public class BankAccount {
    
    private String accID;
    private double balance;
    public String Accname;
   static double rateofinterest=0.7;

    BankAccount(String name,double bal,String id)
    {
        accID=id;
        balance=bal;
        Accname=name;
    }
    
    BankAccount(String s,String ii)
    {
        Accname=s;
        accID=ii;
    }
    
    public String getname()
    {
        return Accname;
    }
    
    public String getID()
    {
        return accID;
    }
    
    public double getbalance()
    {
        return balance;
    }
    
   public void credit(double amt)
   {
       balance+=amt;  
       System.out.println("Account after Credit : "+balance);
   }
   
   public void debit(double amt)
   {
       if(amt<balance)   {
           
           balance-=amt;
           System.out.println("Account after debit : "+balance);
       }
       
       else System.out.println("There is no enough money in account");
   }
   
   public void Transfer_to(BankAccount obj,  double amount)
   { 
       debit(amount);
       obj.credit(amount);
   }
    public double addInterest()
    {
        balance+=balance*rateofinterest;
        
        return balance;
    }
}
