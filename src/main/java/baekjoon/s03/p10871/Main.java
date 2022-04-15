package baekjoon.s03.p10871;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @data : 2022-04-15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int temp;

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        while (n-- >0){
            temp = Integer.parseInt(st.nextToken());
            if(temp < x){
                sb.append(temp).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}