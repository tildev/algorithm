package baekjoon.s06.p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : tildev
 * @data : 2022-04-30
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<Character> set;
        char[] alpha;
        int groupWordCnt = 0;
        boolean isGroupWord;

        while (n-- > 0) {
            isGroupWord = true;
            set = new HashSet<>();
            alpha = br.readLine().toCharArray();

            set.add(alpha[0]);
            for (int i = 1; i < alpha.length; i++) {
                if (set.contains(alpha[i])) {
                    if (alpha[i] != alpha[i - 1]) {
                        isGroupWord = false;
                        break;
                    }
                } else {
                    set.add(alpha[i]);
                }
            }
            if (isGroupWord) {
                groupWordCnt++;
            }
        }
        System.out.println(groupWordCnt);
    }
}