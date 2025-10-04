package strategies;

import characters.Character;


public class HobbitKick implements KickStrategy {
    
    @Override
    public void kick(Character whoKiks, Character whoIsKicked) {
        System.out.println("whomp whomp");
    }
}
