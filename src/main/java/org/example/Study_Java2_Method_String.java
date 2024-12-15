package org.example;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class Study_Java2_Method_String {
    public void stringMethods() {
        // 1. 문자열 길이
        String str = "Hello World";
        int length = str.length();  // 문자열의 길이를 반환합니다. 여기서는 11입니다.

        // 2. 문자열 자르기
        String substring = str.substring(0, 5);  // 문자열의 일부를 추출합니다. 여기서는 "Hello"입니다.

        // 3. 문자열 분할
        String[] split = str.split(" ");  // 문자열을 특정 구분자로 나눕니다. 여기서는 ["Hello", "World"]입니다.

        // 4. 문자열 치환
        String replaced = str.replace("l", "L");  // 특정 문자를 다른 문자로 바꿉니다. 여기서는 "HeLLo WorLd"입니다.

        // 5. 문자열 포함 여부
        boolean contains = str.contains("Hello");  // 문자열에 특정 문자열이 포함되어 있는지 확인합니다. 여기서는 true입니다.

        // 6. 문자열 시작/끝 확인
        boolean startsWith = str.startsWith("He");  // 문자열이 특정 문자열로 시작하는지 확인합니다. 여기서는 true입니다.
        boolean endsWith = str.endsWith("ld");     // 문자열이 특정 문자열로 끝나는지 확인합니다. 여기서는 true입니다.

        // 7. 대소문자 변환
        String upper = str.toUpperCase();  // 모든 문자를 대문자로 변환합니다. 여기서는 "HELLO WORLD"입니다.
        String lower = str.toLowerCase();  // 모든 문자를 소문자로 변환합니다. 여기서는 "hello world"입니다.

        // 8. 문자열 -> 문자 배열
        char[] charArray = str.toCharArray();  // 문자열을 문자 배열로 변환합니다.  

        // 9. 문자열 공백 제거
        String trimmed = str.trim();  // 문자열의 앞뒤 공백을 제거합니다.

        // 10. 문자열 반복 (Java 11+)
        String repeated = "abc".repeat(3);  // 문자열을 반복합니다. 여기서는 "abcabcabc"입니다.

        // 11. 문자열 결합
        String joined = String.join(", ", "apple", "banana", "orange");  // 여러 문자열을 특정 구분자로 결합합니다. 여기서는 "apple, banana, orange"입니다.
        String joined2 = String.join("-", Arrays.asList("a", "b", "c"));  // 리스트의 문자열을 결합합니다. 여기서는 "a-b-c"입니다.

        // 12. 문자열에서 특정 문자 위치 찾기
        int index = str.indexOf("o");  // 특정 문자의 첫 번째 위치를 찾습니다. 여기서는 4입니다.
        int lastIndex = str.lastIndexOf("o");  // 특정 문자의 마지막 위치를 찾습니다. 여기서는 7입니다.

        // 13. 특정 위치의 문자 가져오기
        char ch = str.charAt(0);  // 특정 위치의 문자를 가져옵니다. 여기서는 'H'입니다.

        // 14. 문자열 비교
        String str1 = "abc";
        String str2 = "def";
        int compare = str1.compareTo(str2);  // 두 문자열을 사전순으로 비교합니다. str1이 str2보다 앞에 있으면 음수, 같으면 0, 뒤에 있으면 양수를 반환합니다.

        // 15. 문자열이 비어있는지 확인
        boolean empty = "".isEmpty();  // 문자열이 비어있는지 확인합니다. 여기서는 true입니다.
        boolean blank = "  ".isBlank();  // 문자열이 공백으로만 이루어져 있는지 확인합니다. (Java 11+) 여기서는 true입니다.

        // 16. 공백 제거 (Java 11+)
        String stripped = "  hello  ".strip();  // 문자열의 앞뒤 공백을 제거합니다. trim보다 유니코드 공백 처리가 더 강력합니다.
        String stripLeading = "  hello  ".stripLeading();  // 문자열의 앞쪽 공백만 제거합니다.
        String stripTrailing = "  hello  ".stripTrailing();  // 문자열의 뒤쪽 공백만 제거합니다.

        // 17. 문자열 포맷팅
        String formatted = String.format("Name: %s, Age: %d", "John", 25);  // 문자열을 포맷팅합니다. 여기서는 "Name: John, Age: 25"입니다.

        // 18. 문자열을 숫자로 변환
        int num1 = Integer.parseInt("123");  // 문자열을 정수로 변환합니다.
        long num2 = Long.parseLong("123");  // 문자열을 긴 정수로 변환합니다.
        double num3 = Double.parseDouble("123.45");  // 문자열을 실수로 변환합니다.

        // 19. 숫자를 문자열로 변환
        String strNum1 = String.valueOf(123);  // 숫자를 문자열로 변환합니다.
        String strNum2 = Integer.toString(123);  // 숫자를 문자열로 변환합니다.

        // 20. StringBuilder를 사용한 문자열 조작
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        sb.reverse();  // 문자열을 뒤집습니다. 여기서는 "dlroW olleH"입니다.
        String result = sb.toString();  // StringBuilder를 문자열로 변환합니다.

        // 추가 StringBuilder 기능
        // 20-1. 문자열 삽입
        sb.insert(5, ",");  // 인덱스 5에 "," 삽입

        // 20-2. 문자열 삭제
        sb.delete(5, 6);  // 인덱스 5부터 6까지 삭제 (5 포함, 6 미포함)
        sb.deleteCharAt(0);  // 인덱스 0의 문자 삭제

        // 20-3. 문자열 변경
        sb.replace(0, 5, "Hi");  // 인덱스 0부터 5까지 "Hi"로 변경

        // 20-4. 용량과 길이
        int capacity = sb.capacity();  // 현재 용량 반환
        int length = sb.length();  // 현재 문자열의 길이 반환

        // 20-5. 용량 조정
        sb.ensureCapacity(100);  // 최소 용량을 100으로 설정
        sb.trimToSize();  // 현재 문자열 길이에 맞게 용량을 줄임

        // 20-6. 특정 위치의 문자 가져오기
        char ch = sb.charAt(0);  // 인덱스 0의 문자 반환

        // 20-7. 특정 위치의 문자 설정
        sb.setCharAt(0, 'H');  // 인덱스 0의 문자를 'H'로 설정

        // 20-8. 부분 문자열 가져오기
        String subStr = sb.substring(0, 5);  // 인덱스 0부터 5까지 부분 문자열 반환

        // 21. 문자열 대체 (정규 표현식 사용)
        String regexReplaced = str.replaceAll("l", "L");  // 정규 표현식을 사용하여 모든 "l"을 "L"로 바꿉니다.

        // 22. 문자열 대체 (첫 번째 매칭만)
        String firstReplaced = str.replaceFirst("l", "L");  // 첫 번째 "l"만 "L"로 바꿉니다.

        // 23. 문자열 비교 (대소문자 무시)
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello world");  // 대소문자를 무시하고 문자열을 비교합니다. 여기서는 true입니다.

        // 24. 문자열을 바이트 배열로 변환
        byte[] byteArray = str.getBytes();  // 문자열을 바이트 배열로 변환합니다.

        // 25. 문자열을 List로 변환
        List<String> list = Arrays.asList(str.split(" "));  // 문자열을 특정 구분자로 나누어 리스트로 변환합니다.

        // 26. 문자열을 Stream으로 변환 (Java 8+)
        str.chars().forEach(c -> System.out.println((char) c));  // 문자열을 Stream으로 변환하여 각 문자를 출력합니다.

        // 27. 문자열을 대문자로 변환 (Locale 지정)
        String upperLocale = str.toUpperCase(Locale.ROOT);  // 특정 로케일을 지정하여 대문자로 변환합니다.

        // 28. 문자열을 소문자로 변환 (Locale 지정)
        String lowerLocale = str.toLowerCase(Locale.ROOT);  // 특정 로케일을 지정하여 소문자로 변환합니다.

        // 29. 문자열을 정규 표현식으로 분할
        String[] regexSplit = str.split("\\s+");  // 정규 표현식을 사용하여 공백을 기준으로 문자열을 분할합니다.

        // 30. 문자열을 특정 패턴으로 포맷팅
        String formattedPattern = String.format("%1$s %2$tB %2$td, %2$tY", "Due date:", new Date());  // 날짜를 특정 패턴으로 포맷팅합니다.

        // 31. 문자열을 특정 구분자로 연결 (Collectors.joining)
        String joinedStream = Arrays.stream(split).collect(Collectors.joining(", "));  // Stream을 사용하여 문자열을 특정 구분자로 연결합니다.

        // 32. 문자열을 대칭인지 확인 (회문 검사)
        String palindrome = "madam";
        boolean isPalindrome = new StringBuilder(palindrome).reverse().toString().equals(palindrome);  // true

        // 33. 문자열을 정수로 안전하게 변환
        String numberStr = "123";
        try {
            int number = Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        // 34. 문자열을 특정 패턴으로 검사 (정규 표현식)
        String email = "example@test.com";
        boolean isValidEmail = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");  // 이메일 형식 검사

        // 35. 문자열을 특정 문자로 채우기
        String padded = String.format("%-10s", "pad");  // "pad       " (오른쪽으로 10칸 채우기)

        // 36. 문자열을 특정 길이로 자르기
        String longStr = "This is a very long string";
        String truncated = longStr.length() > 10 ? longStr.substring(0, 10) + "..." : longStr;  // "This is a ..."

        // 37. 문자열을 특정 구분자로 나누고, 각 요소를 트림
        String csv = " apple, banana , orange ";
        String[] fruits = Arrays.stream(csv.split(","))
                                .map(String::trim)
                                .toArray(String[]::new);  // ["apple", "banana", "orange"]

        // 38. 문자열을 특정 구분자로 나누고, 중복 제거
        String words = "apple banana apple orange";
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words.split(" ")));  // ["apple", "banana", "orange"]

        // 39. 문자열을 특정 구분자로 나누고, 빈 문자열 제거
        String mixed = "apple,,banana,,orange";
        String[] nonEmptyFruits = Arrays.stream(mixed.split(","))
                                        .filter(s -> !s.isEmpty())
                                        .toArray(String[]::new);  // ["apple", "banana", "orange"]

        // 40. 문자열을 특정 패턴으로 포맷팅 (날짜)
        LocalDate date = LocalDate.now();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));  // "2023-10-15"
    }





    // 추가 설명
    // repeat: Java 11부터 사용 가능하며, 문자열을 지정한 횟수만큼 반복하여 새로운 문자열을 생성합니다.
    // join: 여러 문자열을 특정 구분자로 결합할 때 사용합니다. 배열이나 리스트의 요소들을 하나의 문자열로 합칠 수 있습니다.
    // strip: trim과 유사하지만, 유니코드 공백 문자도 제거할 수 있습니다. stripLeading과 stripTrailing은 각각 문자열의 앞과 뒤의 공백만 제거합니다.
    // StringBuilder: 문자열을 효율적으로 조작할 수 있는 클래스입니다. 문자열을 자주 변경해야 할 때 사용하면 성능이 좋습니다.
    // replaceAll: 정규 표현식을 사용하여 문자열 내의 모든 매칭을 대체합니다.
    // replaceFirst: 정규 표현식을 사용하여 문자열 내의 첫 번째 매칭만 대체합니다.
    // equalsIgnoreCase: 대소문자를 무시하고 두 문자열을 비교합니다.
    // getBytes: 문자열을 바이트 배열로 변환합니다. 인코딩을 지정할 수도 있습니다.
    // chars: 문자열을 IntStream으로 변환하여 각 문자를 처리할 수 있습니다.
    // toUpperCase/toLowerCase (Locale 지정): 특정 로케일을 지정하여 대소문자 변환을 수행합니다.
    // split (정규 표현식): 정규 표현식을 사용하여 문자열을 분할합니다.
    // Collectors.joining: Stream API를 사용하여 문자열을 특정 구분자로 연결합니다.
    // 회문 검사: 문자열이 대칭인지 확인하는 방법으로, StringBuilder를 사용하여 문자열을 뒤집고 원래 문자열과 비교합니다.
    // 안전한 문자열 변환: parseInt와 같은 메서드를 사용할 때는 try-catch 블록을 사용하여 예외를 처리합니다.
    // 정규 표현식 검사: matches 메서드를 사용하여 문자열이 특정 패턴에 맞는지 검사할 수 있습니다. 예를 들어, 이메일 형식 검사에 유용합니다.
    // 문자열 채우기: String.format을 사용하여 문자열을 특정 길이로 채우거나 정렬할 수 있습니다.
    // 문자열 자르기: 긴 문자열을 특정 길이로 자르고, 필요에 따라 "..." 등을 추가하여 표시할 수 있습니다.
    // 문자열 트림 및 중복 제거: Stream API를 사용하여 문자열 배열의 각 요소를 트림하거나 중복을 제거할 수 있습니다.
    // 날짜 포맷팅: DateTimeFormatter를 사용하여 날짜를 특정 형식의 문자열로 변환할 수 있습니다.
    // 이러한 메서드와 기법들은 코딩테스트에서 문자열을 다루는 다양한 문제를 해결하는 데 도움이 될 것입니다. 각 메서드의 사용법을 잘 이해하고, 문제에 맞게 적절히 활용하세요.
}
