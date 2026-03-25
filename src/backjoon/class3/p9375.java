package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        Map<String,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<t;i++){
            int num=Integer.parseInt(br.readLine());
            for(int j=0;j<num;j++){
                String[] clothing=br.readLine().split(" ");
                map.put(clothing[1],map.getOrDefault(clothing[1],0)+1);
            }
            int sum=1;
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                sum=sum*(entry.getValue()+1);
            }
            sb.append(sum-1).append("\n");
            map=new HashMap<>();
        }


        System.out.println(sb.toString());
    }
}
