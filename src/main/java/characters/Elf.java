package characters;
import strategies.ElfKick;

public class Elf extends Character {
    private ElfKick kickBehaviour = new ElfKick() ;

    public Elf() {
        super(10, 10);
    }

    public void kick(Character chr) {
        kickBehaviour.kick(this, chr);
    }
}
