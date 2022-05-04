package baekjoon.s07.p1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : tildev
 * @data : 2022-05-04
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int temp = n, i = 1;
        while (true) {
            if (temp - i <= 0) {
                break;
            }
            temp -= i;
            i++;
        }

        if (i % 2 == 0) {
            System.out.println(temp + "/" + (i + 1 - temp));
        } else {
            System.out.println((i + 1 - temp) + "/" + temp);
        }
    }
}