package baekjoon.s03.p1110;

import java.io.*;

/**
 * @author : tildev
 * @data : 2022-04-16
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        int a, b, temp = n;
        int len = 0;
        while (true) {
            len++;

            a = temp % 10;
            b = temp / 10 + a;

            temp = a * 10 + b % 10;
            if (temp == n) {
                break;
            }
        }
        bw.write(len + "");
        bw.close();
    }
}