package strategies;

public class ElfKick implements KickStrategy {
    public void kick(characters.Character whoKiks, characters.Character whoIsKicked) {
        if (whoKiks.getPower() > whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            whoKiks.setPower(whoKiks.getPower()-1);
        }
    }
}
