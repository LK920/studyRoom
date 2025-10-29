package algorithm_theory.binarySearch;

public class Ex01_binaryBasicSearch {
    /*
    *   02. 이진탐색이란? binarySearch
    *   - "정렬된" 배열에서만 사용 가능
    *   - 중간 값과 비교해서 절반씩 줄여가면 탐색
    *   - 시간복잡도 : O(log N) (엄청 빠름)
    *   - 완전 탐색 vs 이진 탐색
    *       - n = 1_000_000;
    *       - 완전 탐색 : O(n) => 백만건 탐색
    *       - 이진 탐색 : O(log n) => 20건 탐색
    * */
    public static void main(String[] args){
        int[] arr = {11,22,37,48,50,63,74,82,99,103};
        int target = 63;
        int targetIndex = binarySearch(arr, target);
        System.out.println("target Index : " + targetIndex);
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0; // 왼쪽 인덱스 시작부분
        int right = arr.length - 1; // 오른쪽 인덱스 시작부분

        while (left <= right){  // 왼쪽 인덱스 시작과 오른쪽 인덱스 시작이 만나는 부분까지 탐색
            int mid = (left + right) / 2; // 탐색 시작하는 범위의 중간 인덱스
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1; //
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
