package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<int[]> list=new ArrayList<>();
        String[] str=br.readLine().split(" ");
        for(int i=1;i<=n;i++){
            list.add(new int[]{i,Integer.parseInt(str[i-1])});//(사람번호 , 걸리는 시간 )
        }
        list.sort((a,b)->a[1]-b[1]);// 1 2 3 4 5 (비용 기준으로 쓰면 ) 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
        int sum=0;
        int prefixSum=0;
        for (int[] ints : list) {
            prefixSum+=ints[1];
            sum+=prefixSum;
        }
        System.out.println(sum);
    }
}
