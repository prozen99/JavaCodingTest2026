package backjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);

        int totalMinutes = hour * 60 + minute - 45;
        if (totalMinutes < 0) {
            totalMinutes += 24 * 60;
        }

        System.out.println((totalMinutes / 60) + " " + (totalMinutes % 60));
    }
}
