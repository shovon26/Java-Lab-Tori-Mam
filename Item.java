/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author student
 */
public class Item {
     int id;
     String title;
    
    public Item(int id,String title)
    {
        this.id=id;
        this.title=title;
    }
    void print_element()
    {
        System.out.println("ID: "+id+"Title : "+title);
    }
}
