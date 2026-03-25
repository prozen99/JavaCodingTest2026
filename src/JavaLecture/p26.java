package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class p26 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        Set<Integer> seta=new HashSet<>();
        Set<Integer> setb=new HashSet<>();
        String[] str1=bufferedReader.readLine().split(" ");
        int m=Integer.parseInt(bufferedReader.readLine());
        String[] str2=bufferedReader.readLine().split(" ");
        for(int i=0;i<n;i++){
            seta.add(Integer.parseInt(str1[i]));
        }

        for(int i=0;i<m;i++){
            setb.add(Integer.parseInt(str2[i]));
        }
        seta.retainAll(setb);// retainAll (비교대상이 되는 set이랑 교집합 원소만 남겨놓음 )
                            // removeAll (비교대상이 되는 set 이랑 차집합 원소만 남겨놓음 )
        ArrayList<Integer> list=new ArrayList<>(seta);
        list.sort(null);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<seta.size();i++){
            sb.append(list.get(i));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
