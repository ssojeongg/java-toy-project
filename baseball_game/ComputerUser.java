package baseball_game;
import static baseball_game.BaseBallGame.computer;
import static baseball_game.BaseBallGame.user;
import java.util.Scanner;

public class ComputerUser {
	 // 컴퓨터
    public static void computerFunc() {
        for (int i = 0; i < 3; i++) {
            int comNum = (int)(Math.random() * 9) + 1;
            computer[i] = comNum;
        }
    }
    
    // 유저
    public static void userFunc() {
    	Scanner scn = new Scanner(System.in);
        System.out.println("숫자야구게임!! 세자리 숫자를 입력해주세요.");
    	String userInput = scn.next();
    	
        for (int i = 0; i < 3; i++) {
             user[i] = userInput.charAt(i) - '0';
        }
    }
}
