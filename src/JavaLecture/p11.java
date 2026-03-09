package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char[] c=str.toCharArray();
        char prev=str.charAt(0);
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<c.length;i++){
            char cur=c[i];
            if(cur==prev){
                count++;
            }else{
                sb.append(prev);
                if(count!=1){
                    sb.append(count);
                }
                count=1;
                prev=cur;
            }
        }
        sb.append(prev);// 마지막 문자 처리
        if(count!=1){
            sb.append(count);
        }
        System.out.println(sb.toString());
    }
}
