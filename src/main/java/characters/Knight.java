package characters;
import java.util.Random;

import strategies.EliteKick;


public class Knight extends Character{
    private static Random RANDOM_GENERATOR = new Random();
    private static EliteKick kickBehaviour = new EliteKick();

    public Knight() {
        super(RANDOM_GENERATOR.nextInt(11)+2, RANDOM_GENERATOR.nextInt(11)+2);
    }

    @Override
    public void kick(Character chr) {
        kickBehaviour.kick(this, chr);
    }
}
