package JavaLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        int answer = 0;

        for (int mentor = 1; mentor <= n; mentor++) {
            for (int mentee = 1; mentee <= n; mentee++) {
                if (mentor == mentee) {
                    continue;
                }

                boolean possible = true;

                for (int test = 0; test < m; test++) {
                    int mentorRank = 0;
                    int menteeRank = 0;

                    for (int rank = 0; rank < n; rank++) {
                        if (arr[test][rank] == mentor) {
                            mentorRank = rank;
                        }
                        if (arr[test][rank] == mentee) {
                            menteeRank = rank;
                        }
                    }

                    if (mentorRank > menteeRank) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
