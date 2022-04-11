package baekjoon.s01.p2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-04-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());

        int r1, r2, r3;

        r1 = a * ((b % 100) % 10);
        r2 = a * ((b % 100) / 10);
        r3 = a * (b / 100);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r1 + r2 * 10 + r3 * 100);
    }
}
