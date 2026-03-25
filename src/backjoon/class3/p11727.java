package backjoon.class3;

import java.io.BufferedReader;
import java.util.Scanner;

public class p11727 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] dp=new int[n+1];
        if(n>=1) dp[1]=1;
        if(n>=2) dp[2]=3;
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-1]+2*dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }
}
