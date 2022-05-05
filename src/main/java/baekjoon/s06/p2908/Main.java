package baekjoon.s06.p2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
* @author : tildev
* @data : 2022-04-29
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int aSu = (a % 10) * 100 + (a / 10 % 10) * 10 + a / 100;
        int bSu = (b % 10) * 100 + (b / 10 % 10) * 10 + b / 100;

        if (aSu > bSu) {
            System.out.println(aSu);
        } else {
            System.out.println(bSu);
        }
    }
}