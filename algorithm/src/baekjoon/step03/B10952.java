package baekjoon.step03;

import java.io.*;
import java.util.HashMap;

public class B10952 {
    public static int a;
    public static int b;
    public static int sum;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        do{
            cal();
        }while (a != 0 || b != 0);
        bw.flush();
        br.close();
        bw.close();
    }

    public static void cal(){
        try{
            String[] line = br.readLine().split(" ");
            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[1]);
            sum = a + b;
            if(sum > 0){
                bw.write(sum + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
