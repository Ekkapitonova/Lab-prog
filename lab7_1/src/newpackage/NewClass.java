/*
 Написать два метода: print(int) и print(String).
 */
package newpackage;

/**
 *
 * @author Екатерина
 */
public class NewClass {
     public void print(int n){
        System.out.println(n);
    }
     
     public void print(String s){
        System.out.println(s);
    }
     
     public static void main(String[] args) {
         NewClass ob = new NewClass();
         int n=1;
         String s= "Hello World";
         ob.print(n);
         ob.print(s);
     }
}
