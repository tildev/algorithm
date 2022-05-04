package baekjoon.s07.p2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-05-04
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());


        long result = (v - b) / (a - b);

        if ((v - b) % (a - b) != 0) {
            result += 1;
        }
        System.out.println(result);
    }
}