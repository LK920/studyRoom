package algorithm_theory.bfs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex04_bfs_example {
    public static void main(String[] args){
        System.out.println("예제 1 : 특정 합을 만족하는 집합을 구하시오.");
        int[] numbers = {-1, -2, -3, 4,6,7,8,9,10};
        int target = 35;
        findSubsetWithSum(numbers, target);

        System.out.println("예제 2 : 최대 합 부분집합 찾기");
        findMaxSubsetSum(numbers);
    }
    // 예제 1 : 특정 합을 만족하는 집합을 구하시오.
    public static void findSubsetWithSum(int[] arr, int targetSum){
        int n = arr.length;
        int totalSubset = 1 << n;

        System.out.println("\n 목표 합 : " + targetSum);
        boolean found = false;

        for (int mask = 0; mask < totalSubset ; mask++) {
            int sum = 0;
            ArrayList<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                if((mask & (1 << i)) != 0){
                    sum += arr[i];
                    subset.add(arr[i]);
                }
            }
            if(sum == targetSum){
                System.out.println("찾음 : " + subset + " = " + sum);
                found = true;
            }
        }

        if(!found){
            System.out.println("해당하는 집합이 없습니다.");
        }
    }
    // 최대 합 부분 집합 찾기
    public static void findMaxSubsetSum(int[] arr){
        int n = arr.length;
        int totalSubset = 1 << n;
        int maxSum = Integer.MIN_VALUE;
        ArrayList<Integer> maxSubset = new ArrayList<>();

        for (int mask = 0; mask < totalSubset; mask++){
            int sum = 0;
            ArrayList<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if((mask & (1 << i)) != 0){
                    sum += arr[i];
                    subset.add(arr[i]);
                }
            }
            if(sum > maxSum){
                maxSubset = subset;
            }
            maxSum = Math.max(maxSum, sum);

        }

        System.out.println("부분 집합의 최대합 : " + maxSum);
        System.out.println("최대 합의 부분집합 : " + maxSubset);
    }
}
