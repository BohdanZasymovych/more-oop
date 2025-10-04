package characters;
import strategies.HobbitKick;

public class Hobbit extends Character {
    private HobbitKick kickBehaviour = new HobbitKick();
    
    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character chr) {
        kickBehaviour.kick(this, chr);
    }
}
