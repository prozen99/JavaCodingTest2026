package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        String[] str=br.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
            if(is_prime(arr[i])){
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean is_prime(int k){
        boolean check=true;
        if(k<2) return false;
        for(int i=2;i*i<=k;i++){
            if(k%i==0){
                check=false;
                return false;
            }
        }
        return true;
    }
}
