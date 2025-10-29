package baekjoon.step03;

import java.io.*;

public class B2439 {

    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= cnt; i++ ){
            for (int j = cnt - i; j > 0 ; j--) {
                bw.write(" ");
            }
            for (int j = i; j > 0 ; j--) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }

}
