package baekjoon.s01.p10869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        System.out.println((a + b));
        System.out.println((a - b));
        System.out.println((a * b));
        System.out.println((a / b));
        System.out.println((a % b));
    }
}
