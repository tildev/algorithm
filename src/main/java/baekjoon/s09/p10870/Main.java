package baekjoon.s09.p10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
        } else {
            int[] fiboArr = new int[n + 1];

            fiboArr[0] = 0;
            fiboArr[1] = 1;

            for (int i = 2; i <= n; i++) {
                fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
            }
            System.out.println(fiboArr[n]);
        }
    }
}