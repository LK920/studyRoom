package dataStructure;

import java.util.ArrayList;

public class EX01_Arraylist {
    /*
        1. ArrayList
        - 자동으로 크기가 늘어나는 배열
        - 인덱스 접근가능 O(1)
        - 중간에 데이터 추가/삭제 시 느림 O(n) -> 뒤의 원소들을 다 밀어야함
        - 메모리 연속된 공간에 저장

    */
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 추가
        arrayList.add(1);       // 끝에 추가 [1]
        arrayList.add(20);      // [1, 20]
        arrayList.add(33);      // [1,20,33]
        arrayList.add(2, 3); // [1,20,3,33]
        System.out.println(arrayList);
        System.out.println("----------------------");
        // 조회
        int value = arrayList.get(0); // 인덱스 0 조회
        System.out.println("인덱스 0 : " + value);
        int size = arrayList.size(); // 배열 크기
        System.out.println("배열 크기 : " + size);
        System.out.println("----------------------");
        // 수정
        arrayList.set(1,100); // 인덱스 1의 값을 100으로 수정
        System.out.println("인덱스 1의 수정된 값 : " + arrayList);
        System.out.println("----------------------");
        // 삭제
        arrayList.remove(0); // 인덱스 0 삭제
        System.out.println("인덱스 0 삭제 : " + arrayList);
        arrayList.remove(Integer.valueOf(100)); // 값 100 삭제
        System.out.println("값이 100을 삭제 : " + arrayList);
        arrayList.clear(); // 배열 전체 삭제
        System.out.println("빈 배열 : " + arrayList);
        System.out.println("----------------------");

        // 검색
        arrayList.add(0,1);
        arrayList.add(1,2);
        boolean exists = arrayList.contains(10); // 값 10이 포함되어 있는가?
        int index = arrayList.indexOf(10);  // 값 10의 인덱스 값은 무엇인가?

        // 반복
        for(int i : arrayList){
            System.out.println(i);
        }
    }


}
