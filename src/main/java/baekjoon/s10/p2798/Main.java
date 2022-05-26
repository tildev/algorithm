package baekjoon.s10.p2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-05-26
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nArr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(getResult(nArr, n, m));
    }

    static int getResult(int[] nArr, int n, int m) {
        int result = 0, temp;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    temp = nArr[i] + nArr[j] + nArr[k];

                    if (temp == m) {
                        return temp;
                    }

                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}