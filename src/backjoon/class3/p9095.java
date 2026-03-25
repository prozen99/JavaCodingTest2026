package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int num=Integer.parseInt(br.readLine());
            int[] dp =new int[num+1];// dp[i]=  정수 i를 1,2,3의 합으로 나타내는 방법
            if(num>=1) dp[1]=1;
            if(num>=2) dp[2]=2;
            if(num>=3) dp[3]=4;
            for(int j=4;j<=num;j++){
                dp[j]=dp[j-1]+dp[j-2]+dp[j-3];//
            }
            sb.append(dp[num]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
