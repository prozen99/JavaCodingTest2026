package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class p11724 {
    static void dfs(int cur){
        visited[cur]=true;
        for(int next:graph[cur]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
    static void bfs(int start){
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int cur=q.poll();
            visited[cur]=true;
            for(int next:graph[cur]){
                if(!visited[next]){
                    visited[next]=true;
                    q.offer(next);
                }
            }
        }
    }
    static int count=0;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        graph=new ArrayList[n+1];
        visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            String[] line=br.readLine().split(" ");
            int a=Integer.parseInt(line[0]);
            int b=Integer.parseInt(line[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                bfs(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
