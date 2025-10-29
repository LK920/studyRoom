package algorithm_theory.bfs;

public class Ex03_TimeComplexity {
    /*
    *   03 시간 복잡도 이해하기
    *   O(2^n) 이란 뜻 :
    *   n = 1 : 2^1 = 2
    *   n = 2 : 2^2 = 4
    *   n = 10: 2^10 = 1,024개
    *   n = 20: 2^20 = 1,048,576개
    *   n = 30: 2^30 = 1,073,741,824개 (10억개!)
    *
    *   따라서 n > 20 정도면 완전탐색으로 풀 수 없음 (중요!)
    *
    * */
    public static void main(String[] args){
        System.out.println("\n===== O(2^n) 시간복잡도 =====");
        System.out.println("n | 연산 횟수");
        System.out.println("--|----------");

        for(int n = 1; n <= 30; n++ ){
            long operations = 1L << n;
            String readable = operations > 10_000_000L ?
                    String.format("%.1f억", operations/100_000_000.0):
                    String.valueOf(operations);
            System.out.printf("%2d | %s\n", n, readable);

            // 실용적 한계
            if(n == 20){
                System.out.println("  ↑ 이 정도까지는 1초 안에 가능");
            }
            if(n == 25){
                System.out.println("   ↑ 이 정도부터는 느려지기 시작");
            }
        }
    }
}
