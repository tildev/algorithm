package baekjoon.s06.p2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

**
* @author : tildev
* @data : 2022-04-29
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken());
            char[] sArr = st.nextToken().toCharArray();

            for (char s : sArr) {
                for (int i = 0; i < r; i++) {
                    sb.append(s);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}