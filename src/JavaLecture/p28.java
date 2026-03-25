package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int lt = 0;
        int sum = 0;
        int count = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            while (sum >= m) {
                if (sum == m) {
                    count++;
                }
                sum -= arr[lt++];
            }
        }

        System.out.println(count);
    }
}
