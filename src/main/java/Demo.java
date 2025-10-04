import game.CharackterFactory;
import game.GameManager;
import characters.Character;

public class Demo {
    private static CharackterFactory characterFactory = new CharackterFactory();
    private static GameManager gameManager = new GameManager();

    public static void main(String args[]) {
        Character c1 = characterFactory.createCharacter();
        System.out.println(c1.getClass().getSimpleName());
        Character c2 = characterFactory.createCharacter();
        System.out.println(c2.getClass().getSimpleName());
        System.out.println();
        gameManager.fight(c1, c2);
    }
}
