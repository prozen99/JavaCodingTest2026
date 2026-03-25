package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        StringBuilder sb=new StringBuilder();
        for(int i=n;i<=m;i++){
            if(is_Prime(i)){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());

    }
    static boolean is_Prime(int p){
        if(p<2) return false;
        for(int i=2;i*i<=p;i++){
            if(p%i==0) return false;
        }
        return true;
    }
}
