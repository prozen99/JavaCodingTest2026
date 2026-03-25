package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class p1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(br.readLine());

        }
        ArrayList<String> list=new ArrayList<>(set);
        list.sort((a,b)->a.length()==b.length() ? a.compareTo(b):a.length()-b.length());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
