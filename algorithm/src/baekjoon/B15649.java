package baekjoon;

import java.util.Scanner;

public class B15649 {
    // N과 M(1)
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m]; // m은 배열의 길이
        visit = new boolean[n]; // n은 반복 개수
        go(n,m,0);
    }

    public static void go(int n, int m, int len){
        if(len == m){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]){
                visit[i] = true;
                arr[len] = i + 1;
                go(n,m,len + 1);
                visit[i] = false;
            }
        }

    }

}
