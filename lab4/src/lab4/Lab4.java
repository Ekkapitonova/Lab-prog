/*
1.	Создать статический метод, который будет иметь два целочисленных 
параметра a и b, и в качестве своего значения возвращать случайное целое число 
из отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и 
вывести его на экран.
 */
package lab4;

/**
 *
 * @author Екатерина
 */
public class Lab4 {

    public static int method(int a,int b){
           if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }   
    
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i=0; i<20; i++){
            array[i]=method(1,20);
            System.out.print(array[i]+" ");
                 
        }
    
    }
}
