package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] split=br.readLine().split(" ");
        ArrayList<Integer> target_Array_list=new ArrayList<>();
        int[] result=new int[split[0].length()];// 떨어진 거리가 들어갈 배열
        for(int i=0;i<split[0].length();i++){
            if(split[0].charAt(i)==split[1].charAt(0)){
                 target_Array_list.add(i);// teachermode e -> 테스트 케이스에서는 1 5 10
            }
        }
        /*
        내가 하고싶은 풀이
        1. 문자열 입력 받고
        2. teachermode e 라고하면 e(타겟) 인덱스를 잡아서 ex ) 1 5 10
        3. teachermode라는 문자열 순회하면서 만약 처음 Math.min(Math.abs(0-1),Math.abs(0-5),Math.abs(0-10))
         */
        for(int i=0;i<result.length;i++){
            int min=Integer.MAX_VALUE;
            for(int idx:target_Array_list){
                min=Math.min(min,Math.abs(i-idx));
            }
            result[i]=min;
        }
        for(int x:result){
            System.out.print(x+" ");
        }
    }
}
