package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class p11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a) == Math.abs(b)) {
                return Integer.compare(a, b);
            }
            return Integer.compare(Math.abs(a), Math.abs(b));
        });
        for(int i=0;i<n;i++){
            int cmd=Integer.parseInt(br.readLine());
            if(cmd==0 && !pq.isEmpty()){
                sb.append(pq.poll()).append("\n");
            }else if(pq.isEmpty()&&cmd==0){
                sb.append(0).append("\n");
            }else{
                pq.offer(cmd);
            }
        }
        System.out.println(sb.toString());
    }
}
