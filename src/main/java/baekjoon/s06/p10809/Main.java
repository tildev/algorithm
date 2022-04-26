package baekjoon.s06.p10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author : tildev
 * @data : 2022-04-27
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphaArr = new int[26];
        Arrays.fill(alphaArr, -1);

        char[] cArr = br.readLine().toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            if (alphaArr[cArr[i] - 'a'] == -1) {
                alphaArr[cArr[i] - 'a'] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int alpha : alphaArr) {
            sb.append(alpha).append(" ");
        }
        System.out.println(sb.toString());
    }
}