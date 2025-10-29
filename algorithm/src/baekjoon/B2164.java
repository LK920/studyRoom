package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
    /*
        1차 47:57.07
    */
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            queue.add(i + 1);
        }
        go(n - 1);

    }

    public static void go(int size){
        while(true) {
            if(queue.size() == 1){
                System.out.println(queue.peek());
                return;
            }
            queue.remove();
            int t = queue.remove();
            queue.add(t);
        }
    }
}
