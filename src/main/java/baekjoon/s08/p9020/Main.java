package baekjoon.s08.p9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-12
 */
public class Main {
    public static boolean[] isNotPrimeNumber = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        isNotPrimeNumber[0] = isNotPrimeNumber[1] = true;

        for (int i = 2; i <= Math.sqrt(isNotPrimeNumber.length); i++) {
            if (isNotPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j < isNotPrimeNumber.length; j += i) {
                isNotPrimeNumber[j] = true;
            }
        }

        StringBuilder resultSB = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int n, low, high;
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            low = high = n / 2;
            while (true) {
                if (!isNotPrimeNumber[low] && !isNotPrimeNumber[high]) {
                    resultSB.append(low).append(" ").append(high).append("\n");
                    break;
                }
                low--;
                high++;
            }
        }
        System.out.println(resultSB.toString());
    }
}