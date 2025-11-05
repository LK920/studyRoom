package programmers.bfs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MockExam {
    /*
    *   2. 모의 고사
    *       - URL : https://school.programmers.co.kr/learn/courses/30/lessons/42840?language=java
    *       - 난이도 : Level 1
    *       - 걸린 시간 : 30분
    *       - 풀지 못한 이유 : 패턴을 비교하는 방식에서 막힘
    *       - 풀이 횟수 : 1
    *       - 핵심 : 수포자의 패턴과 답을 비교하는 인덱스를 구해야함
    *       - 시간 복잡도 : O(n)
    *       - 배운 점 & 팁 : 문제 분석을 했을 때 빠르게 떠올라야 함
    */

    static int[][] supoja = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
    };

    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};
        int[] answer = solution(answers);
        for(int i : answer){
            System.out.printf(" " + i);
        }
    }
    public static int[] solution(int[] answers){
        int[] scores = new int[supoja.length];
        for(int i = 0; i < answers.length; i++){    // 답 일치를 위해 답의 길이만 큼 확인
            for (int j = 0; j <supoja.length ; j++) { // 수포자를 순회 -> 각 수포자별 답지 확인을 위해
                int supojaLen = supoja[j].length; // 수포자가 제출한 총 답지의 길이(패턴을 찾기 위해 필요)
                int patternIndex = i % supojaLen; // 수포자의 답지 중 정답의 인덱스와 동일한 비교군을 찾기 위해
                if(answers[i] == supoja[j][patternIndex]){
                    scores[j]++;
                }
            }
        }
        int maxScore = Arrays.stream(scores).max().getAsInt(); // 최고 점수 구하기

        int answer[] = IntStream.range(0, scores.length)    // 인트 스트림 범위 0, scores 길이만큼 생성
                .filter(i -> scores[i] == maxScore)     // i를 인자로 받음 람다식 : scores 인덱스별로 돌면서 최고 점수 만 구하기
                .map(i -> i + 1)     // 결과값이 0부터 시작이 아니라 1부터 시작이라 + 1 추가
                .toArray(); // 인트스트림을 최종적으로 배열 캐스트
        return answer;
    }
}
