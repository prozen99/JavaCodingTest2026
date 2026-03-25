package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] dp=new int[n+1];// dp[i]는 i를 1로 만드는 최소 연산 횟수
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+1;//연산 횟수니까 기본적으로 무슨짓을 하던 1번추가
            if(i%2==0){
                dp[i]=Math.min(dp[i],dp[i/2]+1);
            }if(i%3==0){
                dp[i]=Math.min(dp[i],dp[i/3]+1);
            }
        }
        System.out.println(dp[n]);

    }
}
