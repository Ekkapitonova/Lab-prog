/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Екатерина
 */
public class human extends ape {
    public human () {
     name="горилла";
     }
    
      public void get(){
        System.out.println("Человек произошел от обезьяны вида:"+name);
     }
      
      public static void main(String[] args){ 
    human name = new human();
    name.get();
    }
}
