package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        ArrayList<Integer> money=new ArrayList<>();
        for(int i=0;i<n;i++){
            money.add(Integer.parseInt(br.readLine()));
        }
        money.sort((a,b)->b-a);
        int sum=m;
        int count=0;
        for(int i=0;i<money.size();i++){
            int coin=money.get(i);
            if(sum/coin>0){//동전이 나눠질수 있을떄만 결국 1이됨
                count+=(sum/coin);
                sum=sum%coin;
            }
        }
        System.out.println(count);
    }
}
