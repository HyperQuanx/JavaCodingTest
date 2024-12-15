package org.example;

import java.util.*;

public class Study_Java1_Basic {
    // 1. 변수와 데이터 타입
    public void dataTypes() {
        // 기본 데이터 타입
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;
        float floatNum = 3.14f;
        double doubleNum = 3.14;
        boolean boolValue = true;
        char charValue = 'A';

        // 참조 데이터 타입
        String str = "Hello Java";
        Integer integerObj = 100;
        Double doubleObj = 3.14;
    }

    // 2. 연산자
    public void operators() {
        int a = 10, b = 5;
        
        // 산술 연산자
        int sum = a + b;      // 덧셈
        int diff = a - b;     // 뺄셈
        int mult = a * b;     // 곱셈
        int div = a / b;      // 나눗셈
        int mod = a % b;      // 나머지
        
        // 증감 연산자
        a++;    // 후위 증가
        ++a;    // 전위 증가
        b--;    // 후위 감소
        --b;    // 전위 감소
        
        // 비교 연산자
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
        
        // 논리 연산자
        boolean and = true && false;
        boolean or = true || false;
        boolean not = !true;
        
        // 비트 연산자
        int bitAnd = a & b;   // AND
        int bitOr = a | b;    // OR
        int bitXor = a ^ b;   // XOR
        int bitNot = ~a;      // NOT
        int leftShift = a << 1;   // 왼쪽 시프트
        int rightShift = a >> 1;  // 오른쪽 시프트
    }

    // 3. 제어문
    public void controlStatements() {
        int score = 85;
        
        // if-else 문
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        
        // switch 문
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            default:
                System.out.println("C");
        }
        
        // for 문
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        // while 문
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        
        // do-while 문
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        
        // for-each 문
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // 4. 배열
    public void arrays() {
        // 1차원 배열
        int[] numbers = new int[5];
        int[] initializedArray = {1, 2, 3, 4, 5};
        
        // 2차원 배열
        int[][] matrix = new int[3][3];
        int[][] initializedMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    }

    // 5. 컬렉션
    public void collections() {
        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        // Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        
        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
    }

    // 6. 예외처리
    public void exceptionHandling() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("기타 예외 발생");
        } finally {
            System.out.println("항상 실행");
        }
    }

    // 7. 클래스와 객체
    class Person {
        // 필드
        private String name;
        private int age;
        
        // 생성자
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // 메소드
        public void introduce() {
            System.out.println("I'm " + name + ", " + age + " years old.");
        }
    }

    // 8. 인터페이스
    interface Drawable {
        void draw();
        default void print() {
            System.out.println("Printing...");
        }
    }

    // 9. 추상 클래스
    abstract class Shape {
        abstract double getArea();
        
        void display() {
            System.out.println("This is a shape.");
        }
    }

    // 10. 제네릭
    class Box<T> {
        private T content;
        
        public void set(T content) {
            this.content = content;
        }
        
        public T get() {
            return content;
        }
    }

    // 11. 람다식과 스트림
    public void lambdaAndStream() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // 람다식
        numbers.forEach(n -> System.out.println(n));
        
        // 스트림
        int sum = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();
    }

    // 12. 열거형(Enum)
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // 13. 스레드
    public void threads() {
        // 스레드 생성 방법 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 running");
            }
        });
        
        // 스레드 생성 방법 2 (람다식 사용)
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 running");
        });
        
        thread1.start();
        thread2.start();
    }

    // 메인 메소드
    public static void main(String[] args) {
        Study study = new Study();
        study.dataTypes();
        study.operators();
        study.controlStatements();
        study.arrays();
        study.collections();
        study.exceptionHandling();
        study.lambdaAndStream();
        study.threads();
    }
}
