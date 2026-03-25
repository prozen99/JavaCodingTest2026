package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class p1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb=new StringBuilder();
    static void dfs(int cur){
        visited[cur]=true;
        sb.append(cur).append(" ");
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
            sb.append(cur).append(" ");
            for(int next:graph[cur]){
                if(!visited[next]){
                    visited[next]=true;
                    q.offer(next);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] cmd=(br.readLine().split(" "));
        int n=Integer.parseInt(cmd[0]);//정점개수
        int m=Integer.parseInt(cmd[1]);//간선개수
        int v=Integer.parseInt(cmd[2]);//탐색 시작할 정점 번호
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
            graph[b].add(a);//무방향 그래프니까 옮김
        }
        for(int i=1;i<=n;i++){
            Collections.sort(graph[i]);
        }
        dfs(v);
        sb.append("\n");
        visited=new boolean[n+1];
        bfs(v);
        System.out.println(sb.toString());
    }
}
