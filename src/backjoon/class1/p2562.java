package backjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max=Integer.MIN_VALUE;
        int maxidx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxidx);

    }
}
