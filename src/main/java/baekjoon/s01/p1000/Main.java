package baekjoon.s01.p1000;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        int result = 0;
        while (st.hasMoreTokens()) {
            result += Integer.valueOf(st.nextToken());
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
