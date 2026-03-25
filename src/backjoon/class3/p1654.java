package backjoon.class3;

import java.io.*;

public class p1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first=br.readLine().split(" ");
        int k=Integer.parseInt(first[0]);
        int n=Integer.parseInt(first[1]);
        long[] arr=new long[k];
        long max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            arr[i]=Long.parseLong(br.readLine());
            if(max<arr[i]){
                max=arr[i];
            }
        }
        long left=1;
        long right=max;
        long answer=0; // 정답
        while(left<=right){
            long mid=(left+right)/2;

            long count=0;
            for(int i=0;i<k;i++){
                count+=arr[i]/mid;
            }

            if(count>=n){
                answer=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }




        System.out.println(answer);
    }
}
