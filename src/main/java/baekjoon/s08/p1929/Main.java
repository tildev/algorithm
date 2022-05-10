package baekjoon.s08.p1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-05-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

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

        StringBuilder primeNumber = new StringBuilder();

        for (int i = m; i < n + 1; i++) {
            if (!isNotPrimeNumber[i]) {
                primeNumber.append(i).append("\n");
            }
        }
        System.out.println(primeNumber.toString());
    }
}