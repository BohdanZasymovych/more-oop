package characters;

import java.util.Random;

import strategies.EliteKick;

public class King extends Character{
    private static Random RANDOM_GENERATOR = new Random();
    private static EliteKick kickBehaviour = new EliteKick();

    public King() {
        super(RANDOM_GENERATOR.nextInt(11)+5, RANDOM_GENERATOR.nextInt(11)+5);
    }

    @Override
    public void kick(Character chr) {
        kickBehaviour.kick(this, chr);
    }
}
