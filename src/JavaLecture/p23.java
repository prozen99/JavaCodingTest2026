package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // arr[학생번호][학년]
        int[][] arr = new int[n + 1][6];

        // 입력: 학생별로 1학년~5학년 반 정보 5개
        for (int i = 1; i <= n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(str[j - 1]);
            }
        }

        int max = -1;
        int answer = 0;

        // i번 학생을 임시 반장 후보로 두고
        for (int i = 1; i <= n; i++) {
            int count = 0;

            // 다른 학생 k와 비교
            for (int k = 1; k <= n; k++) {
                if (i == k) continue; // 자기 자신 제외

                // 1학년~5학년 중 한 번이라도 같은 반인지 확인
                for (int j = 1; j <= 5; j++) {
                    if (arr[i][j] == arr[k][j]) {
                        count++;
                        break; // 같은 학생 k는 한 번만 세야 하므로 종료
                    }
                }
            }

            // 더 많은 학생과 같은 반이었던 경우 갱신
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}