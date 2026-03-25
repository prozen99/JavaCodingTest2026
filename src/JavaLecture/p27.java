package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        String[] s=br.readLine().split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            max=sum;
        }
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);

    }
}
