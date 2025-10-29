package baekjoon.step03;

import java.io.*;

public class B25413 {
    /*
    *
    * */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int size = num / 4;
        String result = "int";
        for (int i = 0; i < size; i++) {
            result = "long " + result;
        }

        bw.write(result);
        bw.flush();

        br.close();
        bw.close();

    }
}
