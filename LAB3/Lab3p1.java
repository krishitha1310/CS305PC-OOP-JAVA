import java.util.*;
class Lab3p1{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
			boolean prime=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					prime=false;
					break;	
				}
			}
		if(prime){
			System.out.print(i+" ");
			}
		}
	}
}
