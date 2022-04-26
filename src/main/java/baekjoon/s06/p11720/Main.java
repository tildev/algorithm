package baekjoon.s06.p11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-04-26
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] cArr = br.readLine().toCharArray();
        int sum = 0;
        while (n-- > 0) {
            sum += cArr[n] - '0';
        }
        System.out.println(sum);
    }
}