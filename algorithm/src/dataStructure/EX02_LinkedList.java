package dataStructure;

import java.util.LinkedList;

public class EX02_LinkedList {
    /*
    *   2. LinkedList
    *   - 연속되어 보이는 배열
    *   - 데이터를 논리적으로 연결시켜서 마치 연결된 것처럼 사용할 수는 있지만
    *   -  실제 컴퓨터 메모리 공간 상에서는 연속적인 공간을 차지하고 있는 것은 아니다.
    *   - 중간에 추가 / 삭제가 빠름 O(1) ->  연결만 끊고 다시 연결하면 됨
    *   - 특정 위치 접근이 느림 O(n) -> 메모리상 흩어져 있기 때문
    */

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        // 추가
        list.add(10);   // 끝에 추가 [10]
        System.out.println("배열 추가 : " + list);
        list.add(20);   // [10, 20]
        System.out.println("배열 끝에 추가 : " + list);
        list.add(0,5); // 인덱스 0에 추가 [5,10,20]
        System.out.println("인덱스 0에 추가 : " + list);
        list.addFirst(1);   // 배열 맨 앞에 추가 [1,5,10,20]
        System.out.println("배열 맨 앞에 추가 : " + list);
        list.addLast(22);   // 배열 맨 마지막에 추가 [1,5,10,22]
        System.out.println("배열 맨 뒤에 추가 : " + list);
        System.out.println("=============================");

        // 조회
        int value = list.get(2);
        System.out.println("인덱스 2의 값 : " + value);
        int size = list.size();
        System.out.println("배열 사이즈 : " + size);
        int idx = list.indexOf(1);
        System.out.println("값 1의 인덱스 : " + idx);
        int first = list.getFirst();
        System.out.println("배열 맨 앞 값 : " + first);
        int last = list.getLast();
        System.out.println("배열 맨 뒤 값 : " + last);
        System.out.println("=============================");

        // 삽입
        list.set(0,24);
        System.out.println("삽입 : " + list);
        System.out.println("=============================");

        // 삭제
        int test = list.remove(); // 첫 번째 값 삭제
        System.out.println("배열 첫번째 값 삭제 : " + test);
        list.remove(2); // 인덱스 2를 삭제
        System.out.println("인덱스 2 삭제 : " + list);
        list.removeFirst();
        System.out.println("배열 맨 앞에 삭제 : " + list);
        list.removeLast();
        System.out.println("배열 맨 뒤에 삭제 : " + list);
        System.out.println("=============================");

        // 검색
        boolean exists = list.contains(10);
        System.out.println("10값이 존재하는지 : " + exists);

    }

}
