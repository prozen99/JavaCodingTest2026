package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class p1764 {
    public static void main(String[] args) throws IOException {
        Set<String> listen=new HashSet<>();
        Set<String> bodo=new HashSet<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=(br.readLine().split(" "));
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        for(int i=0;i<n;i++){
            listen.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            bodo.add(br.readLine());
        }
        listen.retainAll(bodo);// 교집합 쓰는 부분 ArrayList로 초기화
        ArrayList<String> name_list=new ArrayList<>(listen);
        StringBuilder sb=new StringBuilder();
        sb.append(listen.size()).append("\n");
        name_list.sort((a,b)->a.compareTo(b));
        for(int i=0;i<name_list.size();i++){
            sb.append(name_list.get(i)).append("\n");
        }
        System.out.println(sb.toString());

    }
}
