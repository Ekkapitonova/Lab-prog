/*
1.	Создать класс «Треугольник» с полями длин сторон А, В и С, а также 
методами вычисления площади и периметра. Программа должна выдавать результаты 
работы методов по введенным с клавиатуры длинам сторон.
p.s. Совершенно случайно сделала не то задание!=((((
 */
package lab5;

import java.math.*;
import java.util.Scanner;

public class Lab5 {

    public static class Triangle {
    int x, y, z;
    double P;
    double S;
    void set(int a, int b, int c){
        x=a;
        y=b;
        z=c;
        Scanner sc = new Scanner(System.in); 
         System.out.print("Введите длину стороны a : ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          x = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
        System.out.print("Введите длину стороны b : ");
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                y = sc.nextInt();
        System.out.print("Введите длину стороны z : ");
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                z = sc.nextInt();
            }
           }
        }
    }
    
        double getP(){
            P = x + y + z;
            return P;
    }
        
        double getS(){
        int pp, proizv;
        pp= (int)P/2;
        proizv= pp*(pp-x)*(pp-y)*(pp-z);
        S=Math.sqrt(proizv);
        return S;
    }
}
    
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.set(1,2,3);
        
        System.out.println("Периметр: "+obj.getP());
        System.out.println("Площадь: "+obj.getS());
    }
}


