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

