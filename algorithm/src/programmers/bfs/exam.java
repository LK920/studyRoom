package programmers.bfs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class exam {
    static int[][] supoja = {
        {1,2,3,4,5},
        {2,1,2,3,2,4,2,5},
        {3,3,1,1,2,2,4,4,5,5}
    };

    public static void main(String[] args) {
        int[] answer = solution(new int[]{1, 2, 3, 4, 5});
        System.out.printf("[");
        for(int a : answer){
            System.out.printf(a + " ");
        }
        System.out.printf("]");
    }

    public static int[] solution(int[] answers){
        int[] answer = {};
        int[] score = new int[supoja.length]; // 수포자별 점수

        // 각 수포자 패턴과 비교하여 정답 개수 누적
        for (int i = 0; i < answers.length ; i++) {
            for(int j = 0; j < supoja.length; j++){

                int pattern = i % supoja[j].length; // 각 수포자별 답변과 매칭하는 인덱스 구하기
                if(answers[i] == supoja[j][pattern]){ // 답과 일치할 때 수포자별 점수 추가
                    score[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(score).max().getAsInt(); // 최고점 구하기
        // 최고점 배열로 리턴
        answer = IntStream.range(0,score.length).filter(i -> score[i] == maxScore)
                .map(i -> i + 1).toArray();
        return answer;
    }
}
