package baekjoon.s05.p4673;

import java.io.IOException;

/**
 * @author : tildev
 * @data : 2022-04-26
 */
public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] isSelfNum = new boolean[10001];
        int temp;
        for (int i = 1; i < 10001; i++) {
            temp = makeSelfNumber(i);
            if (temp < 10001) {
                isSelfNum[temp] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!isSelfNum[i]) {
                System.out.println(i);
            }
        }
    }

    public static int makeSelfNumber(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}