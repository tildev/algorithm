package baekjoon.s08.p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] isNotPrimeNumber = new boolean[n + 1];

        isNotPrimeNumber[0] = isNotPrimeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isNotPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j <= n; j += i) {
                isNotPrimeNumber[j] = true;
            }
        }

        int firstPrimeNumber = -1;
        int sumPrimeNumber = 0;

        for (int i = m; i < n + 1; i++) {
            if (!isNotPrimeNumber[i]) {
                if (firstPrimeNumber == -1) {
                    firstPrimeNumber = i;
                }
                sumPrimeNumber += i;
            }
        }
        if (sumPrimeNumber == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sumPrimeNumber);
            System.out.println(firstPrimeNumber);
        }
    }
}