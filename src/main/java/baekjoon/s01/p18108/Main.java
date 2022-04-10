package baekjoon.s01.p18108;

import java.io.*;

/**
 * @author : tildev
 * @data : 2022-04-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.valueOf(br.readLine());

        y -= 543;

        bw.write(String.valueOf(y));
        bw.close();
    }
}
