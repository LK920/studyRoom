package algorithm_theory.bfs;

import java.util.ArrayList;
import java.util.List;

public class Ex02_Subset_dfs_example {

    // ===== 핵심 개념 =====
    /*
     * 재귀적 부분집합 찾기의 핵심:
     *
     * 각 요소마다 2가지 선택:
     * 1. 현재 요소를 포함한다
     * 2. 현재 요소를 포함하지 않는다
     *
     * 이 선택을 모든 요소에 대해 반복하면
     * 모든 부분집합이 만들어진다!
     */


    // ===== 수준 1: 가장 간단한 버전 (종료 조건만) =====
    static class Level1_Basic {

        public static void findSubsets_v1(int[] arr, int index, List<Integer> current) {
            // 기저 사례: 모든 요소를 확인했으면
            if (index == arr.length) {
                System.out.println(current);  // 현재 부분집합 출력
                return;
            }

            // 재귀: 다음 인덱스로
            findSubsets_v1(arr, index + 1, current);
        }

        /*
         * 이 버전은 뭘 하나?
         * - 모든 요소를 건너뛴다 (아무것도 포함하지 않음)
         * - 결과: {} (공집합만 1번 출력)
         */
    }


    // ===== 수준 2: 요소 포함하기 추가 =====
    static class Level2_WithInclusion {

        public static void findSubsets_v2(int[] arr, int index, List<Integer> current) {
            // 기저 사례
            if (index == arr.length) {
                System.out.println(current);
                return;
            }

            // 현재 요소를 포함
            current.add(arr[index]);
            findSubsets_v2(arr, index + 1, current);

            // 현재 요소를 제거 (되돌리기)
            current.remove(current.size() - 1);
        }

        /*
         * 이 버전은 뭘 하나?
         * - 모든 요소를 포함한다
         * - 결과: {1,2,3} (전체 포함만 1번 출력)
         */
    }


    // ===== 수준 3: 완전한 버전 (포함 vs 미포함) =====
    static class Level3_Complete {

        public static void findSubsets_v3(int[] arr, int index, List<Integer> current) {
            // 기저 사례: 모든 요소를 확인했으면
            if (index == arr.length) {
                System.out.println(new ArrayList<>(current));
                return;
            }

            // 선택 1: 현재 요소를 포함한다
            current.add(arr[index]);
            findSubsets_v3(arr, index + 1, current);

            // 선택 2: 현재 요소를 포함하지 않는다
            current.remove(current.size() - 1);
            findSubsets_v3(arr, index + 1, current);
        }

        /*
         * 이 버전이 정답!
         * - 각 요소마다 "포함" or "미포함" 두 가지 경로 모두 탐색
         * - 모든 부분집합을 만들어낸다
         */
    }


    // ===== 시각적 추적: 재귀 트리 출력 =====
    static class VisualizationWithTrace {

        private static int depth = 0;  // 재귀 깊이 추적

        public static void findSubsets_withTrace(int[] arr, int index,
                                                 List<Integer> current) {
            String indent = "  ".repeat(depth);  // 들여쓰기

            System.out.println(indent + "→ index=" + index + ", current=" + current);

            // 기저 사례
            if (index == arr.length) {
                System.out.println(indent + "✓ 부분집합 완성: " + current);
                return;
            }

            // 선택 1: 포함
            System.out.println(indent + "┌─ [포함] arr[" + index + "]=" + arr[index]);
            depth++;
            current.add(arr[index]);
            findSubsets_withTrace(arr, index + 1, current);
            current.remove(current.size() - 1);
            depth--;

            // 선택 2: 미포함
            System.out.println(indent + "└─ [미포함] arr[" + index + "]=" + arr[index]);
            depth++;
            findSubsets_withTrace(arr, index + 1, current);
            depth--;
        }
    }


    // ===== 단계별 실행: 수동으로 추적 =====
    static class ManualTrace {

        public static void manualTraceExample() {
            System.out.println("===== 수동 추적: {1, 2} =====\n");

            System.out.println("호출 1: findSubsets(arr, 0, [])");
            System.out.println("  index=0, arr[0]=1");
            System.out.println();

            System.out.println("  → 선택 1: 1을 포함");
            System.out.println("    호출 2: findSubsets(arr, 1, [1])");
            System.out.println("      index=1, arr[1]=2");
            System.out.println();

            System.out.println("      → 선택 1-1: 2를 포함");
            System.out.println("        호출 3: findSubsets(arr, 2, [1,2])");
            System.out.println("          index=2 == arr.length");
            System.out.println("          ✓ 결과: [1,2]");
            System.out.println();

            System.out.println("      → 선택 1-2: 2를 미포함");
            System.out.println("        호출 4: findSubsets(arr, 2, [1])");
            System.out.println("          index=2 == arr.length");
            System.out.println("          ✓ 결과: [1]");
            System.out.println();

            System.out.println("  → 선택 2: 1을 미포함");
            System.out.println("    호출 5: findSubsets(arr, 1, [])");
            System.out.println("      index=1, arr[1]=2");
            System.out.println();

            System.out.println("      → 선택 2-1: 2를 포함");
            System.out.println("        호출 6: findSubsets(arr, 2, [2])");
            System.out.println("          index=2 == arr.length");
            System.out.println("          ✓ 결과: [2]");
            System.out.println();

            System.out.println("      → 선택 2-2: 2를 미포함");
            System.out.println("        호출 7: findSubsets(arr, 2, [])");
            System.out.println("          index=2 == arr.length");
            System.out.println("          ✓ 결과: []");
            System.out.println();

            System.out.println("최종 부분집합: [1,2], [1], [2], []");
        }
    }


    // ===== 결과 모음: List에 저장 =====
    static class CollectResults {

        public static List<List<Integer>> findAllSubsets(int[] arr) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(arr, 0, new ArrayList<>(), result);
            return result;
        }

        private static void backtrack(int[] arr, int index,
                                      List<Integer> current,
                                      List<List<Integer>> result) {
            if (index == arr.length) {
                result.add(new ArrayList<>(current));  // 복사본 저장!
                return;
            }

            // 포함
            current.add(arr[index]);
            backtrack(arr, index + 1, current, result);

            // 미포함
            current.remove(current.size() - 1);
            backtrack(arr, index + 1, current, result);
        }
    }


    // ===== 메인: 모든 수준 실행 =====
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("===== 수준 1: 기본 (아무것도 안 함) =====");
        Level1_Basic.findSubsets_v1(arr, 0, new ArrayList<>());
        System.out.println("결과: {} (공집합만)\n");


        System.out.println("===== 수준 2: 모두 포함 =====");
        Level2_WithInclusion.findSubsets_v2(arr, 0, new ArrayList<>());
        System.out.println("결과: {1,2,3} (전체만)\n");


        System.out.println("===== 수준 3: 완전한 버전 (정답!) =====");
        Level3_Complete.findSubsets_v3(arr, 0, new ArrayList<>());
        System.out.println();


        System.out.println("===== 시각적 추적 (들여쓰기 포함) =====\n");
        VisualizationWithTrace.findSubsets_withTrace(new int[]{1, 2}, 0, new ArrayList<>());
        System.out.println();


        System.out.println("===== 수동 추적 (이해용) =====\n");
        ManualTrace.manualTraceExample();
        System.out.println();


        System.out.println("===== 결과를 List에 모으기 =====");
        List<List<Integer>> results = CollectResults.findAllSubsets(new int[]{1, 2, 3});
        System.out.println("모든 부분집합:");
        for (List<Integer> subset : results) {
            System.out.println(subset);
        }
    }
}