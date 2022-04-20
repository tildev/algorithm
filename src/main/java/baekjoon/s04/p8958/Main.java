package baekjoon.s04.p8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-04-20
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s;
        int sum = 0, num = 0;
        while (n-- > 0) {
            s = br.readLine();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    sum += ++num;
                } else {
                    num = 0;
                }
            }
            System.out.println(sum);
            sum = 0;
            num = 0;
        }
    }
}