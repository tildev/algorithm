package baekjoon.s02.p2480;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author : tildev
 * @data : 2022-04-14
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Integer[] num = Arrays.stream(s.split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

        Arrays.sort(num, Collections.reverseOrder());

        if (num[0] == num[1] && num[1] == num[2]) {
            bw.write((10000 + num[0] * 1000) + "");
        } else if (num[0] == num[1] || num[1] == num[2]) {
            bw.write((1000 + num[1] * 100) + "");
        } else {
            bw.write((num[0] * 100) + "");
        }
        bw.close();
    }
}