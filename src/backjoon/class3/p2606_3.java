package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class p2606_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph=new ArrayList[computer+1];
        boolean[] visited=new boolean[computer+1];
        for(int i=1;i<=computer;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            String[] str=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(1);
        visited[1]=true;
        int count=0;
        while(!queue.isEmpty()){
            int now=queue.poll();
            for(int next:graph[now]){
                if(!visited[next]){
                    visited[next]=true;
                    queue.offer(next);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
