package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2606_2 {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count=0;

    static void dfs(int now){
        visited[now]=true;
        for(int next:graph[now]){
            if(!visited[next]){
                count++;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int computer=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        graph=new ArrayList[computer+1];
        visited=new boolean[computer+1];
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
        dfs(1);
        System.out.println(count);
    }
}
