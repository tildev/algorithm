package baekjoon.s04.p10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-16
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, temp;
        while (n-- > 0) {
            temp = Integer.parseInt(st.nextToken());
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        System.out.println(min + " " + max);
    }
}