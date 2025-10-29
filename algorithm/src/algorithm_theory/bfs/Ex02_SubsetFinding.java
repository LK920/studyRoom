package algorithm_theory.bfs;

import java.util.Arrays;

public class Ex02_SubsetFinding {
    /*
    *   2. 부분집합이란? (매우 중요)
    *   - 예 : {1, 2, 3}의 부분집합
    *       {}, {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}
    *       총, 2^3 = 8개
    *
    *   왜 2^3개인가?
    *   - 각 요소마다 "포함" or "미포함" 2가지 선택
    *   - n개 요소 * 2가지 선택지 = 2^n
    * */
    public static void main(String[] args){
        int[] arr = {1,2,3};
        findSubsetsByBitmask(arr);
    }
    // 방법 1 : 비트마스킹으로 부분집합 찾기 ( 가장 직관적 )
    public static void findSubsetsByBitmask(int[] arr){
        int n = arr.length;
        int totalSubset = 1 << n; // 2^n (bit shift)

        System.out.println("배열 : " + Arrays.toString(arr));
        System.out.println("부분집합 개수 : " + totalSubset);
        System.out.println("\n 모든 부분 집합 : ");

        // 0부터 2^n - 1 까지 확인
        for(int mask = 0; mask < totalSubset; mask++){
            System.out.print("{ ");

            // 각 비트를 확인
            for(int i = 0 ; i < n; i++){
                // 첫번째 비트가 1인지 확인
                if((mask & (1 << i)) != 0){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }

    }
}
