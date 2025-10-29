package algorithm_theory.bfs;

import java.util.ArrayList;
import java.util.List;

public class Ex02_SubsetFinding_dfs {
    /*
    *      2-1. 부분집합 - dfs 스타일
    *       - 재귀로 부분집합 찾기
    * */
    public static void main(String[] args){
        List<List<Integer>> result = new ArrayList<>();
        int[] testArr = {1,2,3,4,5,6,7,8,9};
        backtrack(testArr, 0, new ArrayList<>(), result);
        System.out.println("\n 재귀 방식 부분집합");
        for(List<Integer> subset : result){
            System.out.println(subset);
        }
    }

    private static void backtrack(int[] arr, int index,
                                  List<Integer> current,
                                  List<List<Integer>> result ){
        // 배열의 모든 값 확인했으며 결과에 추가
        if(index == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        // 현재 요소 포함
        current.add(arr[index]);
        backtrack(arr, index+1, current, result);

        // 현재 요소 미포함
        current.remove(current.size() - 1);
        backtrack(arr, index + 1, current, result);

    }
}
