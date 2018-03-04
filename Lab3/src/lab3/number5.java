/*
 5.	Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных 
целых чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на 
экран индекс строки с наибольшим по модулю произведением элементов. Если таких 
строк несколько, то вывести индекс первой встретившейся из них.
 */
package lab3;

import static java.lang.Math.abs;
import static java.lang.Math.random;


public class number5 {
    public static void main(String args[]) {
        
        int[][] array = new int[7][4];
        
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 4; j++) 
                array[i][j] = (int)(random()*11 - 5);
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+" ");
                
            }
            System.out.println();
        }
        
        int max_index = -1, max_product = -1;
        for (int i = 0; i < 7; i++) {
            
            int product = 1;
            for (int j = 0; j < 4; j++)
                product *= array[i][j];
            
          
            
            if (max_product < abs(product)) {
                max_product = abs(product);
                max_index = i;
            }
        }
        System.out.println("Индекс: " + max_index);
        
    }
}


