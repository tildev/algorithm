package baekjoon.s05.p1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-04-26
 */
public class Main {
    static boolean[] isHanSu = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt;

        if (n < 100) {
            cnt = n;
        } else {
            cnt = 99;

            if (n >= 111) {
                for (int i = 111; i <= n; i++) {
                    isHanSu[i] = makeHanSu(i);
                }
                for (int i = 111; i <= n; i++) {
                    if (isHanSu[i]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean makeHanSu(int num) {
        int hun = num / 100;
        int ten = num / 10 % 10;
        int one = num % 10;

        if (hun - ten == ten - one) {
            return true;
        }
        return false;
    }
}