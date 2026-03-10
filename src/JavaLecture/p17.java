package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int k){
        if(k<2) return false;
        if(k==2) return true;
        for(int i=2;i*i<=k;i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
}
