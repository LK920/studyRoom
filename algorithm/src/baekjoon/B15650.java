package baekjoon;

import java.util.Scanner;

public class B15650 {

    static int[] arr;
    static int n,m; // 입력 n,m

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[m];
        go(1,0);
    }

    public static void go(int at, int depth){ // at = 최소 시작 숫자, depth = 지금 arr의 몇 번째 칸을 채우는 중인지(0부터 시작, 깊이)
        // 출력
        if(depth == m){ // m은 수열 길이, depth와 같을 경우 출력
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i<= n; i++){ // at = 시작 위치, i = 입력값 위치, i값과 n값이 같을 경우 종료
            arr[depth] = i;
            go(i + 1, depth + 1); // i + 1 자동으로 오름차순 증가
        }
    }
}
