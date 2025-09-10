import java.util.*;
class Lab2p3{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		String x=sc.nextLine();
		String str = switch(x){
			case "++" ->"hello";
			case "--","=","-" ->"bye";
			default -> "sorry";
			};
		System.out.println(str);
	}
}
