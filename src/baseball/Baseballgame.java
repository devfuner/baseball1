package baseball;

import java.util.Scanner;

public class Baseballgame {
    public static void main(String[] args) {

        System.out.println("=========================");
        System.out.println("=========================");

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        System.out.println("컴퓨터가 정한 숫자");
        System.out.println(num1 + "" + num2 + "" + num3);

        //입력받을 숫자
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하시오 > ");
            int a = scanner.nextInt();
            System.out.println("숫자를 입력하시오 > ");
            int b = scanner.nextInt();
            System.out.println("숫자를 입력하시오 > ");
            int c = scanner.nextInt();

            int strikeCount = 0;
            int ballCount = 0;

            //같은 숫자 입력확인
            if (a == b || b == c || c == a)
                System.out.println("같은 숫자를 입력했습니다.");
            //스트라이크, 볼 확인
            if (num1 == a) {
                strikeCount += 1;
                System.out.println("스트라이크입니다.");
            } else if (num1 == b || num1 == c) {
                ballCount += 1;
                System.out.println("볼입니다.");
            }
            if (num2 == b) {
                strikeCount += 1;
                System.out.println("스트라이크입니다.");
            } else if (num2 == a || num2 == c) {
                ballCount += 1;
                System.out.println("볼입니다.");
            }
            if (num3 == c) {
                strikeCount += 1;
                System.out.println("스트라이크입니다.");
            } else if (num3 == a || num3 == b) {
                ballCount += 1;
                System.out.println("볼입니다.");
            }
            System.out.println("스트라이크 >" + strikeCount);
            System.out.println("볼 > " + ballCount);
            if(strikeCount == 3){
                System.out.println("3스트라이크");
                break;
            }
        }
    }

}