import java.util.*;
class p{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int n =sc.nextInt();
		int i=2;
		while(i<n){
			int c=1;
			int j=2;
			while(j<=i/2){
				if(i%j==0){
					c=0;
					break;
				}
				j++;
			}
		if(c==1){
			System.out.print(i+" ");
		}
		i++;
		}
	}
}
