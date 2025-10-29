package baekjoon.step03;

import java.io.*;

public class B11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size ; i++) {
            String[] line = br.readLine().split(" ");
            int sum = Integer.parseInt(line[0]) + Integer.parseInt(line[1]);
            String res = "Case #" + (i + 1) + ": " + line[0] + " + " + line[1] + " = " + sum + "\n";
            bw.write(res);
        }

        bw.flush();

        br.close();
        bw.close();

    }
}
