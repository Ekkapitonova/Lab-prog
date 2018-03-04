/*
 2.	Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном 
порядке (99 97 95 93 … 7 5 3 1).
 */
package lab3;

/**
 *
 * @author Екатерина
 */
public class number2 {
    public static void main(String[] args) {
       
       int[] array=new int[50];
       int i = 0;
       int n = 1;
       while (i < 50) {
            array[i] = n;
            n +=2;
            i++;
        }
       for (i = 0; i < 50; i++){
        // Вывод значений в одну строку:
        System.out.print(array[i]+" ");
        }
       System.out.println();
        for (int j = array.length - 1; j >= 0; j--) {
        System.out.println(array[j] + " ");// Выводим массив в строку задом на перед
        }
        System.out.println("");
    }
    
}
