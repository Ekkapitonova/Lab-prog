/*
3.	Создать метод, который будет сортировать указанный массив по возрастанию
любым известным вам способом.
 */
package lab4;

import static lab4.number2.arr;
import static lab4.number2.method;


/**
 *
 * @author Екатерина
 */
public class number3 {
    
    public static int method(int a,int b){//задаем рандомные значения
           if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }   
    
    public static void arr(int[] array) {
        for(int i=0; i<10; i++) {
        System.out.print(array[i]+" ");
        }
    }
    

    
    public static void vozr(int[] a){
    for (int i = a.length - 1; i >= 1; i--) {
        boolean sorted = true;
    for (int j = 0; j < i; j++) {
        if (a[j] > a[j+1]) {
        int temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
        sorted = false;
        }
    }
    if(sorted) {
        break;
        }
    }
}
    
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i=0; i<10; i++){
            array1[i]=method(1,20);}
            arr(array1);    
            System.out.println();
            vozr(array1);
            arr(array1);  
            
    }
}
