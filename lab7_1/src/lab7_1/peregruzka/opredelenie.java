/*
 * 2.	Написать метод, который определяет, объект какого класса ему передали, 
и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
package lab7_1.peregruzka;

/**
 *
 * @author Екатерина
 */
public class opredelenie {
    
    void method(cat obj) {
        System.out.println("Кошка");
    }
    
    void method(dog obj) { 
        System.out.println("Собака"); 
    }

     void method(bird obj) {
        System.out.println("Птица");
    }
    void method(lamp obj) { 
        System.out.println("Лампа"); 
    }
}

