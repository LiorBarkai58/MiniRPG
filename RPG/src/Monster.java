public class Monster {
    private int level;
    private String name;

    public double getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }

    private double maxHP;
    private double HP;
    private double attack;
    private double exp;
    private double armor;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getHP() { return HP; }

    public void setHP(double HP) { this.HP = HP; }

    public double getAttack() { return attack; }

    public void setAttack(double attack) { this.attack = attack; }

    public int getLevel() { return level; }

    public void setLevel(int level) { this.level = level; }

    double getExp() { return exp; }

    void setExp(double exp) { this.exp = exp; }

    double getArmor() { return armor; }

    void setArmor(double armor) {
        this.armor = armor;
    }

    Monster(String name, double hp, double attack, int level) {
        this.name = name;
        this.maxHP = hp;
        this.HP = maxHP;
        this.attack = attack;
        this.level = level;
        this.armor = level*5/3;
        this.exp = this.level*this.maxHP*this.attack;
    }





    void attack(Monster m1){
        m1.setHP(m1.getHP()- (attack > m1.getArmor()? attack-m1.getArmor() : 0));
        if (m1.getHP() <= 0){
            exp+= m1.getExp();
        }
    }
    Monster copy(){
        Monster copy = new Monster(this.name, this.HP, this.attack, this.level);
        return copy;
    }

    private void heal(double hp){ this.HP = HP+hp > maxHP ? maxHP : HP+hp; }

    @Override
    public String toString() {
        return name + "\n" +
                "Level: " + level +
                "\nHP: " + HP +
                "\nAttack: " + attack +
                "\nArmor: " + armor +
                "\nEXP: " + exp;
    }

}
