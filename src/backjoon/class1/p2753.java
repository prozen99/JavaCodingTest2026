package backjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int month=Integer.parseInt(br.readLine());
        if(month%4==0 && (month%100!=0||(month%400==0))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
