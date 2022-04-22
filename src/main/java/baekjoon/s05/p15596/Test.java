package baekjoon.s05.p15596;

/**
 * @author : tildev
 * @data : 2022-04-22
 */
public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}