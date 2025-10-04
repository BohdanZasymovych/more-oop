package strategies;

import java.util.Random;

import characters.Character;
import characters.King;

public class EliteKick implements KickStrategy {
    private static Random randomGenerator = new Random();

    public void kick(Character whoKiks, Character whoIsKicked) {
        int damage = randomGenerator.nextInt(10) + getSkillScale(whoKiks);
        whoIsKicked.setHp(whoIsKicked.getHp() - damage);
    }

    private static int getSkillScale(Character chr) {
        if (chr instanceof King) {
            return 5;
        } else {
            return 2;
        }
    }
}
