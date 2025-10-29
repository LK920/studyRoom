package baekjoon.step03;
import java.io.*;
public class B25304 {
    /*
    *   영수증
    *
    * */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tot = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");
            sum += Integer.parseInt(line[0]) * Integer.parseInt(line[1]);
        }

        bw.write(sum == tot ? "Yes" : "No");
        bw.flush();

        br.close();
        bw.close();

    }
}
