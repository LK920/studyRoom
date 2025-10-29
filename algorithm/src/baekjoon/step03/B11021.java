package baekjoon.step03;
import java.io.*;

public class B11021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");
            int res = Integer.parseInt(line[0]) + Integer.parseInt(line[1]);
            bw.write("Case #" + (i+1) + ": " + res + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
