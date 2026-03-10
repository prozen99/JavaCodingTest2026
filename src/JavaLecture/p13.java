package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int prev=arr[0];
        sb.append(prev);
        sb.append(" ");
        for(int i=1;i<n;i++){
            int current=arr[i];
            if(prev<current){
                sb.append(current);
                sb.append(" ");
            }
            prev=current;
        }
        System.out.println(sb.toString());

    }
}
