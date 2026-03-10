package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] a=br.readLine().split(" ");
        String[] b=br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Integer.parseInt(a[i])==1&& Integer.parseInt(b[i])==1){
                sb.append("D");
                sb.append("\n");
            }
            if(Integer.parseInt(a[i])==1&& Integer.parseInt(b[i])==2){
                sb.append("B");
                sb.append("\n");
            }
            if(Integer.parseInt(a[i])==1 && Integer.parseInt(b[i])==3){
                sb.append("A");
                sb.append("\n");

            }
            if(Integer.parseInt(a[i])==2&& Integer.parseInt(b[i])==1){
                sb.append("A");
                sb.append("\n");

            }
            if(Integer.parseInt(a[i])==2&& Integer.parseInt(b[i])==2){
                sb.append("D");
                sb.append("\n");

            }
            if(Integer.parseInt(a[i])==2&& Integer.parseInt(b[i])==3){
                sb.append("B");
                sb.append("\n");

            }
            if(Integer.parseInt(a[i])==3&& Integer.parseInt(b[i])==1){
                sb.append("B");
                sb.append("\n");

            }
            if(Integer.parseInt(a[i])==3&& Integer.parseInt(b[i])==2){
                sb.append("A");
                sb.append("\n");

            }
            if(Integer.parseInt(a[i])==3&& Integer.parseInt(b[i])==3){
                sb.append("D");
                sb.append("\n");

            }
        }
        System.out.println(sb.toString());
    }
}
