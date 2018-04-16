/*
Написать два метода: print(int) и print(Integer).Написать такой код в методе 
main, 
чтобы вызвались они оба.
 */
package newpackage;

/**
 *
 * @author Екатерина
 */
public class NewClass2 {
    public void print(int n){    
         System.out.println(n);
    }
    
    public void print(Integer i){
         System.out.println(i);
    }
    
     public static void main(String[] args) {
         NewClass2 ob = new NewClass2();
         int n=1;
         Integer i= new Integer(2);
         ob.print(n);
         ob.print(i);
     }
}
