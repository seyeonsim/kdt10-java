package _02_control_statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 실습. 반복문 실습
        // 1부터 사용자가 입력한 숫자까지 출력하는 코드 작성
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }


        // 실습. 메소드 실습
        // 두 개의 매개변수를 입력 받아 사칙 연산한 값을 출력하는 메소드 만들기
        System.out.println("========");
        System.out.println("숫자 두 개를 입력하세요");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("덧셈 결과 : " + plus(a, b));
        System.out.println("뺄셈 결과 : " + minus(a, b));
        System.out.println("나눗셈 결과 : " + divide(a ,b));
        System.out.println("곱셈 결과 : " + mul(a, b));

        scanner.close();


        // 실습. 메소드 오버로딩 실습
        // 1. 원의 넓이를 계산하는 메서드: 원의 반지름을 인수로 받습니다.
        // 2. 직사각형의 넓이를 계산하는 메서드: 가로와 세로의 길이를 인수로 받습니다.
        // 3. 삼각형의 넓이를 계산하는 메서드: 밑변과 높이를 인수로 받습니다.
        System.out.println("========");
        System.out.println("반지름이 5인 원의 넓이 : " + calc(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이 : " + calc(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : " + calc(6, 3.0));

    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }


    ////////////////////////////////////////////

    public static double calc(int x) {
        return x * x * Math.PI;
    }

    public static double calc(int x, int y) {
        return x * y;
    }

    public static double calc(int x, double y) {
        return x * y / 2;
    }


}
