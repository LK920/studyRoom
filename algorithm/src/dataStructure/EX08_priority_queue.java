package dataStructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class EX08_priority_queue {
    /*
    *   8. 우선순위 큐
    *   - 일반 큐와 달리 우선순위가 높은 것부터 나옴
    *   - 비유 : 병원 대기열
    *       - 일반 대기 환자 : 들어온 순서대로 처리
    *       - 응급 환자 : 우선 처리
    *   - fifo 아님
    *   - 최소 힙 기본 (작은 값이 우선순위가 높음)
    *   - 추가 / 삭제 : O(log n)
    *   - 조회 : O(1)
    *   - 우선 순위 기준 커스텀마이징 가능(Comparator)
    *   - 사용 시나리오
    *       - 작업 스케줄링(우선 순위가 높은 순)
    *       - 다익스트라 알고리즘(최단 경로)
    *       - 허프만 코딩(압축)
    *       - kth Largest Element 찾기 ? :
    * */

    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 추가 - add, offer
        pq.add(1);
        pq.add(8);
        pq.add(7);
        pq.add(77);
        System.out.println(pq);
        pq.offer(20);
        System.out.println(pq);

        // 조회
        int value = pq.peek();
        System.out.println("가장 우선순위가 높은 값 조회 : " + value);

        // 삭제
        int poll = pq.poll();
        System.out.println("poll은 우선순위가 높은 값을 가져온 후 삭제 : " + poll);
        System.out.println(pq);

        // 확인
        boolean isEmpty = pq.isEmpty();
        System.out.println("확인 : " + isEmpty);
        int size = pq.size();
        System.out.println("크기 : " + size);

        System.out.println("======= 우선순위 역순 ======");
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        // 또는: new PriorityQueue<>((a, b) -> b - a);
        maxPq.add(1);
        maxPq.offer(22);
        System.out.println("역 우선 순위 : " + maxPq);
        System.out.println("가장 높은 값 : " + maxPq.poll());

        System.out.println("===== 커스텀 우선 순위 =======");
        PriorityQueue<String> stringPq = new PriorityQueue<>(
                (a,b) -> Integer.compare(a.length(), b.length())
        );

        stringPq.add("apple");
        stringPq.offer("b");
        stringPq.offer("programming");

        System.out.println("가장 짧은 길이 : " + stringPq.poll());

    }

}
