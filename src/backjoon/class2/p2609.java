package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        System.out.println(gcd(n,m)+" "+lcm(n,m));
    }
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
