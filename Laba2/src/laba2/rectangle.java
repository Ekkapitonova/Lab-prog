/*
 Рисуем прямоугольник Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок. 
Пример: m=2, n=4
8888
8888

 */
package laba2;

/**
 *
 * @author Екатерина
 */
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
       int m=0;
       int n=0;
       System.out.print("Введите целое число cтрок: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          m = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
        System.out.print("Введите целое число cтолбцов: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          n = sc.nextInt();
        }
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<n; j++)
                { 
                    System.out.print(8);
                }
                        System.out.println();
            }
        }
   }
}

