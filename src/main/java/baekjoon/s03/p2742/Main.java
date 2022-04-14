package baekjoon.s03.p2742;

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

        do {
            bw.write(n + "");
            bw.newLine();
        } while (n-- > 1);

        bw.close();
    }
}