package baekjoon.s02.p2525;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-14
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        int c = Integer.valueOf(br.readLine());

        b += c;

        int h = b / 60;

        b %= 60;
        a += h;
        a %= 24;

        bw.write(a + " " + b);
        bw.close();
    }
}