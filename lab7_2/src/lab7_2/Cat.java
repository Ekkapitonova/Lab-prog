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
public class Cat extends pet{
    public static void main(String[] args){
    Cat ob = new Cat();
    ob.voice();
    }
  void voice(){
        System.out.println("Meow");
  }
}
