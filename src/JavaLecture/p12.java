package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());// 테스트 라인 수
        String str=br.readLine();
        StringBuilder result=new StringBuilder();//결과를 담을 스트링 빌더
        for(int i=1;i<=n;i++){//암호는 무조건 7단위
            String s=str.substring(7*(i-1),7*i);
            StringBuilder sb=new StringBuilder();// 구현을 위한 스트링빌더
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='#'){
                    sb.append(1);
                }else if(s.charAt(j)=='*'){
                    sb.append(0);
                }
            }
            int temp=Integer.parseInt(sb.toString(),2);
            result.append((char)temp);
        }
        //여기까지 오면 sb에 7글자 쌓여 있을거임 '1000010' 이런 이진수 형태
        System.out.println(result.toString());
    }
}
