package baekjoon.s08.p4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-10
 */
public class Main {

    public static boolean[] isNotPrimeNumber = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        isNotPrimeNumber[0] = isNotPrimeNumber[1] = true;

        for (int i = 2; i <= Math.sqrt(isNotPrimeNumber.length); i++) {
            if (isNotPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j <= isNotPrimeNumber.length; j += i) {
                isNotPrimeNumber[j] = true;
            }
        }

        StringBuilder primeNumberResultCnt = new StringBuilder();

        int n, cnt;

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            cnt = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!isNotPrimeNumber[i]) {
                    cnt++;
                }
            }
            primeNumberResultCnt.append(cnt).append("\n");
        }
        System.out.println(primeNumberResultCnt);
    }
}