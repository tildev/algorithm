package baekjoon.s08.p11653;

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

        int n = Integer.parseInt(br.readLine());

        StringBuilder primeFactorization = new StringBuilder();

        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                primeFactorization.append(i).append("\n");
                n /= i;
            } else {
                i++;
            }
        }
        System.out.println(primeFactorization.toString());
    }
}