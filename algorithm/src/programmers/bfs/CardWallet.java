package programmers.bfs;

public class CardWallet {
    /*
    *      1. 명함 지갑
    *       - URL : https://school.programmers.co.kr/learn/courses/30/lessons/86491
    *       - 난이도 : Level 1
    *       - 걸린 시간 : 30분
    *       - 풀지 못한 이유 : 지갑의 최소 넓이를 구하라 하여 최솟값 구하는 문제로 생각함
    *       - 풀이 횟수 : 1
    *       - 핵심 : 가로/세로면이 회전할 수 있음(가로,세로 정규화하여 각 최대값을 구하여 계산해야함)
    *       - 시간 복잡도 : O(n)
    *       - 배운 점 & 팁 : Math 메소드를 이용하여 최대/최소 값 구할 수 있음
    * */

    // 전체 풀이 코드
    public int cardWallet(int[][] sizes){
        int answer = 0;

        int maxW = 0;   // 가장 큰 가로 크기
        int maxH = 0;   // 가장 큰 세로 크기

        for(int i = 0; i < sizes.length; i++){  // 명함 수 만큼 반복
            int w = sizes[i][0];    // 명함의 가로 값
            int h = sizes[i][1];    // 명함의 세로 값

            // 정규화 과정
            int width = Math.max(w,h); // 명함의 가로/세로 중 가장 긴 길이를 가로로
            int height = Math.min(w,h); // 명함의 가로/세로 중 가장 짧은 길이를 세로로

            maxW = Math.max(maxW,width); // 가진 명함 중 가장 긴 가로 길이
            maxH = Math.max(maxH,height); // 가진 명함 중 가장 긴 세로 길이

        }

        answer = maxH * maxW;   // 최소한의 명함 크기

        return answer;
    }
}
