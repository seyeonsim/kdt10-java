package _01_basic_syntax;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 실습. 기본 실습
        System.out.println("이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();
        System.out.println("안녕하세요! " + name + "님(" + age + "세)");

        // 리더님 답안 - printf 활용
        System.out.printf("안녕하세요~ %s님(%d세)", name, age);

        scanner.close();

    }
}
