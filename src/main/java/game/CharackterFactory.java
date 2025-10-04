package game;

import java.util.Random;

import characters.Character;
import characters.Hobbit;
import characters.Elf;
import characters.King;
import characters.Knight;
import lombok.SneakyThrows;


public class CharackterFactory {
    @SuppressWarnings("unchecked")
    private static Class<? extends Character>[] characterClassesArray = new Class[] {Hobbit.class, Elf.class, King.class, Knight.class};
    private static Random randomGenerator = new Random();

    @SneakyThrows
    public Character createCharacter() {
        int index = randomGenerator.nextInt(characterClassesArray.length);
        Character randomCharacter = characterClassesArray[index].getDeclaredConstructor().newInstance();
        return randomCharacter;
    }
}
