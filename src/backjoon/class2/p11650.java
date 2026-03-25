package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] t=br.readLine().split(" ");
            int x=Integer.parseInt(t[0]);
            int y=Integer.parseInt(t[1]);
            list.add(new int[]{x,y});
        }
        list.sort((a,b)->a[0]==b[0] ? Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));
        // 참고: String 정렬이면 list.sort((a, b) -> a.compareTo(b));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)[0]);
            sb.append(" ");
            sb.append(list.get(i)[1]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
