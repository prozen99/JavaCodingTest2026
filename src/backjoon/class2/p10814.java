package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<String[]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] m = br.readLine().split(" ");
            list.add(new String[]{m[0],m[1]});
        }
        list.sort((a,b)->Integer.compare(Integer.parseInt(a[0]),Integer.parseInt(b[0])));
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
