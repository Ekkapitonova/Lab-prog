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
public class catprivate {
     private String name;
     private int weight=5; 
     private String sex="man"; 
     private int age=6; 
    
     private void get(){
        System.out.println("Кот: "+name +" Вес: "+weight +", пол: "+sex +", возраст: "+age);
     }
     
     public void setName(String n) { name = n;}
     public void setWeight(int i) { weight = i;}
     public void setSex(String s) { sex = s;}
     public void setAge(int j) { age = j;}
        
     public static void main(String[] args){ 
    cat name = new cat("Marti");
    name.get();
    } 
}