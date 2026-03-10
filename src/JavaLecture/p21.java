package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int answer = Integer.MIN_VALUE;
        int dSum1 = 0;
        int dSum2 = 0;

        for (int i = 0; i < n; i++) {
            int rSum = 0;
            int cSum = 0;
            for (int j = 0; j < n; j++) {
                rSum += arr[i][j];
                cSum += arr[j][i];
            }
            answer = Math.max(answer, rSum);
            answer = Math.max(answer, cSum);
        }

        for (int i = 0; i < n; i++) {
            dSum1 += arr[i][i];
            dSum2 += arr[i][n - 1 - i];
        }

        answer = Math.max(answer, dSum1);
        answer = Math.max(answer, dSum2);

        System.out.println(answer);
    }
}