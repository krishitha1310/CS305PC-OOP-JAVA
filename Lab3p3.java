//CONSTRUCTOR OVERLOADING
import java.util.*;
class Lab3p3{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		sc.nextLine();
		String q=sc.nextLine();
		Lab3p3 l=new Lab3p3();
		Lab3p3 l1=new Lab3p3(p);
		Lab3p3 l2=new Lab3p3(q);
		Lab3p3 l3=new Lab3p3(p,q);
	}
	Lab3p3(){
		System.out.println("Empty constructor");
	}
	Lab3p3(int a){
		System.out.println("Constructor with integer:"+a);
	}
	Lab3p3(String s){
		System.out.println("Constructor with string:"+s);
	}
	Lab3p3(int a,String s){
		System.out.println("Constructor with integer and string:"+a+s);		
	}
}
