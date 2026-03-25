package JavaLecture;

import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int lt=1;
        int sum=0;
        int count=0;
        for(int i=1;i<n;i++){
            //2개이상의 연속된 자연수합이니까 자기 자신은 포함 안되게 범위 제외
            sum+=i;
            while(sum>=n){
                if(sum==n) count++;
                sum-=lt++;
            }
        }
        System.out.println(count);
    }
}
