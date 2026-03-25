package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class p25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer> list1=new ArrayList<>();
        String[] str1=br.readLine().split(" ");
        int m=Integer.parseInt(br.readLine());
        String[] str2=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            list1.add(Integer.parseInt(str1[i]));
        }

        for(int i=0;i<m;i++){
            list1.add(Integer.parseInt(str2[i]));
        }
        list1.sort(null);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list1.size();i++){
            sb.append(list1.get(i));
            sb.append(" ");
        }
        System.out.println(sb.toString());



    }
}
