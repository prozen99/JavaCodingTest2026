package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }
        StringBuilder sb1=new StringBuilder(sb).reverse();
        if(sb.compareTo(sb1) == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
