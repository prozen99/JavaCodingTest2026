package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class p10845 {
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] cmd=br.readLine().split(" ");
            if(cmd[0].equals("push")){
                dq.add(Integer.parseInt(cmd[1]));
            }
            if(cmd[0].equals("front")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekFirst());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }
            if(cmd[0].equals("back")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekLast());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }
            if(cmd[0].equals("empty")){
                if(dq.isEmpty()){
                    sb.append(1);
                    sb.append("\n");
                }else{
                    sb.append(0);
                    sb.append("\n");
                }
            }
            if(cmd[0].equals("pop")){
                if(!dq.isEmpty()){
                    int t=dq.pollFirst();
                    sb.append(t);
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }
            if(cmd[0].equals("size")){
                if(dq.isEmpty()){
                    sb.append(0);
                    sb.append("\n");
                }else{
                    sb.append(dq.size());
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
