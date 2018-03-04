/*
 4.	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных 
целых чисел из отрезка [10;99]. Вывести массив на экран.
 */
package lab3;

/**
 *
 * @author Екатерина
 */
public class number4 {
    public static void main(String[] args) {
        int[][] array=new int[8][5];
        int i,j;
        for(i=0; i<8; i++){
            for(j=0; j<5; j++){
                array[i][j] = (int) Math.round(Math.random() * 90+10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
