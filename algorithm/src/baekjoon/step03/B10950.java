package baekjoon.step03;

import java.util.ArrayList;
import java.util.Scanner;

public class B10950 {
    /*
    *  A + B 출력
    *
    * */
    public static void main(String[] args){

        ArrayList<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < size ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result.add(a + b);
        }

        for(Integer res : result){
            System.out.println(res);
        }
    }
}
