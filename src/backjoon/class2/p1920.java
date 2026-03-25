package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] temp=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(temp[i]);
        }
        int m=Integer.parseInt(br.readLine());
        int[] target=new int[m];
        String[] temp2=br.readLine().split(" ");
        for(int i=0;i<m;i++){
            target[i]=Integer.parseInt(temp2[i]);
        }
        Arrays.sort(arr);//이분탐색 쓰기 위해서 정렬 해줘야함
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            int min=0;
            int max=arr.length-1;
            int middle=0;
            boolean existCheck=false;
            while(min<=max){
                middle=(min+max)/2;
                if(arr[middle]==target[i]){
                    existCheck=true;
                    break;
                }else if(arr[middle]<target[i]){
                    min=middle+1;
                }else{
                    max=middle-1;
                }
            }//while을 나오면 결국 값을 못찾았다는 소리니까 0을 출력해야함
            if(existCheck){
                sb.append(1);
                sb.append("\n");
            }else{
                sb.append(0);
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
