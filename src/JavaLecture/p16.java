package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] fibo = new int[n+1];
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3;i<=n;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(fibo[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
