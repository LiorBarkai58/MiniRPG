public class Player extends Monster {
    public Player(String name, double hp, double attack, int level) {
        super(name, hp, attack, level);
        setExp(0);
        setArmor(0);
    }
}
