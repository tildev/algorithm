package baekjoon.s08.p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-05-10
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num, cnt, result = 0;
        for (int i = 0; i < n; i++) {
            cnt = 0;
            num = Integer.parseInt(st.nextToken());
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}