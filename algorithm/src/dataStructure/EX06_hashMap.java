package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class EX06_hashMap {
    /*
    *   06. 해시맵 - key, value
    *   - 키-값 쌍을 저장하는 자료구조
    *   - 키는 유일
    *   - 값은 중복 가능
    *   - 순서 보장 없음
    *   - null 키 1개, null 값 여러개 허용
    *   - 사용 시나리오
    *       - 단어 개수 세기
    *       - 빈도 계산
    * */
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 추가
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        System.out.println(" 추가 hashMap.put(key, value) :  " + hashMap);
        // 조회
        int value = hashMap.get("apple");
        System.out.println("조회 : get(key) : " + value);
        boolean existsKey = hashMap.containsKey("banana");
        System.out.println("키 존재 여부 containsKey(key) : " + existsKey );
        boolean existsValue = hashMap.containsValue(3);
        System.out.println("값 존재 여부 containsKey(value) : " + existsValue);
        int size = hashMap.size();
        System.out.println("해시 맵 크기 size() : " + size);

        // 수정
        hashMap.put("apple", 4); // 기존 키면 값이 업데이트
        hashMap.put("deer", 5); // 새로운 키면 추가
        System.out.println("hashMap.put() : " + hashMap);

        // 삭제
        hashMap.remove("deer"); // 키로 삭제
        System.out.println("deer 삭제 : " + hashMap);
        // hashMap.clear();            // 모두 삭제
        // System.out.println("전체 삭제 : " + hashMap);

        // 반복
        for(String key : hashMap.keySet()){
            System.out.println("키 : " + key );
        }
        for(int val : hashMap.values()){
            System.out.println("값 : " + val);
        }
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 기본값. 원래 저장된 키가 없을 경우 조회시 null 반환하는데 이를 등록한 기본 값을 반환하도록 변경
        System.out.println("기본값 없을 경우 : " + hashMap.get("orange"));
        int orDefault = hashMap.getOrDefault("orange", 0);
        // 똑같은 키를 몇번 조회했는지 등 필요할 때 계산하기 위한 임의의 키 기본값
        System.out.println(" orange 조회 기본값 : " + orDefault);

    }
}
