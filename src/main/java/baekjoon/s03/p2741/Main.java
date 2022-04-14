package baekjoon.s03.p2741;

import java.io.*;

/**
 * @author : tildev
 * @data : 2022-04-14
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        for (int i = 1; i <= n; i++) {
            bw.write(i + "");
            bw.newLine();
        }
        bw.close();
    }
}