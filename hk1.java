import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x=1;
            int sum=a;
            for(int k=1;k<=n;k++){
                sum+=x*b;
                System.out.print(sum+" ");  
                x*=2;
            }    
            System.out.println();
        }
        in.close();
    
}
}
