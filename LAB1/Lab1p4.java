import  java.util.Scanner;
class Lab1p4{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("enter the number1");
			int a=sc.nextInt();
			System.out.println("enter the number2");
			int b=sc.nextInt();
			var c=a/b;
			System.out.println("a/b="+c);
		}catch(Exception e){
			System.out.println(e.getClass());
		}
		
	}
}
