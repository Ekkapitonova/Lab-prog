/*
4.	Минимум двух чисел. Ввести с клавиатуры два числа, и вывести на экран 
минимальное из них (Поиск минимума выполняется в функции).
 */
package laba2;

/**
 *
 * @author Екатерина
 */
import java.util.Scanner;
public class min {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
       int m=0;
       int n=0;
       System.out.print("Введите первое целое число : ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          m = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
        System.out.print("Введите второе целое число : ");
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                n = sc.nextInt();
            }
            if (m<n){
                System.out.println("Минимальное число="+m);
        }
            else{
               
                 System.out.println("Минимальное число="+n);  
            }
        }
    }
}
