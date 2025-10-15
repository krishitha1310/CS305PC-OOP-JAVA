/*Sample Input 0:
10
3
Sample Output 0:
3
Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException
Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero
Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lab5p1 {

    public static void main(String[] args) {
       try{
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/y);
       }
       catch(InputMismatchException ie){
            System.out.println(ie.getClass().getName());
       }
       catch(ArithmeticException ae){
            System.out.print(ae.getClass().getName()+": "+ae.getMessage());
       }
    }
}

