package baseball;

import java.util.Scanner;

public class Baseball2 {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("            야구게임          ");
        System.out.println("============================");

        int num1 = 5;
        int num2 = 8;
        int num3 = 4;
        System.out.println("컴퓨터가 정한 숫자 > " + num1 + "" + num2 + "" + num3);

        //사용자가 입력할 숫자
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하시오 > ");
            int a = sc.nextInt();
            System.out.println("숫자를 입력하시오 > ");
            int b = sc.nextInt();
            System.out.println("숫자를 입력하시오 > ");
            int c = sc.nextInt();

            //중복확인 검사
            if (a == b || b == c || c == a) {
                System.out.println("중복된 숫자입니다.");
            }

            // 스트라이크, 볼 확인
            int strikeCount = 0;
            int ballCount = 0;

            if (num1 == a) {
                strikeCount += 1;
            } else if (num1 == b || num1 == c) {
                ballCount += 1;
            }
            if (num2 == b) {
                strikeCount += 1;
            } else if (num2 == a || num2 == c) {
                ballCount += 1;
            }
            if (num3 == c) {
                strikeCount += 1;
            } else if (num3 == a || num3 == b) {
                ballCount += 1;
            }
            if (strikeCount == 3) {
                System.out.println(" 정답입니다. ");
                break;
            }
            int out = 3 - strikeCount - ballCount;
            System.out.println("스트라이크 > " + strikeCount);
            System.out.println("볼 > " + ballCount);
            System.out.println("아웃 > " + out);
        }
    }
}
