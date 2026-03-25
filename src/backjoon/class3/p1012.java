package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1012 {
    static boolean[][] visited;
    static int[][] map;
    static int count=0;//배추(연결 요소 개수 )
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static void dfs(int x,int y){
        if(x<0 || x>=map.length || y<0 || y>=map[0].length) return;
        if(map[x][y]==0 || visited[x][y]) return;
        visited[x][y]=true;
        for(int i=0;i<4;i++){
            dfs(x+dx[i],y+dy[i]);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++){
            String[] cmd=br.readLine().split(" ");
            int column=Integer.parseInt(cmd[0]);
            int row=Integer.parseInt(cmd[1]);
            int targetCount=Integer.parseInt(cmd[2]);
            count=0;
            map = new int[column][row];
            visited=new boolean[column][row];
            for(int j=0;j<targetCount;j++){
                String[] mapInfo=br.readLine().split(" ");
                map[Integer.parseInt(mapInfo[0])][Integer.parseInt(mapInfo[1])]=1;//배추 위치 1로 업데이트
            }
            for(int x=0;x<column;x++){
                for(int y=0;y<row;y++){
                    if(map[x][y]==1 && !visited[x][y]){
                        // 배추 만나면 8방향 연결 요소 탐색 DFS
                        dfs(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
