/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author Екатерина
 */
public class dog extends pet{
    
    private String name;
     public dog(String name) 
    {
    this.name=name;
        weight=25; 
        sex= "woman"; 
        age=8; 
    }
     
     public void get(){
        
        System.out.println("Собака: "+name +" Вес: "+weight +", пол: "+sex +", возраст: "+age);
     }
     
     public static void main(String[] args){ 
    dog name = new dog("Alexa");
    
    name.get();
    }
}
