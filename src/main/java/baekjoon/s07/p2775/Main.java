package baekjoon.s07.p2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-05
 */
public class Main {
    private static int[][] apartArr = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            apartArr[i][1] = 1;
            apartArr[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apartArr[i][j] = apartArr[i - 1][j] + apartArr[i][j - 1];
            }
        }

        int t = Integer.parseInt(br.readLine());
        int k, n;
        while (t-- > 0) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            System.out.println(apartArr[k][n]);
        }
    }
}