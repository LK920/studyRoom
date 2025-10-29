package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class EX04_queue {
    /*
    *   4. queue - 선입선출(fifo)
    *   - 추가와 삭제 빠름 O(1)
    *   - 대기열, BFS 알고리즘, 작업 스케줄링
    *   - Queue는 LinkedList로 구현
    * */
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer>  q2 = new LinkedList<>();
        // 추가
        queue.add(10);         // 큐에 10추가 (용량 초과 시 예외 발생)
        queue.offer(20);    // 큐에 20 추가 (실패 시 false 반환)

        // 삭제 및 조회
        int front = queue.peek();       // 앞 쪽 값 조회 (제거 안함, 비어있으면 null)
        int front2 = queue.element();   // 앞 쪽 값 조회 (제거 안함, 비어있으면 예외)
        System.out.println("앞쪽 값 조회 : " + front);
        System.out.println("앞쪽 값 조회2 : " + front2);

        // 삭제
        int removed = queue.poll();     // 앞 쪽 제거하고 반환(비어있으면 null)
        int removed2 = queue.remove();  // 앞 쪽 제거하고 반환(비어있으면 예외)
        System.out.println(removed2);
        System.out.println(removed);

        // 확인
        boolean empty = queue.isEmpty();
        int size = queue.size();
        System.out.println("is empty ? " + empty);
        System.out.println("queue size : " + size);

    }
}
