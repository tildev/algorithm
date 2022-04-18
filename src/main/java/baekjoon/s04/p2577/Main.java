package baekjoon.s04.p2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-04-18
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c, r;

        int resultArr[] = new int[10];
        while (result > 0) {
            r = result % 10;
            resultArr[r]++;
            result /= 10;
        }
        for (int resultValue : resultArr) {
            System.out.println(resultValue);
        }
    }
}