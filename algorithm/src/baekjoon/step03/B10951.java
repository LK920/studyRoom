package baekjoon.step03;

import java.io.*;
import java.nio.Buffer;

public class B10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            String txt = br.readLine();
            if(txt == null){
                break;
            }
            String[] line = txt.split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int sum = a + b;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
