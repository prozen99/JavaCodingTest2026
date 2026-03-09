package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char[] c=str.toCharArray();
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(!set.contains(c[i])){
                set.add(c[i]);
                sb.append(c[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
