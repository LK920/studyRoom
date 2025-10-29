package baekjoon;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 주사위 3개의 값 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int prize = 0;

        if (a == b && b == c) {
            // 같은 눈 3개
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // 같은 눈 2개 (a가 기준)
            prize = 1000 + a * 100;
        } else if (b == c) {
            // 같은 눈 2개 (b, c가 기준)
            prize = 1000 + b * 100;
        } else {
            // 모두 다른 눈 → 가장 큰 값 × 100
            int max = Math.max(a, Math.max(b, c));
            prize = max * 100;
        }
        // 출력
        System.out.println(prize);
    }
}
