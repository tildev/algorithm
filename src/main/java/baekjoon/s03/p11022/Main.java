package baekjoon.s03.p11022;

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

        int t = Integer.valueOf(br.readLine());
        StringTokenizer st;
        int a, b;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ")
                    .append(a).append(" + ").append(b).append(" = ")
                    .append(a + b).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}