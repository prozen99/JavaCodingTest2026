package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            String[] s=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(str[j]);
            }
        }

    }
}
