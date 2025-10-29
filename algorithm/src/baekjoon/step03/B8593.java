package baekjoon.step03;

import java.io.*;

public class B8593 {
    /*
    *   합 문제
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }

        bw.write(sum + "\n");
        bw.flush();

        br.close();
        bw.close();
    }

}
