package baseball_game;
import static baseball_game.BaseBallGame.computer;
import static baseball_game.BaseBallGame.user;
public class BallFunc {
	public static int getBall() {
	       int ball = 0;
	       for(int i = 0; i < 3; i++) {
	    	   for (int j = 0; j < 3; j++) {
	    	   		// 같은 자리면 스트라이크라서 제외
	    	   		if(i == j) continue;
	    	   
	    	   		// 다른 자리에 같은 숫자가 있으면 볼
	    	   		if(computer[i] == user[j]) {
	    			   ball++;
	    		   }
	    	   }
	       }
	       System.out.println("볼: "+ ball);
	       return ball;
	    }
}
