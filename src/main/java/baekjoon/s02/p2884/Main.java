package baekjoon.s02.p2884;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-14
 */
public class Main {
    final static int FORTY_FIVE = 45;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int h = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        m -= FORTY_FIVE;
        if (m < 0) {
            m += 60;

            h -= 1;
            if (h < 0) {
                h += 24;
            }
        }
        bw.write(h + " " + m);
        bw.close();
    }
}