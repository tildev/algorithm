package baekjoon.s06.p5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

**
* @author : tildev
* @data : 2022-04-29
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphaArr = {3, 3, 3,
                4, 4, 4,
                5, 5, 5,
                6, 6, 6,
                7, 7, 7,
                8, 8, 8, 8,
                9, 9, 9,
                10, 10, 10, 10};

        char[] sArr = br.readLine().toCharArray();

        int sum = 0;
        for (int i = 0; i < sArr.length; i++) {
            sum += alphaArr[sArr[i] - 'A'];
        }
        System.out.println(sum);
    }
}