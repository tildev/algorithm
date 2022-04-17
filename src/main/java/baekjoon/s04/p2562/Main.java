package baekjoon.s04.p2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-04-17
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        int maxValue = Integer.MIN_VALUE, index = 0, num;
        String s;
        while (true) {
            s = br.readLine();
            if (s == null) {
                break;
            }
            i++;
            num = Integer.parseInt(s);
            if (num > maxValue) {
                maxValue = num;
                index = i;
            }
        }
        System.out.println(maxValue + " " + index);
    }
}