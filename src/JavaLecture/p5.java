package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        // 투포인터로 문제 해결해 보기 !
        int lt=0;
        int rt=str.length()-1;
        char[] c=str.toCharArray();
        while(lt<rt){
            if(!Character.isAlphabetic(c[lt])){
                lt++;//왼쪽이 알파벳이 아니면
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{//둘다 알파벳이면
                char temp=c[lt];
                c[lt]=c[rt];
                c[rt]=temp;
                lt++;
                rt--;
            }
        }
        System.out.println(new String(c));

    }
}
