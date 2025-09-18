package baseball_game;
import static baseball_game.BaseBallGame.computer;
import static baseball_game.BaseBallGame.user;
public class OutFunc {
	 public static int getOut() {
	    	int out = 0;
	        for (int i = 0; i < 3; i++) {
		        	boolean found = false;
		        	
		        	// 유저 숫자가 컴퓨터 숫자에 있는지 확인
		        	for (int j = 0; j < 3; j++) {
			        		if(user[i] == computer[j]) {
			        		found = true;
			        		break;
		        		}
		        	}
		        	
		        	// 한 자리 숫자가 아예 없으면 out++
		        	if(!found) {
		        		out++;
		        	}
	        }
	        System.out.println("아웃: "+ out);
			return out;
	    }
}
