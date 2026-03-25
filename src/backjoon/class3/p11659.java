package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[] prefix = new int[n + 1];
        String[] numbers = br.readLine().split(" ");
        for(int i=1;i<=numbers.length;i++){
            prefix[i]=prefix[i-1]+Integer.parseInt(numbers[i-1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String[] range = br.readLine().split(" ");
            int start = Integer.parseInt(range[0]);
            int end = Integer.parseInt(range[1]);
            sb.append(prefix[end]-prefix[start-1]).append("\n");
        }

        System.out.print(sb);
    }
}
