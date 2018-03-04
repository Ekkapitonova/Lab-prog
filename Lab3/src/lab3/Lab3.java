/*
 1.	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы 
массива на экран сначала в строку, отделяя один элемент от другого пробелом, 
а затем в столбик (отделяя один элемент от другого началом новой строки). 
Перед созданием массива подумайте, какого он будет размера. 
 */
package lab3;

/**
 *
 * @author Екатерина
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int[] array=new int[10];
       int i = 0;
       int n = 2;
        while (i < 10) {
            array[i] = n;
            n +=2;
            i++;
        }
        for (i = 0; i < 10; i++)
        // Вывод значений в одну строку:
        System.out.print(array[i]+" ");
           
        // Вывод значений в один столбец:
        System.out.println();
        for (i = 0; i < 10; i++)   
            System.out.println(array[i]);
       
               }
        
       
    }


    

