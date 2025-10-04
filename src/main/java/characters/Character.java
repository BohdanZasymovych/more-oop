package characters;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;

    public Character(int hp, int power) {
        setHp(hp);
        setPower(power);
    }

    public abstract void kick(Character chr); 

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString() {
        return String.format("%s{hp=%d, power=%d}", this.getClass().getSimpleName(), hp, power);
    }
}
