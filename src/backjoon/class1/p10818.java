package backjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        String[] str=br.readLine().split(" ");
        for(int i=0;i<str.length;i++){
            list.add(Integer.parseInt(str[i]));
        }
        System.out.print(String.valueOf(Collections.min(list))+" "+String.valueOf(Collections.max(list)));
    }
}
