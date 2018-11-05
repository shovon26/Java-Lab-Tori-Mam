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
public class Multimedia extends Item {
    int length;
    public Multimedia(int id,String title,int length)
    {
        super(id,title);
        this.length=length;
    }
    
      void print_element()
    {
        System.out.println("ID: "+id+"Title : "+title);

        System.out.println("Length : "+length);
    }
}
