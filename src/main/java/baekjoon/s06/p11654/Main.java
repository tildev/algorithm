package baekjoon.s06.p11654;

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

        String s = br.readLine();
        char[] cArr = s.toCharArray();

        for (char c : cArr) {
            System.out.println((int) c);
        }
    }
}