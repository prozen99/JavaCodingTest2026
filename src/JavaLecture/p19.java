package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int[] scores=new int[n];
        for(int i=0;i<scores.length;i++){
            scores[i]=Integer.parseInt(str[i]);
        }
        int prev=scores[0];
        int sum=0;//최종값
        int sequence=0;//연속적으로 득점할때 값
        if(prev==1){
            sequence+=1;
            sum+=1;
        }
        for(int i=1;i<scores.length;i++){
            int current=scores[i];
            if(prev!=current&&current==1){// prev가 0이거나 current가 1 또는 prev 1  current가 0인 경우도 있으니
                // 2가지 경우중 current가 1 즉 prev 0 이고 current가 1일때 더해야함
                sequence+=1;
                sum+=sequence;
            }else if(prev==current&&current==1){//이 경우에도 더해야함
                sequence+=1;
                sum+=sequence;
            }else{// 두가지가 아닌경우는 sequence 초기화
                sequence=0;
            }
            prev=current;
        }
        System.out.println(sum);
    }
}
