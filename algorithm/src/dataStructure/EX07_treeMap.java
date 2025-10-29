package dataStructure;

import java.util.Map;
import java.util.TreeMap;

public class EX07_treeMap {
    /*
    *   07. treeMap -
    *   - 키, 값 저장 + 정렬
    *   - 키가 자동으로 오름차순정렬(기본값)
    *   - null 키 불허 (값은 가능)
    *   - 범위 검색 가능 (특정 범위의 키 찾기)
    *   - 사용 시나리오
    *       - 정렬된 데이터가 필요할 때
    *       - 범위 검색 (1000 ~ 2000 사이의 키 모두 찾기)
    *       - 최댓값 / 최솟값 빠르게 찾기
    *   - 시간복잡도 O(logN)
    * */
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // 추가
        treeMap.put(5, "Five");
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        System.out.println("treeMap 값 추가 : " + treeMap); // {(1,one), (3,three), (5,five)}

        // 조회
        String value = treeMap.get(3);
        System.out.println("키로 조회 get() : " + value);
        Map.Entry<Integer, String> firstEntry  = treeMap.firstEntry();
        System.out.println("firstEntry 조회 : " + firstEntry);
        Map.Entry<Integer, String> lastEntry = treeMap.lastEntry();
        System.out.println("lastEntry 조회 : " + lastEntry);
        int firstKey = treeMap.firstKey();
        int lastKey = treeMap.lastKey();
        System.out.println("first/lastKey 조회 : "+ firstKey + " / " + lastKey);
        // 수정 가능
        treeMap.put(3, "three");
        // 범위 조회
        Map<Integer, String> subMap = treeMap.subMap(1, 3); // 1<= key < 4
        System.out.println("subMap(starKey, endKey), 범위 startKey <= key < endKey : " + subMap);
        Map<Integer, String> headMap = treeMap.headMap(3); // < 3
        System.out.println("headMap(endKey), 범위 key < endKey : " + headMap);
        Map<Integer, String> tailMap = treeMap.tailMap(3); // >= 3
        System.out.println("tailMap(startKey), 범위 key >= startKey : " + tailMap);

        treeMap.remove(1);
        System.out.println("remove(), 해당키 삭제 : " + treeMap);

        // 반복 (정렬 순서대로)
        for(Integer key : treeMap.keySet()){
            System.out.println(key + " -> " + treeMap.get(key));
        }

    }
}
