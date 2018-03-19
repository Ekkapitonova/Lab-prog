/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Екатерина
 */
     public class Pegas extends Horse{
             public void fly(){
            }
     public Pegas(String name) { 
        super(name);
    }
                
     public static void main(String[] args){ 
    Pegas name = new Pegas("Lucie");
        name.fly(); 
    }
}