/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1.peregruzka;

/**
 *
 * @author Екатерина
 */
public class opr_met {
     public static void main(String[] args) {
         opredelenie ob = new opredelenie();
         cat cat = new cat();
         dog dog = new dog();
         bird bird = new bird();
         lamp lamp = new lamp();
         ob.method(cat);
         ob.method(dog);
         ob.method(bird);
         ob.method(lamp);
     }
}
