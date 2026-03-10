package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;// max ( 현재 탐색한 학생중 가장 키가 큰 사람의 키 )
            }
        }
        System.out.println(count);

    }
}
