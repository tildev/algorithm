package baekjoon.s04.p3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : tildev
 * @data : 2022-04-19
 */
public class Main {
    private static final int FORTY_TWO = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            result.add(Integer.parseInt(br.readLine()) % FORTY_TWO);
        }
        System.out.println(result.size());
    }
}