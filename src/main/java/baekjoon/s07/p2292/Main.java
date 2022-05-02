package baekjoon.s07.p2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-02
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(1);
        } else {
            int cnt = 1;
            n -= 1;
            while (n > 0) {
                n = (n - 6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}