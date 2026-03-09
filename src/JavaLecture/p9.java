package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String result="";
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                result+=String.valueOf(c[i]);
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}
