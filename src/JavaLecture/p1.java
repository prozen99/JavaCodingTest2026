package JavaLecture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().toLowerCase();
        String target=br.readLine().toLowerCase();
        char[] c=s.toCharArray();
        int[] count=new int[26];
        for(int i=0;i<c.length;i++){
            count[c[i]-'a']+=1;
        }
        System.out.println(count[target.charAt(0)-'a']);
    }
}
