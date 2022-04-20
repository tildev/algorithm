package baekjoon.s04.p1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-20
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.MIN_VALUE, temp;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(st.nextToken());
            m = Math.max(m, temp);
            sum += temp;
        }

        System.out.println((float) sum / (float) m * 100 / (float) n);
    }
}