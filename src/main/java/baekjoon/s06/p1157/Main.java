package baekjoon.s06.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* @author : tildev
* @data : 2022-04-29
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] alphaArr = br.readLine().toUpperCase().toCharArray();
        int[] allAlphaArr = new int[26];

        for (char alpha : alphaArr) {
            allAlphaArr[alpha - 'A']++;
        }

        int max = 0, index = 0;
        boolean dup = false;
        for (int i = 0; i < allAlphaArr.length; i++) {
            if (allAlphaArr[i] > max) {
                max = allAlphaArr[i];
                dup = false;
                index = i;
            } else if (allAlphaArr[i] == max) {
                dup = true;
            }
        }
        if (dup) {
            System.out.println("?");
        } else {
            System.out.println((char) (index + 'A'));
        }
    }
}