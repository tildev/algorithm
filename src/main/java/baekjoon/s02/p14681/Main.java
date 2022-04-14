package baekjoon.s02.p14681;

import java.io.*;

/**
 * @author : tildev
 * @data : 2022-04-14
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.valueOf(br.readLine());
        int y = Integer.valueOf(br.readLine());

        if (x > 0) {
            if (y > 0) {
                bw.write("1");
            } else {
                bw.write("4");
            }
        } else {
            if (y > 0) {
                bw.write("2");
            } else {
                bw.write("3");
            }
        }
        bw.close();
    }
}