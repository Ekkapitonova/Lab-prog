/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2;

/**
 *
 * @author Екатерина
 */
public class Dog extends pet {
    public static void main(String[] args){
    Dog ob = new Dog();
    ob.voice();
    }
  void voice(){
        System.out.println("Gaw");
  }
}
