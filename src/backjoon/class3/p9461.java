package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int c=Integer.parseInt(br.readLine());
            long[] dp = new long[c+1];
            if(c>=1) dp[1]=1;
            if(c>=2) dp[2]=1;
            if(c>=3) dp[3]=1;
            for(int j=4;j<=c;j++){
                dp[j]=dp[j-3]+dp[j-2];
            }
            sb.append(dp[c]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
