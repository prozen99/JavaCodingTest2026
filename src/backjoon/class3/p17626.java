package backjoon.class3;

import java.util.Scanner;

public class p17626 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] dp=new int[n+1];
        //라그랑주 최소
        for(int i=1;i<=n;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        System.out.println(dp[n]);
    }
}
