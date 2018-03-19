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
public class animal extends fish {
    
     
     public animal () {
     name="Акула";
     }
     
     public void get(){
        System.out.println("Животное: рыба, вид "+name);
     }
     
     public static void main(String[] args){ 
    animal name = new animal();
    name.get();
    }
}
