package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=Integer.parseInt(str[i]);
        }
        for(int i=0;i<str.length;i++){
            int rank=1;
            for(int j=0;j<str.length;j++){
                if(scores[i]<scores[j]){
                    rank++;
                }
            }
            sb.append(rank);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
