package baseball_game;
import static baseball_game.BaseBallGame.computer;
import static baseball_game.BaseBallGame.user;

public class StrikeFunc {
    
    public static int getStrike() {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (computer[i] == user[i]) {
                strike++;
            }
        }
        System.out.println("스트라이크: " + strike);
        return strike;
    }
}