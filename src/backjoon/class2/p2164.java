package backjoon.class2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p2164 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayDeque<Integer> d=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            d.add(i);
        }

        while(d.size()>1){
            d.pollFirst();
            if(!d.isEmpty()){
                int t=d.pollFirst();
                d.addLast(t);
            }
        }
        System.out.println(d.pollFirst());
    }
}
