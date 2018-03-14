/*
 1.	Создайте в классе Circle метод, вычисляющий длину окружности
 */
package lab5;

import static java.lang.Math.*;
import java.util.Scanner;

public class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус
    
    public void dlinaCircle() {  
        double c;
       // r= 7.0;
    c= 2*PI*r;
    System.out.println("Длина окружности: "+c);
    }
    public void moveCircle(){
        x = Math.random()*198-99;
        y = Math.random()*198-99;    
    }
            
    public void dannieCircle(){//ввод данных
         Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
          System.out.print("Введите абсциссу центра : ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          x = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.print("Введите ординату центра : ");
          if(sc.hasNextInt()) { 
            y = sc.nextInt();
              System.out.print("Введите радиус окружности : ");
            if(sc.hasNextInt()) { 
              r = sc.nextInt();
              }
            }
        }
        
    }
    
     public double rCircle(Circle o2){
         r=Math.sqrt(Math.pow((x - o2.x), 2) + Math.pow((y - o2.y), 2));
         System.out.print("Расстояние между центрами окружностей: "+r);
        return r;
        
     }
     
     public void touchCircle(Circle o2){
          if (Math.abs(r - o2.r) == rCircle(o2))
                System.out.println("Окружности касаются друг друга");
            else
                System.out.println("Окружности не касаются друг друга");
         
     }
            
public static void main(String[] args) {
    Circle o1 = new Circle();
    Circle o2 = new Circle();
        o1.dannieCircle();
        o1.dlinaCircle();
        o1.rCircle(o2);
        o1.touchCircle(o2);
    }
    
}
