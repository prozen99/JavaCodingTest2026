package backjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        String[] minusParts = expression.split("-");
        int answer = sumGroup(minusParts[0]);

        for (int i = 1; i < minusParts.length; i++) {
            answer -= sumGroup(minusParts[i]);
        }

        System.out.println(answer);
    }

    private static int sumGroup(String group) {
        String[] plusParts = group.split("\\+");
        int sum = 0;

        for (String part : plusParts) {
            sum += Integer.parseInt(part);
        }

        return sum;
    }
}
