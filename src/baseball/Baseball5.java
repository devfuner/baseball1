package baseball;


import java.util.*;

public class Baseball4 {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("            야구게임          ");
        System.out.println("============================");

        List<Integer> num = new ArrayList<>();
        Random ra = new Random();
        for (int i = 0; i < num.size(); i++) {
            num.add(i) = ra.nextInt(10);
        }
        System.out.println("컴퓨터가 정한 숫자 > " + num);

        //사용자가 입력할 숫자
        List<Integer> guess = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < num.size(); i++) {
                System.out.println("숫자를 입력하세요 > ");
                guess.add(sc.nextInt());
            }
            System.out.println("입력한 숫자 > " + guess);

            //중복확인 검사
            Set<Integer> setGuess = new HashSet<>(guess);
            if(setGuess.size() < 3){
                System.out.println("중복된 숫자입니다.");
                guess.clear();
            }

            // 스트라이크, 볼 확인
            int strikeCount = 0;
            int ballCount = 0;

            for (int i = 0; i < num.size(); i++) {
                for (int j = 0; j < guess.size(); j++) {
                    if(i == j){
                        if(num.get(i) == guess.get(j)){
                            strikeCount += 1;
                        }
                    }else if(num.get(i) == guess.get(j)){
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