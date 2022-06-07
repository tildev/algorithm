package baekjoon.s10.p2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-06-07
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = 0;
        int number, sum;

        for (int i = 0; i < n; i++) {
            number = i;
            sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}