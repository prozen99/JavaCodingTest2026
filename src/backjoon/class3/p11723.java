package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Set<Integer> set =new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            String[] cmd=br.readLine().split(" ");
            if(cmd[0].equals("add")){
                set.add(Integer.parseInt(cmd[1]));
            }else if(cmd[0].equals("remove")){
                if(!set.isEmpty()){
                    set.remove(Integer.parseInt(cmd[1]));
                }
            }else if(cmd[0].equals("check")){
                if(set.contains(Integer.parseInt(cmd[1]))){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmd[0].equals("toggle")){
                if(set.contains(Integer.parseInt(cmd[1]))){
                    set.remove(Integer.parseInt(cmd[1]));
                }else{
                    set.add(Integer.parseInt(cmd[1]));
                }
            }else if(cmd[0].equals("all")){
                set=new HashSet<>();
                for(int j=1;j<=20;j++){
                    set.add(j);
                }
            }else if(cmd[0].equals("empty")){
                set=new HashSet<>();
            }
        }
        System.out.println(sb.toString());
    }
}
