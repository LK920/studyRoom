package algorithm_theory.bfs;

public class Ex01_basicSearch {
    /*
    *   01. 완전 탐색 (Brute Force)이란?
    *   - 모든 경우의 수를 다 확인하는 방법
    *   - "무식하지만 확실한" 방법
    *   - 작은 데이터 셋에서 효과
    *
    *  예: 1~100 중 특정 숫자 찾기
    *   - 완전 탐색 : 1부터 100까지 다 확인
    *   - 이진 탐색 : 절반씩 나누면서 확인 ( 훨씬 빠름)
    *
    * */

        // == 1. 가장 기본적인 배열에서 특정 값 찾기 ===
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,23,5,12,56,34,6,12,31,23,124};
        int target = 34;
        int idx = linearSearch(arr, target);
        System.out.println(arr[idx]);

    }

    public static int linearSearch(int[] arr, int target){
        // 모든 요소 순회하면서 찾기
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                return i; // 찾은 인덱스 반환
            }
        }
        return -1; // 없을 경우 반 -1
        // 시간복잡도 O(n) -> 최악의 경우 모든 경우의 수 다 거쳐야함
    }
}
