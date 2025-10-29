package dataStructure;

import java.util.Stack;

public class EX03_stack {
    /*
    *   3. STACK (FILO) -> deque(덱)을 사용할 것
    *   - 마지막에 들어온 값부터 나감
    *   - 추가(Push)와 삭제(pop)이 빠름 O(1)
    *   - 사용 예 : 뒤로 가기, 함수 호출 스택, 수식 계산
    */
    public static void main (String[] args){

        Stack<Integer> stack = new Stack<>();

        // 추가
        stack.push(10); // 10을 스택에 추가
        stack.push(11); // 10을 스택에 추가
        System.out.println("추가 push : " + stack);
        // 조회
        int value = stack.search(10); // 해당 위치값 반환(스택은 오른쪽부터 시작하는 위치가 1임)
        System.out.println(value + " : " + stack);
        int top = stack.peek(); // 제일 상단 즉, 마지막에 입력된 값 반환
        System.out.println("top 값 : " + top);
        int size = stack.size(); // 스택 크기
        System.out.println("size : " + size);

        // 삭제
        int removed = stack.pop(); // 제일 상단 제거 후 가져오기
        System.out.println("pop : " + removed);
        stack.add(0,22);
        System.out.println(stack);
        //확인
        boolean isEmpty = stack.isEmpty(); // 빈 스택인지 확인용
        System.out.println("빈 Stack 인가요? " + isEmpty);

    }
}
