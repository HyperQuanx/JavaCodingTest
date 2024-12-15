package org.example;

import java.util.*;

public class Study {
    public void collectionOperations() {
        // 1. List 인터페이스
        List<String> arrayList = new ArrayList<>();  // ArrayList 선언
        arrayList.add("Apple");  // 요소 추가
        arrayList.add("Banana");
        arrayList.add(1, "Orange");  // 특정 인덱스에 요소 추가
        String firstElement = arrayList.get(0);  // 요소 접근
        arrayList.set(0, "Grapes");  // 요소 변경
        arrayList.remove("Banana");  // 요소 제거
        int size = arrayList.size();  // 리스트 크기
        boolean contains = arrayList.contains("Apple");  // 요소 포함 여부
        arrayList.clear();  // 모든 요소 제거

        // 2. Set 인터페이스
        Set<String> hashSet = new HashSet<>();  // HashSet 선언
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // 중복된 요소는 추가되지 않음
        boolean isEmpty = hashSet.isEmpty();  // 비어있는지 확인
        hashSet.remove("Banana");  // 요소 제거

        // 3. Map 인터페이스
        Map<String, Integer> hashMap = new HashMap<>();  // HashMap 선언
        hashMap.put("Apple", 1);  // 키-값 쌍 추가
        hashMap.put("Banana", 2);
        int value = hashMap.get("Apple");  // 키로 값 가져오기
        hashMap.remove("Banana");  // 키로 항목 제거
        boolean hasKey = hashMap.containsKey("Apple");  // 키 포함 여부
        boolean hasValue = hashMap.containsValue(1);  // 값 포함 여부
        Set<String> keys = hashMap.keySet();  // 모든 키 가져오기
        Collection<Integer> values = hashMap.values();  // 모든 값 가져오기

        // 4. Queue 인터페이스
        Queue<String> queue = new LinkedList<>();  // LinkedList로 Queue 선언
        queue.offer("Apple");  // 요소 추가
        queue.offer("Banana");
        String head = queue.peek();  // 첫 요소 확인 (제거하지 않음)
        String removed = queue.poll();  // 첫 요소 제거 및 반환

        // 5. Deque 인터페이스
        Deque<String> deque = new ArrayDeque<>();  // ArrayDeque 선언
        deque.addFirst("Apple");  // 앞에 요소 추가
        deque.addLast("Banana");  // 뒤에 요소 추가
        String first = deque.removeFirst();  // 앞의 요소 제거 및 반환
        String last = deque.removeLast();  // 뒤의 요소 제거 및 반환

        // 6. Stack 클래스
        Stack<String> stack = new Stack<>();  // Stack 선언
        stack.push("Apple");  // 요소 추가
        stack.push("Banana");
        String top = stack.peek();  // 최상위 요소 확인 (제거하지 않음)
        String popped = stack.pop();  // 최상위 요소 제거 및 반환

        // 7. Collections 유틸리티 클래스
        Collections.sort(arrayList);  // 리스트 정렬
        Collections.reverse(arrayList);  // 리스트 역순 정렬
        int frequency = Collections.frequency(arrayList, "Apple");  // 특정 요소 빈도수
        Collections.shuffle(arrayList);  // 리스트 요소 섞기
        String maxElement = Collections.max(arrayList);  // 최대 요소
        String minElement = Collections.min(arrayList);  // 최소 요소
    }
}
