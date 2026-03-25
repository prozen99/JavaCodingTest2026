package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] s1=br.readLine().split(" ");
        for(int i=0;i<s1.length;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        int m=Integer.parseInt(br.readLine());
        int[] target=new int[m];
        String[] s2=br.readLine().split(" ");
        for(int i=0;i<m;i++){
            target[i]=Integer.parseInt(s2[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            int count=upperBound(arr,target[i])-lowerBound(arr,target[i]);
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString());


    }

    private static int lowerBound(int[] arr, int target) {
        int min=0;
        int max=arr.length;
        while(min<max){
            int middle=(min+max)/2;
            if(arr[middle]>=target){
                max=middle;
            }else{
                min=middle+1;
            }
        }
        return min;
    }

    private static int upperBound(int[] arr, int target) {
        int min=0;
        int max=arr.length;
        while(min<max){
            int middle=(min+max)/2;
            if(arr[middle]>target){
                max=middle;
            }else{
                min=middle+1;
            }
        }
        return min;
    }
}
