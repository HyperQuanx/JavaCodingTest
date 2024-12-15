package org.example;

public class Study_Java3_Method_Math {
    public void mathOperations() {
        // 1. 기본 산술 연산
        int a = 10;
        int b = 3;
        int sum = a + b;  // 덧셈
        int difference = a - b;  // 뺄셈
        int product = a * b;  // 곱셈
        int quotient = a / b;  // 나눗셈 (정수 나눗셈)
        int remainder = a % b;  // 나머지

        // 2. 부동 소수점 산술 연산
        double x = 10.5;
        double y = 3.2;
        double sumDouble = x + y;  // 덧셈
        double differenceDouble = x - y;  // 뺄셈
        double productDouble = x * y;  // 곱셈
        double quotientDouble = x / y;  // 나눗셈

        // 3. 절대값
        int absInt = Math.abs(-10);  // 정수의 절대값
        double absDouble = Math.abs(-10.5);  // 실수의 절대값

        // 4. 최대값과 최소값
        int max = Math.max(10, 20);  // 두 값 중 큰 값
        int min = Math.min(10, 20);  // 두 값 중 작은 값

        // 5. 거듭제곱
        double power = Math.pow(2, 3);  // 2의 3제곱

        // 6. 제곱근
        double sqrt = Math.sqrt(16);  // 16의 제곱근

        // 7. 반올림, 올림, 내림
        long round = Math.round(10.5);  // 반올림
        double ceil = Math.ceil(10.1);  // 올림
        double floor = Math.floor(10.9);  // 내림

        // 8. 삼각 함수
        double sin = Math.sin(Math.PI / 2);  // 사인
        double cos = Math.cos(0);  // 코사인
        double tan = Math.tan(Math.PI / 4);  // 탄젠트

        // 9. 로그 함수
        double log = Math.log(10);  // 자연 로그
        double log10 = Math.log10(100);  // 밑이 10인 로그

        // 10. 난수 생성
        double random = Math.random();  // 0.0 이상 1.0 미만의 난수

        // 11. 부호 함수
        int signumInt = Math.signum(-10);  // 정수의 부호
        double signumDouble = Math.signum(-10.5);  // 실수의 부호

        // 12. 각도 변환
        double radians = Math.toRadians(180);  // 도를 라디안으로 변환
        double degrees = Math.toDegrees(Math.PI);  // 라디안을 도로 변환

        // 13. 하이퍼볼릭 함수
        double sinh = Math.sinh(1);  // 하이퍼볼릭 사인
        double cosh = Math.cosh(1);  // 하이퍼볼릭 코사인
        double tanh = Math.tanh(1);  // 하이퍼볼릭 탄젠트

        // 14. 정확한 덧셈과 곱셈 (오버플로우 체크)
        int addExact = Math.addExact(1000000, 2000000);  // 덧셈
        int multiplyExact = Math.multiplyExact(1000, 2000);  // 곱셈

        // 15. 나머지 연산
        int mod = Math.floorMod(-10, 3);  // 나머지 연산

        // 16. 제곱근의 반올림
        double sqrtRound = Math.rint(Math.sqrt(10));  // 제곱근의 반올림

        // 17. 다음 부동 소수점 값
        double nextUp = Math.nextUp(1.0);  // 주어진 값보다 큰 가장 작은 부동 소수점 값
        double nextDown = Math.nextDown(1.0);  // 주어진 값보다 작은 가장 큰 부동 소수점 값

        // 18. 비트 연산
        int bitAnd = a & b;  // 비트 AND
        int bitOr = a | b;  // 비트 OR
        int bitXor = a ^ b;  // 비트 XOR
        int bitNot = ~a;  // 비트 NOT
        int leftShift = a << 1;  // 왼쪽 시프트
        int rightShift = a >> 1;  // 오른쪽 시프트
        int unsignedRightShift = a >>> 1;  // 부호 없는 오른쪽 시프트

        // 19. 삼각 함수의 역함수
        double asin = Math.asin(1.0);  // 아크사인, 결과는 라디안
        double acos = Math.acos(0.0);  // 아크코사인, 결과는 라디안
        double atan = Math.atan(1.0);  // 아크탄젠트, 결과는 라디안

        // 20. 하이퍼볼릭 함수의 역함수
        double asinh = Math.log(1 + Math.sqrt(1 + 1));  // 아크하이퍼볼릭 사인
        double acosh = Math.log(1 + Math.sqrt(1 - 1));  // 아크하이퍼볼릭 코사인
        double atanh = 0.5 * Math.log((1 + 0.5) / (1 - 0.5));  // 아크하이퍼볼릭 탄젠트

        // 21. 부동 소수점 비교
        boolean isEqual = Double.compare(0.1 + 0.2, 0.3) == 0;  // 부동 소수점 비교

        // 22. 부동 소수점의 정밀도
        double ulp = Math.ulp(1.0);  // 1.0의 ULP (가장 작은 차이)

        // 23. 부동 소수점의 부호와 크기 분리
        double signum = Math.copySign(1.0, -0.0);  // 부호를 복사하여 크기와 결합

        // 24. 정수의 비트 개수
        int bitCount = Integer.bitCount(10);  // 10의 2진수에서 1의 개수

        // 25. 정수의 최고 비트 위치
        int highestOneBit = Integer.highestOneBit(10);  // 10의 2진수에서 가장 높은 비트

        // 26. 정수의 최저 비트 위치
        int lowestOneBit = Integer.lowestOneBit(10);  // 10의 2진수에서 가장 낮은 비트

        // 27. 정수의 부호 반전
        int negateExact = Math.negateExact(10);  // 10의 부호를 반전

        // 28. 정수의 덧셈 오버플로우 체크
        try {
            int safeAdd = Math.addExact(Integer.MAX_VALUE, 1);  // 오버플로우 발생
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred");
        }

        // 29. 정수의 곱셈 오버플로우 체크
        try {
            int safeMultiply = Math.multiplyExact(Integer.MAX_VALUE, 2);  // 오버플로우 발생
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred");
        }



        // 추가 설명
        // 기본 산술 연산: 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산은 가장 기본적인 연산입니다.
        // 부동 소수점 산술 연산: 실수 연산을 수행할 때 사용됩니다.
        // 절대값, 최대값, 최소값: Math.abs, Math.max, Math.min은 다양한 상황에서 사용됩니다.
        // 거듭제곱과 제곱근: Math.pow와 Math.sqrt는 지수와 루트 계산에 사용됩니다.
        // 반올림, 올림, 내림: Math.round, Math.ceil, Math.floor는 숫자를 정수로 변환할 때 유용합니다.
        // 삼각 함수와 로그 함수: Math.sin, Math.cos, Math.tan, Math.log, Math.log10은 수학적 계산에 필수적입니다.
        // 난수 생성: Math.random은 0과 1 사이의 난수를 생성합니다.
        // 부호 함수: Math.signum은 숫자의 부호를 반환합니다.
        // 각도 변환: Math.toRadians, Math.toDegrees는 각도 변환에 사용됩니다.
        // 하이퍼볼릭 함수: Math.sinh, Math.cosh, Math.tanh는 하이퍼볼릭 삼각 함수입니다.
        // 정확한 연산: Math.addExact, Math.multiplyExact는 오버플로우를 체크하며 연산을 수행합니다.
        // 나머지 연산: Math.floorMod는 나머지 연산을 수행합니다.
        // 부동 소수점 값: Math.nextUp, Math.nextDown은 부동 소수점의 다음 값을 찾습니다.
        // 비트 연산: 비트 연산은 비트 단위의 논리 연산을 수행합니다.
        // 삼각 함수의 역함수: Math.asin, Math.acos, Math.atan은 삼각 함수의 역함수를 계산합니다.
        // 하이퍼볼릭 함수의 역함수: Java에서는 직접적인 메서드는 없지만, 수학적 공식을 사용하여 계산할 수 있습니다.
        // 부동 소수점 비교: Double.compare는 부동 소수점의 정확한 비교를 위해 사용됩니다.
        // ULP (Unit in the Last Place): Math.ulp는 부동 소수점의 정밀도를 나타냅니다.
        // 부호와 크기 분리: Math.copySign은 부호를 복사하여 다른 숫자에 적용합니다.
        // 비트 연산: Integer.bitCount, Integer.highestOneBit, Integer.lowestOneBit는 비트 조작에 유용합니다.
        // 정수의 부호 반전: Math.negateExact는 정수의 부호를 반전합니다.
        // 오버플로우 체크: Math.addExact, Math.multiplyExact는 오버플로우를 체크하며 연산을 수행합니다.
    }
}
