/*
 1.	Сравнить имена Ввести с клавиатуры два имени, и если имена одинаковые, 
вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – 
вывести сообщение – «Длины имен равны».
 */
package laba2;

/**
 *
 * @author Екатерина
 */
import java.util.Scanner;
public class name {public static void main(String[] args) {
      
       String name1, name2;
      
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
       System.out.println("Введите первое имя : ");
            name1 = sc.nextLine();
            System.out.println("Введите второе имя : ");
                 name2 = sc.nextLine();
           
            if (name1.equals(name2)) System.out.println("Имена идентичны"); 
else if (name1.length() == name2.length()) System.out.println("Длины имен равны"); 
else System.out.println("Имена разные");
    }
}


