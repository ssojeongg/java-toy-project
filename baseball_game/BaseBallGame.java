package baseball_game;
import static baseball_game.BallFunc.getBall;
import static baseball_game.OutFunc.getOut;
import static baseball_game.StrikeFunc.getStrike;
import static baseball_game.ComputerUser.userFunc;
import static baseball_game.ComputerUser.computerFunc;
import java.util.Scanner;

public class BaseBallGame {
	static int[] computer = new int[3];
    static int[] user = new int[3];
    public static void main(String[] args) {
    	computerFunc();
    	while (true) {
    	    userFunc();
    	    getBall();
    	    getOut();

    	    if (getStrike() == 3) { // 정답 조건
    	        System.out.println("정답! 게임 종료");
    	        break;
    	    }
    	}
    }
   
}
