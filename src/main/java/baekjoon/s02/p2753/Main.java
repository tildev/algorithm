package baekjoon.s02.p2753;

import java.io.*;

/**
 * @author : tildev
 * @data : 2022-04-13
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.valueOf(br.readLine());

        if ((y % 4 == 0 && !(y % 100 == 0)) || y % 400 == 0) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        bw.close();
    }
}
