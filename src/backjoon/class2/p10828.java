package backjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            String[] str=br.readLine().split(" ");
            if(str[0].equals("push")){
                stack.push(Integer.parseInt(str[1]));
            } else if(str[0].equals("top")){
                if(stack.isEmpty()){
                    sb.append(-1);
                    sb.append("\n");
                }else{
                    sb.append(stack.peek());
                    sb.append("\n");
                }
            } else if(str[0].equals("size")){
                sb.append(stack.size());
                sb.append("\n");
            } else if(str[0].equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1);
                    sb.append("\n");
                }else{
                    sb.append(0);
                    sb.append("\n");
                }
            } else if(str[0].equals("pop")){
                if(stack.isEmpty()){
                    sb.append(-1);
                    sb.append("\n");
                }else{
                    sb.append(stack.pop());
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
