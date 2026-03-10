package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int[] arr=new int[n];
        StringBuilder result=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(str[i]);
            String s=sb.reverse().toString();
            arr[i]=Integer.parseInt(s);
            if(isPrime(arr[i])){
                result.append(arr[i]);
                result.append(" ");
            }
        }
        System.out.println(result.toString());

    }
    public static boolean isPrime(int k){
        if(k<2) return false;
        for(int i=2;i*i<=k;i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
}
