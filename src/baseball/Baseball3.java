package baseball;

import java.util.Scanner;

public class Baseball3 {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("            야구게임          ");
        System.out.println("============================");

        int [] num = {5, 4, 8};
        System.out.println("컴퓨터가 정한 숫자 > " + num[0] + num[1] + num[2]);


        //사용자가 입력할 숫자
        Scanner sc = new Scanner(System.in);
        int [] guess = new int[3];
        while (true) {

            for (int i = 0; i < guess.length; i++) {
                System.out.println("숫자를 입력하세요 > ");
                guess[i] = sc.nextInt();
            }

            //중복확인 검사
            if (guess[0] == guess[1] || guess[1] == guess[2] || guess[2] == guess[0]) {
                System.out.println("중복된 숫자입니다.");
            }

            // 스트라이크, 볼 확인
            int strikeCount = 0;
            int ballCount = 0;

            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < guess.length; j++) {
                    if(i == j){
                        if(num[i] == guess[j]){
                            strikeCount += 1;
                        }
                    }else if(num[i] == guess[j]){
                        ballCount += 1;
                    }
                }
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