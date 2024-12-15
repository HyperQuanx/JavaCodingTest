package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Study_Java4_Method_Array {
    public void arrayOperations() {
        // 1. 배열 선언과 초기화
        int[] intArray = new int[5];  // 크기가 5인 정수 배열 선언
        int[] initializedArray = {1, 2, 3, 4, 5};  // 초기화와 함께 선언

        // 2. 배열 요소 접근
        int firstElement = initializedArray[0];  // 첫 번째 요소 접근
        initializedArray[1] = 10;  // 두 번째 요소 변경

        // 3. 배열 길이
        int length = initializedArray.length;  // 배열의 길이 반환

        // 4. 배열 순회
        for (int i = 0; i < initializedArray.length; i++) {
            System.out.println(initializedArray[i]);  // 인덱스를 사용한 순회
        }

        for (int element : initializedArray) {
            System.out.println(element);  // 향상된 for문을 사용한 순회
        }

        // 5. 다차원 배열
        int[][] twoDArray = new int[3][3];  // 3x3 크기의 2차원 배열 선언
        int[][] initializedTwoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  // 초기화와 함께 선언

        // 6. 다차원 배열 요소 접근
        int element = initializedTwoDArray[1][2];  // 두 번째 행, 세 번째 열의 요소 접근

        // 7. 배열 복사
        int[] copiedArray = Arrays.copyOf(initializedArray, initializedArray.length);  // 전체 배열 복사
        int[] partialCopy = Arrays.copyOfRange(initializedArray, 1, 4);  // 부분 배열 복사 (인덱스 1부터 3까지)

        // 8. 배열 정렬
        Arrays.sort(initializedArray);  // 배열 오름차순 정렬

        // 9. 배열 검색
        int index = Arrays.binarySearch(initializedArray, 3);  // 이진 검색 (정렬된 배열에서만 사용 가능)

        // 10. 배열 비교
        boolean areEqual = Arrays.equals(initializedArray, copiedArray);  // 두 배열의 요소가 같은지 비교

        // 11. 배열 채우기
        Arrays.fill(intArray, 1);  // 모든 요소를 1로 채우기

        // 12. 배열을 문자열로 변환
        String arrayString = Arrays.toString(initializedArray);  // 배열을 문자열로 변환

        // 13. 배열을 리스트로 변환
        List<Integer> arrayList = Arrays.stream(initializedArray).boxed().collect(Collectors.toList());

        // 14. 리스트를 배열로 변환
        Integer[] listToArray = arrayList.toArray(new Integer[0]);

        // 15. 병렬 정렬 (Java 8+)
        Arrays.parallelSort(initializedArray);  // 병렬 정렬

        // 16. 배열의 모든 요소에 함수 적용 (Java 8+)
        Arrays.setAll(intArray, i -> i * 2);  // 각 요소에 람다식 적용

        // 17. 배열의 누적 합 계산 (Java 8+)
        Arrays.parallelPrefix(initializedArray, Integer::sum);  // 누적 합 계산

        // 18. 다차원 배열의 깊은 비교
        int[][] anotherTwoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean deepEqual = Arrays.deepEquals(initializedTwoDArray, anotherTwoDArray);  // 다차원 배열의 깊은 비교

        // 19. 다차원 배열을 문자열로 변환
        String deepArrayString = Arrays.deepToString(initializedTwoDArray);  // 다차원 배열을 문자열로 변환

        // 20. 배열의 스트림 생성 (Java 8+)
        Arrays.stream(initializedArray).forEach(System.out::println);  // 배열을 스트림으로 변환하여 순회


        // 추가설명
        // 배열 선언과 초기화: 배열은 고정된 크기로 선언되며, 초기화 시 크기를 지정하거나 값을 직접 할당할 수 있습니다.
        // 배열 요소 접근: 배열의 요소는 인덱스를 통해 접근하며, 인덱스는 0부터 시작합니다.
        // 배열 순회: for 루프와 향상된 for 루프를 사용하여 배열을 순회할 수 있습니다.
        // 다차원 배열: 배열의 배열로, 행과 열로 구성된 2차원 배열을 포함하여 여러 차원의 배열을 생성할 수 있습니다.
        // 배열 복사: Arrays.copyOf와 Arrays.copyOfRange를 사용하여 배열을 복사할 수 있습니다.
        // 배열 정렬: Arrays.sort는 배열을 오름차순으로 정렬합니다.
        // 배열 검색: Arrays.binarySearch는 정렬된 배열에서 이진 검색을 수행합니다.
        // 배열 비교: Arrays.equals는 두 배열의 요소가 같은지 비교합니다.
        // 배열 채우기: Arrays.fill은 배열의 모든 요소를 특정 값으로 채웁니다.
        // 배열 변환: 배열을 문자열로 변환하거나 리스트로 변환할 수 있습니다.
        // 병렬 정렬: Arrays.parallelSort는 배열을 병렬로 정렬하여 성능을 향상시킵니다.
        // 함수 적용: Arrays.setAll은 배열의 각 요소에 함수를 적용합니다.
        // 누적 합 계산: Arrays.parallelPrefix는 배열의 누적 합을 계산합니다.
        // 다차원 배열의 깊은 비교: Arrays.deepEquals는 다차원 배열의 요소를 깊이 비교합니다.
        // 스트림 생성: Arrays.stream은 배열을 스트림으로 변환하여 다양한 스트림 연산을 수행할 수 있습니다.
        


    }
}
