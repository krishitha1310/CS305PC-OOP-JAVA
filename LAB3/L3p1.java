import java.util.*;
class p1{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int i=2;
		System.out.print("Enter a number");
		int n=sc.nextInt();
		do{
			int j=2,c=0;
			do{
				if(i==2){
					c++;
					continue;
				}
				if(i%j==0){
						c=0;
						break;
				}
				else{
					c++;
					j++;
				}
			}
			while(j<=i/2);
				if(c>0){
					System.out.print(i+" ");
			}
			i++;
		}
		while(i<n);
	}
}
