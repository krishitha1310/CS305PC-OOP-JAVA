import java.util.*;
class Lab2p1{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		System.out.println("Enter the operator");
		sc.nextLine();
		
		String k = sc.nextLine();
		System.out.println(k);
		switch(k){
			case "++":
				System.out.println("pre:"+(++x));
				System.out.println("post:"+(x++));
				break;
			case "--":
				System.out.println("pre:"+(--x));
				System.out.println("post:"+(x--));
				break;
			case "+":
				System.out.println(+x);
				break;
			case "-":
				System.out.println(-x);
				break;
			case "~":
				System.out.println(~x);
				break;
			default:
				System.out.println("You have entered the wrong operator");
				
		}
	}
}
