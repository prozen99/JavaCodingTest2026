package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Map<String, Integer> nameToNum = new HashMap<>();
        Map<Integer,String>  NumToName = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String temp=br.readLine();
            nameToNum.put(temp, i);
            NumToName.put(i,temp);
        }
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                int num = Integer.parseInt(query);
                sb.append(NumToName.get(num)).append("\n");
            } else {
                sb.append(nameToNum.get(query)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
