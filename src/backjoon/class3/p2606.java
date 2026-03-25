package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2606 {
    static int[][] graph;
    static boolean[] visited;
    static int count=0;

    static void dfs(int now,int computer){
        visited[now]=true;
        for(int next=1;next<=computer;next++){
            if(graph[now][next]==1 && !visited[next]){
                count++;
                dfs(next,computer);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int computer=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());

        graph=new int[computer+1][computer+1];
        visited=new boolean[computer+1];
        for(int i=0;i<n;i++){
            String[] str=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            graph[a][b]=1;
            graph[b][a]=1;
        }
        //문제는 1번 컴퓨터가 웜 바이러스에 걸렸을 때 , 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수 첫째 줄 출력
        dfs(1,computer);
        System.out.println(count);
    }
}
