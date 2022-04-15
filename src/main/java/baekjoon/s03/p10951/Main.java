package baekjoon.s03.p10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        StringTokenizer st;
        while (true) {
            s = br.readLine();
            if (s == null) {
                break;
            }
            st = new StringTokenizer(s, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }
    }
}