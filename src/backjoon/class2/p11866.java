package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class p11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            dq.add(i);
        }
        sb.append("<");
        while(!dq.isEmpty()){
            for(int i=0;i<k-1;i++){
                dq.addLast(dq.pollFirst());
            }
            sb.append(dq.pollFirst());
            if(!dq.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());

    }
}
