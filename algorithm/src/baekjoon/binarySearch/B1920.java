package baekjoon.binarySearch;
import java.io.*;
import java.util.Arrays;

public class B1920 {
    /*
    *   1. 수 찾기
    *   - URL : https://www.acmicpc.net/problem/1920
    *   - 난이도 : 1단계
    *   - 풀이까지 걸린 시간 : 40분(못품)
    *       - 풀지 못한 이유 : 컨셉은 잘 잡았지만 배열 정렬 기억이 안났음
    *   - 핵심 아이디어 : 배열 정렬 및 이진탐색 구현
    *   - 시간 복잡도 : O((M + N)log n)
    *   - 배운 점 & 팁 : Arrays.sort(N) 오름차순 정렬, 이진탐색
    * */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1단계 : N 값 입력
        int length = Integer.parseInt(br.readLine());
        // 2단계 : 배열 N에 들어갈 N개의 값들 입력
        String[] strings = br.readLine().split(" ");
        int[] N = new int[length];
        for (int i = 0; i < length ; i++) {
            N[i] = Integer.parseInt(strings[i]);
        }
        // 3단계 : 배열 N을 오름차순으로 정렬(*중요)
        Arrays.sort(N);

        // 4단계 : M 입력
        int B = Integer.parseInt(br.readLine());
        String[] M = br.readLine().split(" ");

        for(String val : M){
            int result = binarySearch(N,Integer.parseInt(val));
            bw.write(result + "\n");
        }

        bw.flush();
        br.close();
        bw.flush();
    }

    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = (left + right) /2;
            if(arr[mid] == target){
                return 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return 0;
    }
}
