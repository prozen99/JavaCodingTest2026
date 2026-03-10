package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        for(int i=0;i<n;i++){
            String[] str=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(str[j]);
            }
        }
        int count=0;//봉우리 개수
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                boolean check=true;
                for(int k=0;k<4;k++){//4방향 탐색
                    int nx=i+dx[k]; // i가 행이고 j가 열이라서 i , j 기준으로 돌아야함
                    int ny=j+dy[k];//
                    if(nx<0 || nx>=n ||  ny < 0 || ny >=n) continue;
                    if(arr[i][j]<=arr[nx][ny]){
                        check=false;// 타겟 arr[i][j]가 하나라도 4방향 서칭보다 작으면 봉우리가 아님
                    }
                }
                if(check){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
