package baekjoon.s03.p10952;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            sb.append(a + b).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}