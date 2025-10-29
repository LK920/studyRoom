package dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class EX05_deque {
    /*
    *   5. Deque - 양방향 큐
    *   - stack과 queue의 기능 모두 가짐
    *   - 양쪽 끝에서 추가 / 삭제 가능
    *   - 슬라이딩 윈도우, 팰린드롬 검사, 양쪽에서 동시에 처리해야할 작업
    *   - method
    *       addFirst(),removeFirst(), getFirst(), pollFirst()
    *       addLast(), removeLast(), getLast(), pollLast()
    *       size(), isEmpty(), contains()
    *       push()
    *       pop()
    *       peak()
    * */
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();  // LinkedArray() 가능

        // 앞쪽에 추가/제거
        deque.addFirst(10); // 앞에 추가
         deque.addFirst(12); // 앞에 추가
        // deque.addFirst(14); // 앞에 추가
        System.out.println(deque);
        deque.removeFirst();    // 앞에서 제거
        System.out.println(deque);
        deque.getFirst();   // 앞 값 조회 (비어있으면 예외)
        deque.pollFirst(); // 앞 값 제거하고 반환(비어있으면 Null)
        System.out.println(deque);

        // 뒤쪽 추가 / 제거
        deque.addLast(20);      // 뒤에 추가
        deque.addLast(10);      // 뒤에 추가
        System.out.println("deque 추가 : " + deque);
        int t = deque.getLast();        // 뒤쪽 값 조회
        System.out.println("뒤쪽 값 조회 : " + t);
        int a = deque.pollLast();       // 뒤쪽 값 제거하고 반환(비어있으면 Null)
        System.out.println("뒤쪽 값 제거 pollLast : " + a);
        System.out.println("뒤쪽 값 제거 pollLast : " + deque);
        deque.removeLast();     // 뒤쪽 값 제거 (비어있으면 예외)
        deque.clear();

        // 조회
        deque.addFirst(10);
        int size = deque.size();
        boolean isEmpty = deque.isEmpty();
        boolean contains = deque.contains(10);
        System.out.println("size : " + size + ",\nisEmpty : " + isEmpty + ",\ncontains : " + contains);

    }
}
