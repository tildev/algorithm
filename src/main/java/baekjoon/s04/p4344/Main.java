package baekjoon.s04.p4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-21
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int n, sum = 0, avg, cnt = 0;
        int arr[];
        while (c-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            avg = sum / n;

            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    cnt++;
                }
            }

            System.out.println(String.format("%.3f", (double) cnt / (double) n * 100.0) + "%");
            sum = 0;
            cnt = 0;
        }
    }
}