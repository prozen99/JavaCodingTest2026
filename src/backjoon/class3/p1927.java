package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class p1927 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb=new StringBuilder();
        PriorityQueue<Integer> q=new PriorityQueue<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int t=Integer.parseInt(br.readLine());
            if(t==0 && !q.isEmpty()){
                sb.append(q.poll()).append("\n");//가장 앞에 있는 최솟값 뺴기
            }else if(t == 0){
                sb.append(0).append("\n");
            }else{
                q.offer(t);
            }
        }
        System.out.println(sb.toString());
    }
}
